module TwitterSimpleClient{
	module EntityCondivise{
		class ENotaCondivisa;
		class EUtenteCondiviso;
		class EntityCondivisa {};
		class ENotaCondivisa extends EntityCondivisa { 
		    int id;
		    string content;
		    long data; 
		    EUtenteCondiviso scrittaDa;    
		    void setId(int id);
		    void setContent(string content);
		    void setData(long data);
		    void setScrittaDa(EUtenteCondiviso untente);
		    EUtenteCondiviso getScrittaDa();
		    int  getId();
		    string getContent();
		    long getData();     
		};
		["java:type:java.util.ArrayList<String>:java.util.ArrayList<String>"] sequence<string> inseguitori;
		["java:type:java.util.ArrayList<String>:java.util.ArrayList<String>"] sequence<string> inseguiti;
		["java:type:java.util.ArrayList<String>:java.util.ArrayList<String>"] sequence<string> lavori;
		["java:type:java.util.ArrayList<TwitterSimpleClient.EntityCondivise.ENotaCondivisa>:java.util.ArrayList<TwitterSimpleClient.EntityCondivise.ENotaCondivisa>"] sequence<::TwitterSimpleClient::EntityCondivise::ENotaCondivisa> listaNote;
		["java:type:java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso>:java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso>"] sequence<::TwitterSimpleClient::EntityCondivise::EUtenteCondiviso> listaUtenti;
		class EUtenteCondiviso extends EntityCondivisa{ 
		    string username;
		    string id;
		    bool connected;
		    inseguitori inseguitore;
		    inseguiti inseguito; 
		    lavori autoreDi;     
		    void setId(string id);
		    void setUsername(string username);
		    void setConnetted(bool connetted);
		    void setInseguitore(inseguitori inseguitore);
		    void setInseguito(inseguiti inseguito);
		    void setAutoreDi(lavori autoreDi);
		    string  getId();
		    string getUsername();
		    bool isConnected();
		    inseguitori getInseguitore();
		    inseguiti getInseguito();
		    lavori   getAutoreDi();     
		};
	};
	module InterfacceCondivise {
		
		interface Authtentication{
			::TwitterSimpleClient::EntityCondivise::EUtenteCondiviso logIn(string Imei);
			bool keepAlive(string Imei); 
		};
		interface noteManager{
			::TwitterSimpleClient::EntityCondivise::listaNote getListaNote(::TwitterSimpleClient::EntityCondivise::EUtenteCondiviso utente);
			::TwitterSimpleClient::EntityCondivise::ENotaCondivisa getNotaById(string id);
			void addNota(::TwitterSimpleClient::EntityCondivise::ENotaCondivisa nota);
		};
		interface utenteManager{
			bool updateUtente(::TwitterSimpleClient::EntityCondivise::EUtenteCondiviso utente);
			::TwitterSimpleClient::EntityCondivise::listaUtenti getUtenti();
			::TwitterSimpleClient::EntityCondivise::listaUtenti getInseguitore(::TwitterSimpleClient::EntityCondivise::EUtenteCondiviso utente);
			::TwitterSimpleClient::EntityCondivise::listaUtenti getInseguito(::TwitterSimpleClient::EntityCondivise::EUtenteCondiviso utente);
			::TwitterSimpleClient::EntityCondivise::EUtenteCondiviso addInseguitore(::TwitterSimpleClient::EntityCondivise::EUtenteCondiviso utente,::TwitterSimpleClient::EntityCondivise::EUtenteCondiviso inseguitore);
			::TwitterSimpleClient::EntityCondivise::EUtenteCondiviso removeInseguitore(::TwitterSimpleClient::EntityCondivise::EUtenteCondiviso utente,::TwitterSimpleClient::EntityCondivise::EUtenteCondiviso inseguitore); 
		};
	};
};