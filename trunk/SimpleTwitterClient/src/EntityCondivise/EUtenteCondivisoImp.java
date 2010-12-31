package EntityCondivise;

import java.util.ArrayList;

import TwitterSimpleClient.EntityCondivise.EUtenteCondiviso;
import Ice.Current;

public class EUtenteCondivisoImp extends EUtenteCondiviso {
	
	 public EUtenteCondivisoImp()
    {
        super();
    }

    public EUtenteCondivisoImp(String username, String id, boolean connected, java.util.ArrayList<String> inseguitore, java.util.ArrayList<String> inseguito, java.util.ArrayList<String> autoreDi)
    {
        super(username,id,connected,inseguitore,inseguito,autoreDi);
    }
	@Override
	public ArrayList<String> getAutoreDi(Current current) {
		
		return this.autoreDi;
	}

	@Override
	public String getId(Current current) {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public ArrayList<String> getInseguito(Current current) {
		// TODO Auto-generated method stub
		return this.inseguito;
	}

	@Override
	public ArrayList<String> getInseguitore(Current current) {
		// TODO Auto-generated method stub
		return this.inseguitore;
	}

	@Override
	public String getUsername(Current current) {
		// TODO Auto-generated method stub
		return this.username;
	}

	@Override
	public boolean isConnected(Current current) {
		// TODO Auto-generated method stub
		return this.connected;
	}

	@Override
	public void setAutoreDi(ArrayList<String> autoreDi, Current current) {
		this.autoreDi=autoreDi;
	}

	@Override
	public void setConnetted(boolean connetted, Current current) {
		// TODO Auto-generated method stub
		 this.connected=connetted;
	}

	@Override
	public void setId(String id, Current current) {
		// TODO Auto-generated method stub
		this.id=id;
	}

	@Override
	public void setInseguito(ArrayList<String> inseguito, Current current) {
		this.inseguito=inseguito;		
	}

	@Override
	public void setInseguitore(ArrayList<String> inseguitore, Current current) {
		this.inseguitore=inseguitore;
	}

	@Override
	public void setUsername(String username, Current current) {
		this.username=username;
	}

}
