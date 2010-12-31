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

public final class EUtenteCondivisoPrxHelper extends Ice.ObjectPrxHelperBase implements EUtenteCondivisoPrx
{
    public java.util.ArrayList<String>
    getAutoreDi()
    {
        return getAutoreDi(null, false);
    }

    public java.util.ArrayList<String>
    getAutoreDi(java.util.Map<String, String> __ctx)
    {
        return getAutoreDi(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private java.util.ArrayList<String>
    getAutoreDi(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getAutoreDi");
                __delBase = __getDelegate(false);
                _EUtenteCondivisoDel __del = (_EUtenteCondivisoDel)__delBase;
                return __del.getAutoreDi(__ctx);
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

    public String
    getId()
    {
        return getId(null, false);
    }

    public String
    getId(java.util.Map<String, String> __ctx)
    {
        return getId(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String
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
                _EUtenteCondivisoDel __del = (_EUtenteCondivisoDel)__delBase;
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

    public java.util.ArrayList<String>
    getInseguito()
    {
        return getInseguito(null, false);
    }

    public java.util.ArrayList<String>
    getInseguito(java.util.Map<String, String> __ctx)
    {
        return getInseguito(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private java.util.ArrayList<String>
    getInseguito(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getInseguito");
                __delBase = __getDelegate(false);
                _EUtenteCondivisoDel __del = (_EUtenteCondivisoDel)__delBase;
                return __del.getInseguito(__ctx);
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

    public java.util.ArrayList<String>
    getInseguitore()
    {
        return getInseguitore(null, false);
    }

    public java.util.ArrayList<String>
    getInseguitore(java.util.Map<String, String> __ctx)
    {
        return getInseguitore(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private java.util.ArrayList<String>
    getInseguitore(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getInseguitore");
                __delBase = __getDelegate(false);
                _EUtenteCondivisoDel __del = (_EUtenteCondivisoDel)__delBase;
                return __del.getInseguitore(__ctx);
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

    public String
    getUsername()
    {
        return getUsername(null, false);
    }

    public String
    getUsername(java.util.Map<String, String> __ctx)
    {
        return getUsername(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String
    getUsername(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getUsername");
                __delBase = __getDelegate(false);
                _EUtenteCondivisoDel __del = (_EUtenteCondivisoDel)__delBase;
                return __del.getUsername(__ctx);
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

    public boolean
    isConnected()
    {
        return isConnected(null, false);
    }

    public boolean
    isConnected(java.util.Map<String, String> __ctx)
    {
        return isConnected(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private boolean
    isConnected(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("isConnected");
                __delBase = __getDelegate(false);
                _EUtenteCondivisoDel __del = (_EUtenteCondivisoDel)__delBase;
                return __del.isConnected(__ctx);
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
    setAutoreDi(java.util.ArrayList<String> autoreDi)
    {
        setAutoreDi(autoreDi, null, false);
    }

    public void
    setAutoreDi(java.util.ArrayList<String> autoreDi, java.util.Map<String, String> __ctx)
    {
        setAutoreDi(autoreDi, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setAutoreDi(java.util.ArrayList<String> autoreDi, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _EUtenteCondivisoDel __del = (_EUtenteCondivisoDel)__delBase;
                __del.setAutoreDi(autoreDi, __ctx);
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
    setConnetted(boolean connetted)
    {
        setConnetted(connetted, null, false);
    }

    public void
    setConnetted(boolean connetted, java.util.Map<String, String> __ctx)
    {
        setConnetted(connetted, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setConnetted(boolean connetted, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _EUtenteCondivisoDel __del = (_EUtenteCondivisoDel)__delBase;
                __del.setConnetted(connetted, __ctx);
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
    setId(String id)
    {
        setId(id, null, false);
    }

    public void
    setId(String id, java.util.Map<String, String> __ctx)
    {
        setId(id, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setId(String id, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _EUtenteCondivisoDel __del = (_EUtenteCondivisoDel)__delBase;
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
    setInseguito(java.util.ArrayList<String> inseguito)
    {
        setInseguito(inseguito, null, false);
    }

    public void
    setInseguito(java.util.ArrayList<String> inseguito, java.util.Map<String, String> __ctx)
    {
        setInseguito(inseguito, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setInseguito(java.util.ArrayList<String> inseguito, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _EUtenteCondivisoDel __del = (_EUtenteCondivisoDel)__delBase;
                __del.setInseguito(inseguito, __ctx);
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
    setInseguitore(java.util.ArrayList<String> inseguitore)
    {
        setInseguitore(inseguitore, null, false);
    }

    public void
    setInseguitore(java.util.ArrayList<String> inseguitore, java.util.Map<String, String> __ctx)
    {
        setInseguitore(inseguitore, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setInseguitore(java.util.ArrayList<String> inseguitore, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _EUtenteCondivisoDel __del = (_EUtenteCondivisoDel)__delBase;
                __del.setInseguitore(inseguitore, __ctx);
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
    setUsername(String username)
    {
        setUsername(username, null, false);
    }

    public void
    setUsername(String username, java.util.Map<String, String> __ctx)
    {
        setUsername(username, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setUsername(String username, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _EUtenteCondivisoDel __del = (_EUtenteCondivisoDel)__delBase;
                __del.setUsername(username, __ctx);
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

    public static EUtenteCondivisoPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        EUtenteCondivisoPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (EUtenteCondivisoPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::TwitterSimpleClient::EntityCondivise::EUtenteCondiviso"))
                {
                    EUtenteCondivisoPrxHelper __h = new EUtenteCondivisoPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static EUtenteCondivisoPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        EUtenteCondivisoPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (EUtenteCondivisoPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::TwitterSimpleClient::EntityCondivise::EUtenteCondiviso", __ctx))
                {
                    EUtenteCondivisoPrxHelper __h = new EUtenteCondivisoPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static EUtenteCondivisoPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        EUtenteCondivisoPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::TwitterSimpleClient::EntityCondivise::EUtenteCondiviso"))
                {
                    EUtenteCondivisoPrxHelper __h = new EUtenteCondivisoPrxHelper();
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

    public static EUtenteCondivisoPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        EUtenteCondivisoPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::TwitterSimpleClient::EntityCondivise::EUtenteCondiviso", __ctx))
                {
                    EUtenteCondivisoPrxHelper __h = new EUtenteCondivisoPrxHelper();
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

    public static EUtenteCondivisoPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        EUtenteCondivisoPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (EUtenteCondivisoPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                EUtenteCondivisoPrxHelper __h = new EUtenteCondivisoPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static EUtenteCondivisoPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        EUtenteCondivisoPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            EUtenteCondivisoPrxHelper __h = new EUtenteCondivisoPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _EUtenteCondivisoDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _EUtenteCondivisoDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, EUtenteCondivisoPrx v)
    {
        __os.writeProxy(v);
    }

    public static EUtenteCondivisoPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            EUtenteCondivisoPrxHelper result = new EUtenteCondivisoPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
