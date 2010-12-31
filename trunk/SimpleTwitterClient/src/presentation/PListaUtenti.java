package presentation;


import java.util.ArrayList;

import interfacceCondivise.ProxieFactory;
import EntityCondivise.EUtenteCondivisoImp;
import SimpleTwitterClient.presentation.R;
import TwitterSimpleClient.EntityCondivise.EUtenteCondiviso;
import TwitterSimpleClient.InterfacceCondivise.utenteManagerPrx;
import android.app.Activity;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Handler.Callback;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PListaUtenti extends ListActivity implements Callback {
	
	private ProgressDialog pd;
	private Handler hand=new Handler(this);
	private ArrayList<EUtenteCondiviso> utenti=new ArrayList<EUtenteCondiviso>();
	private EUtenteCondiviso selected= null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.showGui();
		this.initListner();
		this.listUtenti();
		this.registerForContextMenu(this.getListView());
	}
	
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
	
	public void showGui()
	{
		this.setContentView(R.layout.listautenti);
	}
	
	public void initListner()
	{
		
	}
	public void listUtenti()
	{
		Runnable asyncronus = new Runnable() {
			
			@Override
			public void run() {
				utenteManagerPrx uManager=(utenteManagerPrx)ProxieFactory.factoryMethod("utenteManager", null, null, null);				
				utenti= uManager.getUtenti();
				boolean trovato=false;
				for(int i=0; i<utenti.size() && !trovato; i++)
				{
					if(utenti.get(i).getId().equals(SimpleTwitterClient.getUtente().getId()))
					{
						SimpleTwitterClient.setUtente((EUtenteCondivisoImp)utenti.get(i));
						trovato=true;
					}
				}
				Message m= new Message();
				Bundle data = new Bundle();
				data.putString("task", "getUtenti");
				m.setData(data);
				hand.sendMessage(m);
			}
		};
		this.pd=ProgressDialog.show(this, "Download...", "recupero la lista degli utenti", true,false);
		Thread t= new Thread(asyncronus);
		t.start();
	}
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu, v, menuInfo);
		Log.i("context", "menu");
		AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)menuInfo;
		LinearLayout ele=(LinearLayout) info.targetView;
		LinearLayout item=(LinearLayout) ele.getChildAt(0);
		String title=null;
		if(!(((TextView)item.findViewById(R.id.userId)).getText().equals(SimpleTwitterClient.getUtente().getId())))
		{
			// non sono io :D
			String id=((TextView)item.findViewById(R.id.userId)).getText().toString();
			EUtenteCondiviso user=null;
			boolean trovato=false;
			for(int i=0;i < this.utenti.size() && !trovato;i++)
			{
				if(this.utenti.get(i).getId().equals(id))
				{
					user=this.utenti.get(i);
					trovato=true;
				}
			}
			this.selected=user;
			if(((TextView)item.findViewById(R.id.userState)).getText().equals("1"))
			{
				Intent menuIntent = new Intent();
				Bundle b = new Bundle();
				menu.setHeaderTitle("Segui le note di "+user.getUsername());
				menu.add("Inizia a seguire i post di questo utente").setTitle("segui");
			}
			if(((TextView)item.findViewById(R.id.userState)).getText().equals("0"))
			{
				menu.setHeaderTitle("Smetti di seguire le note di "+user.getUsername());
				menu.add("Smetto di viusalizzare i post di questo utente").setTitle("smetti");
			}
		}else
		{
			menu.setHeaderTitle("Stai Scherzando!!?");
			menu.add("Non puoi seguire te stesso :D:D");
		}
	}
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		boolean result=super.onContextItemSelected(item);
		if(item.getTitle().equals("segui"))
		{
			this.seguiUtente(this.selected);
			this.selected=null;
			return true;
		}
		if(item.getTitle().equals("smetti"))
		{
			this.smetteDiSeguire(this.selected);
			this.selected=null;
			return true;
		}
		return result;
	}
	@Override
	public boolean handleMessage(Message msg) {
		if(msg.getData()!=null)
		{
			Bundle data= msg.getData();
			if(data.getString("task").equals("getUtenti"));
			{
				this.pd.dismiss();
				this.fillList();
			}
			if(data.getString("task").equals("addInseguitore"))
			{
				this.pd.dismiss();
				this.listUtenti();
			}
			if(data.getString("task").equals("removeInseguitore"))
			{
				this.pd.dismiss();
				this.listUtenti();
			}
		}
		return false;
	}
	public void fillList()
	{
		if(this.utenti.size()>0)
		{
			userAdapter adapter= new userAdapter(this, R.layout.utentilistitem,
										this.utenti);
			this.getListView().setAdapter(adapter);
		}else
		{
			Log.i("errore", "sono stati ritornati 0 utenti");
		}
	}
	public void seguiUtente(final EUtenteCondiviso user)
	{
		Runnable asyncronus = new Runnable() {
			
			@Override
			public void run() {
				utenteManagerPrx umagerprx= (utenteManagerPrx)ProxieFactory.factoryMethod("utenteManager", null, null, null);
				EUtenteCondiviso myUser=umagerprx.addInseguitore(SimpleTwitterClient.getUtente(), user);
				SimpleTwitterClient.setUtente((EUtenteCondivisoImp)myUser);
				Log.i("utente dopo la modifica","che seguo:"+myUser.getInseguitore().size());
				Log.i("utente dopo la modifica","che mi seguono:"+myUser.getInseguito().size());
				Message m= new Message();
				Bundle data = new Bundle();
				data.putString("task", "addInseguitore");
				m.setData(data);
				hand.sendMessage(m);
			}
		};
		this.pd=ProgressDialog.show(this, "Upload...", "aggiorno il tuo profilo", true,false);
		Thread t= new Thread(asyncronus);
		t.start(); 
		
	}
	public void smetteDiSeguire(final EUtenteCondiviso user)
	{
			Runnable asyncronus = new Runnable() {
			
			@Override
			public void run() {
				utenteManagerPrx umagerprx= (utenteManagerPrx)ProxieFactory.factoryMethod("utenteManager", null, null, null);
				EUtenteCondiviso myUser=umagerprx.removeInseguitore(SimpleTwitterClient.getUtente(), user);
				SimpleTwitterClient.setUtente((EUtenteCondivisoImp)myUser);
				Message m= new Message();
				Bundle data = new Bundle();
				data.putString("task", "removeInseguitore");
				m.setData(data);
				hand.sendMessage(m);
			}
		};
		this.pd=ProgressDialog.show(this, "Upload...", "aggiorno il tuo profilo", true,false);
		Thread t= new Thread(asyncronus);
		t.start(); 
	}
}
