package presentation;


import interfacceCondivise.ProxieFactory;
import SimpleTwitterClient.presentation.R;
import TwitterSimpleClient.InterfacceCondivise.utenteManagerPrx;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Handler.Callback;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class PImpostazioni extends Activity implements OnClickListener, Callback{
	private ProgressDialog pd;
	private Handler hand=new Handler(this);
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.showGui();
		this.initListner();
	}
	public void showGui()
	{
		setContentView(R.layout.impostazioni);
		String cause=null;
		Bundle sBundle=this.getIntent().getExtras();
		if(sBundle!=null)
		{
			cause= sBundle.getString("cause");
			if(cause.equals("conError"))
			{
				EditText t=((EditText)findViewById(R.id.userNameEdit));
				t.setVisibility(View.GONE);
				((TextView)findViewById(R.id.usernameTextId)).setVisibility(View.GONE);
				
				SharedPreferences pref=getSharedPreferences("impostazioni",  MODE_PRIVATE);
				((EditText)findViewById(R.id.serverIpEdit)).setText(pref.getString("host", "192.168.0.103"));
				((EditText)findViewById(R.id.serverPortaEdit)).setText(pref.getString("port", "10400"));
			}
		}
		if(cause.equals("impostazione"))
		{
			SharedPreferences pref=getSharedPreferences("impostazioni",  MODE_PRIVATE);
			((EditText)findViewById(R.id.serverIpEdit)).setText(pref.getString("host", "192.168.0.103"));
			((EditText)findViewById(R.id.serverPortaEdit)).setText(pref.getString("port", "10400"));
			((EditText)findViewById(R.id.userNameEdit)).setText(SimpleTwitterClient.getUtente().getUsername());
		}	
	}
	public void initListner()
	{
		((ImageButton)findViewById(R.id.savePrefButton)).setOnClickListener(this);
		((ImageButton)findViewById(R.id.cancelPref)).setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		if(v.getTag().equals("save"))
		{
			this.saveLocalPref();
			if(!this.getIntent().getExtras().getString("cause").equals("conError"))
			{
				this.saveRemotePref();
			}
			this.finish();
		}
		if(v.getTag().equals("cancel"))
		{
				this.finish();
		}
	}
	public void saveLocalPref()
	{
		SharedPreferences pref= getSharedPreferences("impostazioni", MODE_PRIVATE);
		pref.edit().putString("host",((EditText)findViewById(R.id.serverIpEdit)).getText().toString().trim()).commit();
		pref.edit().putString("port",((EditText)findViewById(R.id.serverPortaEdit)).getText().toString().trim()).commit();
		Log.i("host", pref.getString("host", "192.168.0.103"));
		Log.i("port", pref.getString("port", "10400"));
		ProxieFactory.setHost(pref.getString("host", "192.168.0.103"));
		ProxieFactory.setPort(pref.getString("port", "10400"));
	}
	public void saveRemotePref()
	{
			Runnable asyncronus = new Runnable() {
			
			@Override
			public void run() {
				String username=((EditText)findViewById(R.id.userNameEdit)).getText().toString();
				SimpleTwitterClient.getUtente().setUsername(username);
				utenteManagerPrx uMprx= (utenteManagerPrx) ProxieFactory.factoryMethod("utenteManager", null, null, null);
				boolean result=uMprx.updateUtente(SimpleTwitterClient.getUtente());
				Bundle data= new Bundle();
			    Message m= new Message();
			    data.putBoolean("result", result);
			    data.putString("task", "aggiunta");
			    m.setData(data);
			    hand.sendMessage(m);
			}
		};
		this.pd= ProgressDialog.show(this, "Salvataggio..", "Aggiornamento del profilo in corso", true,false);
		Thread update = new Thread(asyncronus);
		update.start();
	}
	@Override
	public boolean handleMessage(Message msg) {
		if(msg.getData()!=null)
		{
			Bundle data= msg.getData();
			String task=data.getString("task");
			if(task.equals("aggiunta"))
			{
				this.pd.dismiss();
				boolean result= data.getBoolean("result");
				if(result)
				{
					SimpleTwitterClient.getInstance().Toast("profilo aggiornato con successo", 500);
				}else
				{
					SimpleTwitterClient.getInstance().Toast("errori durante l'aggiornamento del profilo", 500);
				}
			}
		}
		return false;
	}
}
