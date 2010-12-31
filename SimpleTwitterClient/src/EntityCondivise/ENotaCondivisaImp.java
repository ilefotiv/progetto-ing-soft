package EntityCondivise;

import TwitterSimpleClient.EntityCondivise.ENotaCondivisa;
import TwitterSimpleClient.EntityCondivise.EUtenteCondiviso;
import Ice.Current;

public class ENotaCondivisaImp extends ENotaCondivisa{

	
	public ENotaCondivisaImp()
    {
        super();
    }

    public ENotaCondivisaImp(int id, String content, long data, EUtenteCondiviso scrittaDa)
    {
        super(id,content,data,scrittaDa);
    }
    
	@Override
	public String getContent(Current current) {
		return this.content;
	}

	@Override
	public long getData(Current current) {
		// TODO Auto-generated method stub
		return this.data;
	}

	@Override
	public int getId(Current current) {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public EUtenteCondiviso getScrittaDa(Current current) {
		// TODO Auto-generated method stub
		return this.scrittaDa;
	}

	@Override
	public void setContent(String content, Current current) {
		// TODO Auto-generated method stub
		this.content=content;
	}

	@Override
	public void setData(long data, Current current) {
		this.data=data;
	}

	@Override
	public void setId(int id, Current current) {
		// TODO Auto-generated method stub
		this.id=id;
	}

	@Override
	public void setScrittaDa(EUtenteCondiviso untente, Current current) {
		// TODO Auto-generated method stub
		this.scrittaDa=untente;
	}

}
