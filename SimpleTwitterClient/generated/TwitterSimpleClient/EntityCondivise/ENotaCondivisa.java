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

public abstract class ENotaCondivisa extends EntityCondivisa
                                     implements _ENotaCondivisaOperations,
                                                _ENotaCondivisaOperationsNC
{
    public ENotaCondivisa()
    {
        super();
    }

    public ENotaCondivisa(int id, String content, long data, EUtenteCondiviso scrittaDa)
    {
        this.id = id;
        this.content = content;
        this.data = data;
        this.scrittaDa = scrittaDa;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::TwitterSimpleClient::EntityCondivise::ENotaCondivisa",
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

    public final String
    getContent()
    {
        return getContent(null);
    }

    public final long
    getData()
    {
        return getData(null);
    }

    public final int
    getId()
    {
        return getId(null);
    }

    public final EUtenteCondiviso
    getScrittaDa()
    {
        return getScrittaDa(null);
    }

    public final void
    setContent(String content)
    {
        setContent(content, null);
    }

    public final void
    setData(long data)
    {
        setData(data, null);
    }

    public final void
    setId(int id)
    {
        setId(id, null);
    }

    public final void
    setScrittaDa(EUtenteCondiviso untente)
    {
        setScrittaDa(untente, null);
    }

    public static Ice.DispatchStatus
    ___setId(ENotaCondivisa __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int id;
        id = __is.readInt();
        __is.endReadEncaps();
        __obj.setId(id, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setContent(ENotaCondivisa __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String content;
        content = __is.readString();
        __is.endReadEncaps();
        __obj.setContent(content, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setData(ENotaCondivisa __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long data;
        data = __is.readLong();
        __is.endReadEncaps();
        __obj.setData(data, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setScrittaDa(ENotaCondivisa __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        EUtenteCondivisoHolder untente = new EUtenteCondivisoHolder();
        __is.readObject(untente.getPatcher());
        __is.readPendingObjects();
        __is.endReadEncaps();
        __obj.setScrittaDa(untente.value, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getScrittaDa(ENotaCondivisa __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        EUtenteCondiviso __ret = __obj.getScrittaDa(__current);
        __os.writeObject(__ret);
        __os.writePendingObjects();
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getId(ENotaCondivisa __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        int __ret = __obj.getId(__current);
        __os.writeInt(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getContent(ENotaCondivisa __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        String __ret = __obj.getContent(__current);
        __os.writeString(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getData(ENotaCondivisa __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long __ret = __obj.getData(__current);
        __os.writeLong(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    private final static String[] __all =
    {
        "getContent",
        "getData",
        "getId",
        "getScrittaDa",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "setContent",
        "setData",
        "setId",
        "setScrittaDa"
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
                return ___getContent(this, in, __current);
            }
            case 1:
            {
                return ___getData(this, in, __current);
            }
            case 2:
            {
                return ___getId(this, in, __current);
            }
            case 3:
            {
                return ___getScrittaDa(this, in, __current);
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
                return ___setContent(this, in, __current);
            }
            case 9:
            {
                return ___setData(this, in, __current);
            }
            case 10:
            {
                return ___setId(this, in, __current);
            }
            case 11:
            {
                return ___setScrittaDa(this, in, __current);
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
        __os.writeInt(id);
        __os.writeString(content);
        __os.writeLong(data);
        __os.writeObject(scrittaDa);
        __os.endWriteSlice();
        super.__write(__os);
    }

    private class Patcher implements IceInternal.Patcher
    {
        public void
        patch(Ice.Object v)
        {
            try
            {
                scrittaDa = (EUtenteCondiviso)v;
            }
            catch(ClassCastException ex)
            {
                IceInternal.Ex.throwUOE(type(), v.ice_id());
            }
        }

        public String
        type()
        {
            return "::TwitterSimpleClient::EntityCondivise::EUtenteCondiviso";
        }
    }

    public void
    __read(IceInternal.BasicStream __is, boolean __rid)
    {
        if(__rid)
        {
            __is.readTypeId();
        }
        __is.startReadSlice();
        id = __is.readInt();
        content = __is.readString();
        data = __is.readLong();
        __is.readObject(new Patcher());
        __is.endReadSlice();
        super.__read(__is, true);
    }

    public void
    __write(Ice.OutputStream __outS)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type TwitterSimpleClient::EntityCondivise::ENotaCondivisa was not generated with stream support";
        throw ex;
    }

    public void
    __read(Ice.InputStream __inS, boolean __rid)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type TwitterSimpleClient::EntityCondivise::ENotaCondivisa was not generated with stream support";
        throw ex;
    }

    public int id;

    public String content;

    public long data;

    public EUtenteCondiviso scrittaDa;
}
