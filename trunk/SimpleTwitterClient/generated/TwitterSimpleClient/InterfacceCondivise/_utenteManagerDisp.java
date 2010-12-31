// **********************************************************************
//
// Copyright (c) 2003-2009 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.3.1

package TwitterSimpleClient.InterfacceCondivise;

public abstract class _utenteManagerDisp extends Ice.ObjectImpl implements utenteManager
{
    protected void
    ice_copyStateFrom(Ice.Object __obj)
        throws java.lang.CloneNotSupportedException
    {
        throw new java.lang.CloneNotSupportedException();
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::TwitterSimpleClient::InterfacceCondivise::utenteManager"
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

    public final TwitterSimpleClient.EntityCondivise.EUtenteCondiviso
    addInseguitore(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, TwitterSimpleClient.EntityCondivise.EUtenteCondiviso inseguitore)
    {
        return addInseguitore(utente, inseguitore, null);
    }

    public final java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso>
    getInseguito(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente)
    {
        return getInseguito(utente, null);
    }

    public final java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso>
    getInseguitore(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente)
    {
        return getInseguitore(utente, null);
    }

    public final java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso>
    getUtenti()
    {
        return getUtenti(null);
    }

    public final TwitterSimpleClient.EntityCondivise.EUtenteCondiviso
    removeInseguitore(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, TwitterSimpleClient.EntityCondivise.EUtenteCondiviso inseguitore)
    {
        return removeInseguitore(utente, inseguitore, null);
    }

    public final boolean
    updateUtente(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente)
    {
        return updateUtente(utente, null);
    }

    public static Ice.DispatchStatus
    ___updateUtente(utenteManager __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TwitterSimpleClient.EntityCondivise.EUtenteCondivisoHolder utente = new TwitterSimpleClient.EntityCondivise.EUtenteCondivisoHolder();
        __is.readObject(utente.getPatcher());
        __is.readPendingObjects();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        boolean __ret = __obj.updateUtente(utente.value, __current);
        __os.writeBool(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getUtenti(utenteManager __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso> __ret = __obj.getUtenti(__current);
        TwitterSimpleClient.EntityCondivise.listaUtentiHelper.write(__os, __ret);
        __os.writePendingObjects();
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getInseguitore(utenteManager __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TwitterSimpleClient.EntityCondivise.EUtenteCondivisoHolder utente = new TwitterSimpleClient.EntityCondivise.EUtenteCondivisoHolder();
        __is.readObject(utente.getPatcher());
        __is.readPendingObjects();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso> __ret = __obj.getInseguitore(utente.value, __current);
        TwitterSimpleClient.EntityCondivise.listaUtentiHelper.write(__os, __ret);
        __os.writePendingObjects();
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getInseguito(utenteManager __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TwitterSimpleClient.EntityCondivise.EUtenteCondivisoHolder utente = new TwitterSimpleClient.EntityCondivise.EUtenteCondivisoHolder();
        __is.readObject(utente.getPatcher());
        __is.readPendingObjects();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso> __ret = __obj.getInseguito(utente.value, __current);
        TwitterSimpleClient.EntityCondivise.listaUtentiHelper.write(__os, __ret);
        __os.writePendingObjects();
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addInseguitore(utenteManager __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TwitterSimpleClient.EntityCondivise.EUtenteCondivisoHolder utente = new TwitterSimpleClient.EntityCondivise.EUtenteCondivisoHolder();
        __is.readObject(utente.getPatcher());
        TwitterSimpleClient.EntityCondivise.EUtenteCondivisoHolder inseguitore = new TwitterSimpleClient.EntityCondivise.EUtenteCondivisoHolder();
        __is.readObject(inseguitore.getPatcher());
        __is.readPendingObjects();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        TwitterSimpleClient.EntityCondivise.EUtenteCondiviso __ret = __obj.addInseguitore(utente.value, inseguitore.value, __current);
        __os.writeObject(__ret);
        __os.writePendingObjects();
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___removeInseguitore(utenteManager __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TwitterSimpleClient.EntityCondivise.EUtenteCondivisoHolder utente = new TwitterSimpleClient.EntityCondivise.EUtenteCondivisoHolder();
        __is.readObject(utente.getPatcher());
        TwitterSimpleClient.EntityCondivise.EUtenteCondivisoHolder inseguitore = new TwitterSimpleClient.EntityCondivise.EUtenteCondivisoHolder();
        __is.readObject(inseguitore.getPatcher());
        __is.readPendingObjects();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        TwitterSimpleClient.EntityCondivise.EUtenteCondiviso __ret = __obj.removeInseguitore(utente.value, inseguitore.value, __current);
        __os.writeObject(__ret);
        __os.writePendingObjects();
        return Ice.DispatchStatus.DispatchOK;
    }

    private final static String[] __all =
    {
        "addInseguitore",
        "getInseguito",
        "getInseguitore",
        "getUtenti",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "removeInseguitore",
        "updateUtente"
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
                return ___addInseguitore(this, in, __current);
            }
            case 1:
            {
                return ___getInseguito(this, in, __current);
            }
            case 2:
            {
                return ___getInseguitore(this, in, __current);
            }
            case 3:
            {
                return ___getUtenti(this, in, __current);
            }
            case 4:
            {
                return ___ice_id(this, in, __current);
            }
            case 5:
            {
                return ___ice_ids(this, in, __current);
            }
            case 6:
            {
                return ___ice_isA(this, in, __current);
            }
            case 7:
            {
                return ___ice_ping(this, in, __current);
            }
            case 8:
            {
                return ___removeInseguitore(this, in, __current);
            }
            case 9:
            {
                return ___updateUtente(this, in, __current);
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
        __is.endReadSlice();
        super.__read(__is, true);
    }

    public void
    __write(Ice.OutputStream __outS)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type TwitterSimpleClient::InterfacceCondivise::utenteManager was not generated with stream support";
        throw ex;
    }

    public void
    __read(Ice.InputStream __inS, boolean __rid)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type TwitterSimpleClient::InterfacceCondivise::utenteManager was not generated with stream support";
        throw ex;
    }
}
