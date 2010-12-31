package presentation;

import java.util.ArrayList;
import java.util.Date;



import interfacceCondivise.ProxieFactory;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import EntityCondivise.ENotaCondivisaImp;
import EntityCondivise.EUtenteCondivisoImp;
import SimpleTwitterClient.presentation.R;
import TwitterSimpleClient.EntityCondivise.*;
import TwitterSimpleClient.InterfacceCondivise.AuthtenticationPrx;
import TwitterSimpleClient.InterfacceCondivise.noteManagerPrx;

public class PListaNote extends ListActivity implements android.os.Handler.Callback, OnClickListener  {
	
	private ProgressDialog pd;
	private Handler hand=new Handler(this);
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.showGui();
		this.initListner();
		this.login();
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		//SimpleTwitterClient.getInstance().Toast("OnResume", 500);
		this.login();
		
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
	
	public void showGui()
	{
		this.setContentView(R.layout.listanote); 
	} 
	public void initListner()
	{
		ImageButton add= (ImageButton)findViewById(R.id.newNotaButton);
		add.setTag("add");
		add.setOnClickListener(this);
	}
	public ArrayList<ENotaCondivisa> getListaNote()
	{
		ArrayList<ENotaCondivisa> noteUtente=null;
		noteManagerPrx note= (noteManagerPrx) ProxieFactory.factoryMethod("noteManager",null, null, null);
		noteUtente=note.getListaNote(SimpleTwitterClient.getUtente());
		return noteUtente;
	}
	public void addNota()
	{
		Runnable asyncronus = new Runnable() {
			
			@Override
			public void run() {
				noteManagerPrx note= (noteManagerPrx) ProxieFactory.factoryMethod("noteManager",null, null, null);
				ENotaCondivisa nota= new ENotaCondivisaImp();
				EditText text= (EditText)findViewById(R.id.newNotaContent);
				nota.setContent(text.getText().toString());
				Log.i("verifica utente", SimpleTwitterClient.getUtente().getId());
				nota.setScrittaDa((EUtenteCondiviso)SimpleTwitterClient.getUtente());
				Date today = new Date();
				nota.setData(today.getTime());
				note.addNota(nota);
				Bundle data= new Bundle();
			    Message m= new Message();
			    data.putString("task","addNota");
			    m.setData(data);
			    hand.sendMessage(m);
			}
		};
		this.pd = ProgressDialog.show(this, "Aggiungi..", "Aggiunta nota in corso..", true,false);
		Thread addThread= new Thread(asyncronus);
		addThread.start();
	}
	public void login()
	{
		Runnable asyncronus = new Runnable() {
			@Override
			public void run() {
				AuthtenticationPrx auth= (AuthtenticationPrx)ProxieFactory.factoryMethod("Authenticator", null, null, null);
				String deviceID = null;
			    String serviceName = Context.TELEPHONY_SERVICE;
			    TelephonyManager m_telephonyManager = (TelephonyManager) getSystemService(serviceName);
			    deviceID = m_telephonyManager.getDeviceId();
			    Bundle data= new Bundle();
			    Message m= new Message();
			    if(auth!=null)
			    {
			    	EUtenteCondivisoImp utente=(EUtenteCondivisoImp)auth.logIn(deviceID);
			    	SimpleTwitterClient.setUtente(utente);
			    	Log.i("verifica utente dopo il login", "numero di persone che seguo :"+utente.getInseguitore().size());
			    	for(int i=0;i<utente.getInseguitore().size(); i++)
			    	{
			    		Log.i("verifica utente dopo il login", "seguo :"+utente.getInseguitore().get(i));
			    	}
			    	Log.i("verifica utente dopo il login", "numero di persone che mi seguono:"+utente.getInseguito().size());
			    	data.putCharSequence("task", "login");
			    	m.setData(data);
			    	hand.sendMessage(m);
			    }else
			    {
			    	data.putCharSequence("task", "setImpostazioni");
			    	m.setData(data);
			    	hand.sendMessage(m);
			    }
			}
		};
		Thread loginThread = new Thread(asyncronus);
		this.pd = ProgressDialog.show(this, "Connessione..", "Connessione al server in corso", true,false);
		loginThread.start();
	}
	
	
	@Override
	public boolean handleMessage(Message msg) {
		
		if(msg.getData().getString("task").equals("login"))
		{
			this.pd.dismiss();
			this.fillList();
		}
		if(msg.getData().getString("task").equals("setImpostazioni"))
		{
			this.pd.dismiss();
			SimpleTwitterClient.getInstance().Toast("errore di connessione al server" +
											 " verificare le impostazioni di connessione", 1000);
			Intent i= new Intent(this,PImpostazioni.class); 
			i.putExtra("cause", "conError");
			startActivity(i);
		}
		if(msg.getData().getString("task").equals("addNota"))
		{
			this.pd.dismiss();
			SimpleTwitterClient.getInstance().Toast("Nota Aggiunta Con successo", 500);
			((EditText)findViewById(R.id.newNotaContent)).setText("");
			this.fillList();
		}
		return false;
	}
	public void fillList()
	{
		this.setTitle("SimpleTwitterClient"+" >> "+SimpleTwitterClient.getUtente().getUsername());
		ArrayList<ENotaCondivisa> noteUtente=this.getListaNote();
		String[] contenuto= new String[noteUtente.size()];
		if(noteUtente.size()>0)
		{
			elementWithIdAdapter adapter= new elementWithIdAdapter(this,
						R.layout.notalistitem, noteUtente);
			this.getListView().setAdapter(adapter);
		}else
		{
			ArrayAdapter<String> contenutoNota=null;
			Log.i("debug","ci sono 0 note");
			contenutoNota=new ArrayAdapter<String>(this,
					R.layout.notaitem,
					R.id.listItem,
					new String[]{"Non ci sono note inseriscine subito una ed inizia a sguire i tuoi amici"});
			this.getListView().setAdapter(contenutoNota);
		}
		
		this.getListView().requestFocus();
	}
	@Override
	public void onClick(View v) {
		if(v.getTag().equals("add"))
		{
			Log.i("nota", "aggiungi Nota");
			this.addNota();
		}
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater in=getMenuInflater();
		in.inflate(R.menu.listacontattimenuopt, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		boolean result=super.onOptionsItemSelected(item);
		if(item.getTitle().equals("Amici"))
		{
			Intent i = new Intent(this, PListaUtenti.class);
			this.startActivity(i);
		}
		if(item.getTitle().equals("Impostazioni"))
		{
			Intent i= new Intent(this,PImpostazioni.class);
			i.putExtra("cause", "impostazione");
			startActivity(i);
		}
		if(item.getTitle().equals("Aggiorna"))
		{
			this.fillList();
		}
		return result;
	}
}
