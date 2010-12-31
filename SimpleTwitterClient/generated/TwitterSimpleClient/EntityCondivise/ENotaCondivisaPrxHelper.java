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

public final class ENotaCondivisaPrxHelper extends Ice.ObjectPrxHelperBase implements ENotaCondivisaPrx
{
    public String
    getContent()
    {
        return getContent(null, false);
    }

    public String
    getContent(java.util.Map<String, String> __ctx)
    {
        return getContent(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String
    getContent(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getContent");
                __delBase = __getDelegate(false);
                _ENotaCondivisaDel __del = (_ENotaCondivisaDel)__delBase;
                return __del.getContent(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex, null);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    public long
    getData()
    {
        return getData(null, false);
    }

    public long
    getData(java.util.Map<String, String> __ctx)
    {
        return getData(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private long
    getData(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getData");
                __delBase = __getDelegate(false);
                _ENotaCondivisaDel __del = (_ENotaCondivisaDel)__delBase;
                return __del.getData(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex, null);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    public int
    getId()
    {
        return getId(null, false);
    }

    public int
    getId(java.util.Map<String, String> __ctx)
    {
        return getId(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private int
    getId(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getId");
                __delBase = __getDelegate(false);
                _ENotaCondivisaDel __del = (_ENotaCondivisaDel)__delBase;
                return __del.getId(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex, null);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    public EUtenteCondiviso
    getScrittaDa()
    {
        return getScrittaDa(null, false);
    }

    public EUtenteCondiviso
    getScrittaDa(java.util.Map<String, String> __ctx)
    {
        return getScrittaDa(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private EUtenteCondiviso
    getScrittaDa(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getScrittaDa");
                __delBase = __getDelegate(false);
                _ENotaCondivisaDel __del = (_ENotaCondivisaDel)__delBase;
                return __del.getScrittaDa(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex, null);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    public void
    setContent(String content)
    {
        setContent(content, null, false);
    }

    public void
    setContent(String content, java.util.Map<String, String> __ctx)
    {
        setContent(content, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setContent(String content, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __delBase = __getDelegate(false);
                _ENotaCondivisaDel __del = (_ENotaCondivisaDel)__delBase;
                __del.setContent(content, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex, null);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    public void
    setData(long data)
    {
        setData(data, null, false);
    }

    public void
    setData(long data, java.util.Map<String, String> __ctx)
    {
        setData(data, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setData(long data, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __delBase = __getDelegate(false);
                _ENotaCondivisaDel __del = (_ENotaCondivisaDel)__delBase;
                __del.setData(data, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex, null);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    public void
    setId(int id)
    {
        setId(id, null, false);
    }

    public void
    setId(int id, java.util.Map<String, String> __ctx)
    {
        setId(id, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setId(int id, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __delBase = __getDelegate(false);
                _ENotaCondivisaDel __del = (_ENotaCondivisaDel)__delBase;
                __del.setId(id, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex, null);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    public void
    setScrittaDa(EUtenteCondiviso untente)
    {
        setScrittaDa(untente, null, false);
    }

    public void
    setScrittaDa(EUtenteCondiviso untente, java.util.Map<String, String> __ctx)
    {
        setScrittaDa(untente, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setScrittaDa(EUtenteCondiviso untente, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __delBase = __getDelegate(false);
                _ENotaCondivisaDel __del = (_ENotaCondivisaDel)__delBase;
                __del.setScrittaDa(untente, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex, null);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    public static ENotaCondivisaPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        ENotaCondivisaPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (ENotaCondivisaPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::TwitterSimpleClient::EntityCondivise::ENotaCondivisa"))
                {
                    ENotaCondivisaPrxHelper __h = new ENotaCondivisaPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static ENotaCondivisaPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        ENotaCondivisaPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (ENotaCondivisaPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::TwitterSimpleClient::EntityCondivise::ENotaCondivisa", __ctx))
                {
                    ENotaCondivisaPrxHelper __h = new ENotaCondivisaPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static ENotaCondivisaPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        ENotaCondivisaPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::TwitterSimpleClient::EntityCondivise::ENotaCondivisa"))
                {
                    ENotaCondivisaPrxHelper __h = new ENotaCondivisaPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static ENotaCondivisaPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        ENotaCondivisaPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::TwitterSimpleClient::EntityCondivise::ENotaCondivisa", __ctx))
                {
                    ENotaCondivisaPrxHelper __h = new ENotaCondivisaPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static ENotaCondivisaPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        ENotaCondivisaPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (ENotaCondivisaPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                ENotaCondivisaPrxHelper __h = new ENotaCondivisaPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static ENotaCondivisaPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        ENotaCondivisaPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            ENotaCondivisaPrxHelper __h = new ENotaCondivisaPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _ENotaCondivisaDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _ENotaCondivisaDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, ENotaCondivisaPrx v)
    {
        __os.writeProxy(v);
    }

    public static ENotaCondivisaPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            ENotaCondivisaPrxHelper result = new ENotaCondivisaPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
