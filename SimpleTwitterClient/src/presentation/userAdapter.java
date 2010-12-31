package presentation;

import java.util.Date;
import java.util.List;

import EntityCondivise.ENotaCondivisaImp;
import TwitterSimpleClient.EntityCondivise.ENotaCondivisa;
import TwitterSimpleClient.EntityCondivise.EUtenteCondiviso;
import SimpleTwitterClient.presentation.R;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class userAdapter extends ArrayAdapter<EUtenteCondiviso> {

	int resourceid;
	public userAdapter(Context context, int textViewResourceId,List<EUtenteCondiviso> objects) {
		super(context, textViewResourceId, objects);
		this.resourceid= textViewResourceId;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		LinearLayout  newView;
		EUtenteCondiviso  classInstance  =  getItem(position);
		System.out.println("anliszzo l'utente"+classInstance.getId());
		if  (convertView  ==  null)  {
		newView  =  new  LinearLayout(getContext());
		String  inflater  =  Context.LAYOUT_INFLATER_SERVICE;
		LayoutInflater  vi  =  (LayoutInflater)getContext().getSystemService(inflater);
		vi.inflate(this.resourceid,  newView,  true);
		}  else  {
		newView  =  (LinearLayout)convertView;
		}
		LinearLayout layout=(LinearLayout)newView.getChildAt(0);
		/*TextView text =(TextView)((LinearLayout)layout.getChildAt(0)).getChildAt(1);
		TextView username=(TextView)((LinearLayout)layout.getChildAt(1)).getChildAt(1);
		TextView data=(TextView)((LinearLayout)layout.getChildAt(2)).getChildAt(1);
		text.setText(classInstance.getContent());
		username.setText(classInstance.getScrittaDa().getUsername());
		Date date = new Date(classInstance.getData());
		data.setText(date.toLocaleString());*/
		TextView user= (TextView)layout.findViewById(R.id.usernameId);
		TextView id= (TextView) layout.findViewById(R.id.userId);
		user.setText(classInstance.getUsername());
		id.setText(classInstance.getId());
		EUtenteCondiviso Iam=SimpleTwitterClient.getUtente();
		((ImageView)layout.findViewById(R.id.seguitoIcon)).setVisibility(View.GONE);
		((ImageView)layout.findViewById(R.id.miSegueIcon)).setVisibility(View.GONE);
		((ImageView)layout.findViewById(R.id.iAmIcon)).setVisibility(View.GONE);
		
		if(classInstance.getId().equals(Iam.getId()))
		{
			 Log.i("trovato me stesso", classInstance.getId());
			((ImageView)layout.findViewById(R.id.seguitoIcon)).setVisibility(View.GONE);
			((ImageView)layout.findViewById(R.id.miSegueIcon)).setVisibility(View.GONE);
			((ImageView)layout.findViewById(R.id.iAmIcon)).setVisibility(View.VISIBLE);
			
		}else
		{
			if(Iam.getInseguitore().contains(classInstance.getId()))
			{
				// gia lo seguo
				 Log.i("trovata una persana che seguo", classInstance.getId());
				((ImageView)layout.findViewById(R.id.seguitoIcon)).setVisibility(View.VISIBLE);
				((ImageView)layout.findViewById(R.id.iAmIcon)).setVisibility(View.GONE);
				((TextView)layout.findViewById(R.id.userState)).setText("0");
			}else
			{
				((TextView)layout.findViewById(R.id.userState)).setText("1");
			}
			if(Iam.getInseguito().contains(classInstance.getId()))
			{
				 Log.i("trovata una persana che mi segue", classInstance.getId());
				((ImageView)layout.findViewById(R.id.miSegueIcon)).setVisibility(View.VISIBLE);
				((ImageView)layout.findViewById(R.id.iAmIcon)).setVisibility(View.GONE);
			}
		}
		
		return  newView;
	 }
	
}
