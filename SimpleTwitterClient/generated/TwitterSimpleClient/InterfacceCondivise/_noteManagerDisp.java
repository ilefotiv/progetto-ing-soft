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

public abstract class _noteManagerDisp extends Ice.ObjectImpl implements noteManager
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
        "::TwitterSimpleClient::InterfacceCondivise::noteManager"
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

    public final void
    addNota(TwitterSimpleClient.EntityCondivise.ENotaCondivisa nota)
    {
        addNota(nota, null);
    }

    public final java.util.ArrayList<TwitterSimpleClient.EntityCondivise.ENotaCondivisa>
    getListaNote(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente)
    {
        return getListaNote(utente, null);
    }

    public final TwitterSimpleClient.EntityCondivise.ENotaCondivisa
    getNotaById(String id)
    {
        return getNotaById(id, null);
    }

    public static Ice.DispatchStatus
    ___getListaNote(noteManager __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TwitterSimpleClient.EntityCondivise.EUtenteCondivisoHolder utente = new TwitterSimpleClient.EntityCondivise.EUtenteCondivisoHolder();
        __is.readObject(utente.getPatcher());
        __is.readPendingObjects();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        java.util.ArrayList<TwitterSimpleClient.EntityCondivise.ENotaCondivisa> __ret = __obj.getListaNote(utente.value, __current);
        TwitterSimpleClient.EntityCondivise.listaNoteHelper.write(__os, __ret);
        __os.writePendingObjects();
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getNotaById(noteManager __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String id;
        id = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        TwitterSimpleClient.EntityCondivise.ENotaCondivisa __ret = __obj.getNotaById(id, __current);
        __os.writeObject(__ret);
        __os.writePendingObjects();
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___addNota(noteManager __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TwitterSimpleClient.EntityCondivise.ENotaCondivisaHolder nota = new TwitterSimpleClient.EntityCondivise.ENotaCondivisaHolder();
        __is.readObject(nota.getPatcher());
        __is.readPendingObjects();
        __is.endReadEncaps();
        __obj.addNota(nota.value, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    private final static String[] __all =
    {
        "addNota",
        "getListaNote",
        "getNotaById",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping"
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
                return ___addNota(this, in, __current);
            }
            case 1:
            {
                return ___getListaNote(this, in, __current);
            }
            case 2:
            {
                return ___getNotaById(this, in, __current);
            }
            case 3:
            {
                return ___ice_id(this, in, __current);
            }
            case 4:
            {
                return ___ice_ids(this, in, __current);
            }
            case 5:
            {
                return ___ice_isA(this, in, __current);
            }
            case 6:
            {
                return ___ice_ping(this, in, __current);
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
        ex.reason = "type TwitterSimpleClient::InterfacceCondivise::noteManager was not generated with stream support";
        throw ex;
    }

    public void
    __read(Ice.InputStream __inS, boolean __rid)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type TwitterSimpleClient::InterfacceCondivise::noteManager was not generated with stream support";
        throw ex;
    }
}
