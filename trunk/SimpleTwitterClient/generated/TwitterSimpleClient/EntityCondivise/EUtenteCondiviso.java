// **********************************************************************
//
// Copyright (c) 2003-2009 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.3.1

package TwitterSimpleClient.EntityCondivise;

public abstract class EUtenteCondiviso extends EntityCondivisa
                                       implements _EUtenteCondivisoOperations,
                                                  _EUtenteCondivisoOperationsNC
{
    public EUtenteCondiviso()
    {
        super();
    }

    public EUtenteCondiviso(String username, String id, boolean connected, java.util.ArrayList<String> inseguitore, java.util.ArrayList<String> inseguito, java.util.ArrayList<String> autoreDi)
    {
        this.username = username;
        this.id = id;
        this.connected = connected;
        this.inseguitore = inseguitore;
        this.inseguito = inseguito;
        this.autoreDi = autoreDi;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::TwitterSimpleClient::EntityCondivise::EUtenteCondiviso",
        "::TwitterSimpleClient::EntityCondivise::EntityCondivisa"
    };

    public boolean
    ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean
    ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[]
    ice_ids()
    {
        return __ids;
    }

    public String[]
    ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String
    ice_id()
    {
        return __ids[1];
    }

    public String
    ice_id(Ice.Current __current)
    {
        return __ids[1];
    }

    public static String
    ice_staticId()
    {
        return __ids[1];
    }

    public final java.util.ArrayList<String>
    getAutoreDi()
    {
        return getAutoreDi(null);
    }

    public final String
    getId()
    {
        return getId(null);
    }

    public final java.util.ArrayList<String>
    getInseguito()
    {
        return getInseguito(null);
    }

    public final java.util.ArrayList<String>
    getInseguitore()
    {
        return getInseguitore(null);
    }

    public final String
    getUsername()
    {
        return getUsername(null);
    }

    public final boolean
    isConnected()
    {
        return isConnected(null);
    }

    public final void
    setAutoreDi(java.util.ArrayList<String> autoreDi)
    {
        setAutoreDi(autoreDi, null);
    }

    public final void
    setConnetted(boolean connetted)
    {
        setConnetted(connetted, null);
    }

    public final void
    setId(String id)
    {
        setId(id, null);
    }

    public final void
    setInseguito(java.util.ArrayList<String> inseguito)
    {
        setInseguito(inseguito, null);
    }

    public final void
    setInseguitore(java.util.ArrayList<String> inseguitore)
    {
        setInseguitore(inseguitore, null);
    }

    public final void
    setUsername(String username)
    {
        setUsername(username, null);
    }

    public static Ice.DispatchStatus
    ___setId(EUtenteCondiviso __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String id;
        id = __is.readString();
        __is.endReadEncaps();
        __obj.setId(id, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setUsername(EUtenteCondiviso __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String username;
        username = __is.readString();
        __is.endReadEncaps();
        __obj.setUsername(username, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setConnetted(EUtenteCondiviso __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        boolean connetted;
        connetted = __is.readBool();
        __is.endReadEncaps();
        __obj.setConnetted(connetted, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setInseguitore(EUtenteCondiviso __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        java.util.ArrayList<String> inseguitore;
        inseguitore = inseguitoriHelper.read(__is);
        __is.endReadEncaps();
        __obj.setInseguitore(inseguitore, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setInseguito(EUtenteCondiviso __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        java.util.ArrayList<String> inseguito;
        inseguito = inseguitiHelper.read(__is);
        __is.endReadEncaps();
        __obj.setInseguito(inseguito, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setAutoreDi(EUtenteCondiviso __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        java.util.ArrayList<String> autoreDi;
        autoreDi = lavoriHelper.read(__is);
        __is.endReadEncaps();
        __obj.setAutoreDi(autoreDi, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getId(EUtenteCondiviso __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        String __ret = __obj.getId(__current);
        __os.writeString(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getUsername(EUtenteCondiviso __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        String __ret = __obj.getUsername(__current);
        __os.writeString(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___isConnected(EUtenteCondiviso __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        boolean __ret = __obj.isConnected(__current);
        __os.writeBool(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getInseguitore(EUtenteCondiviso __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        java.util.ArrayList<String> __ret = __obj.getInseguitore(__current);
        inseguitoriHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getInseguito(EUtenteCondiviso __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        java.util.ArrayList<String> __ret = __obj.getInseguito(__current);
        inseguitiHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getAutoreDi(EUtenteCondiviso __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        java.util.ArrayList<String> __ret = __obj.getAutoreDi(__current);
        lavoriHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    private final static String[] __all =
    {
        "getAutoreDi",
        "getId",
        "getInseguito",
        "getInseguitore",
        "getUsername",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "isConnected",
        "setAutoreDi",
        "setConnetted",
        "setId",
        "setInseguito",
        "setInseguitore",
        "setUsername"
    };

    public Ice.DispatchStatus
    __dispatch(IceInternal.Incoming in, Ice.Current __current)
    {
        int pos = java.util.Arrays.binarySearch(__all, __current.operation);
        if(pos < 0)
        {
            throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return ___getAutoreDi(this, in, __current);
            }
            case 1:
            {
                return ___getId(this, in, __current);
            }
            case 2:
            {
                return ___getInseguito(this, in, __current);
            }
            case 3:
            {
                return ___getInseguitore(this, in, __current);
            }
            case 4:
            {
                return ___getUsername(this, in, __current);
            }
            case 5:
            {
                return ___ice_id(this, in, __current);
            }
            case 6:
            {
                return ___ice_ids(this, in, __current);
            }
            case 7:
            {
                return ___ice_isA(this, in, __current);
            }
            case 8:
            {
                return ___ice_ping(this, in, __current);
            }
            case 9:
            {
                return ___isConnected(this, in, __current);
            }
            case 10:
            {
                return ___setAutoreDi(this, in, __current);
            }
            case 11:
            {
                return ___setConnetted(this, in, __current);
            }
            case 12:
            {
                return ___setId(this, in, __current);
            }
            case 13:
            {
                return ___setInseguito(this, in, __current);
            }
            case 14:
            {
                return ___setInseguitore(this, in, __current);
            }
            case 15:
            {
                return ___setUsername(this, in, __current);
            }
        }

        assert(false);
        throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeTypeId(ice_staticId());
        __os.startWriteSlice();
        __os.writeString(username);
        __os.writeString(id);
        __os.writeBool(connected);
        inseguitoriHelper.write(__os, inseguitore);
        inseguitiHelper.write(__os, inseguito);
        lavoriHelper.write(__os, autoreDi);
        __os.endWriteSlice();
        super.__write(__os);
    }

    public void
    __read(IceInternal.BasicStream __is, boolean __rid)
    {
        if(__rid)
        {
            __is.readTypeId();
        }
        __is.startReadSlice();
        username = __is.readString();
        id = __is.readString();
        connected = __is.readBool();
        inseguitore = inseguitoriHelper.read(__is);
        inseguito = inseguitiHelper.read(__is);
        autoreDi = lavoriHelper.read(__is);
        __is.endReadSlice();
        super.__read(__is, true);
    }

    public void
    __write(Ice.OutputStream __outS)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type TwitterSimpleClient::EntityCondivise::EUtenteCondiviso was not generated with stream support";
        throw ex;
    }

    public void
    __read(Ice.InputStream __inS, boolean __rid)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type TwitterSimpleClient::EntityCondivise::EUtenteCondiviso was not generated with stream support";
        throw ex;
    }

    public String username;

    public String id;

    public boolean connected;

    public java.util.ArrayList<String> inseguitore;

    public java.util.ArrayList<String> inseguito;

    public java.util.ArrayList<String> autoreDi;
}
