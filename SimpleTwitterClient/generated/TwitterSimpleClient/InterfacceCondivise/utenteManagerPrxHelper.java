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

public final class utenteManagerPrxHelper extends Ice.ObjectPrxHelperBase implements utenteManagerPrx
{
    public TwitterSimpleClient.EntityCondivise.EUtenteCondiviso
    addInseguitore(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, TwitterSimpleClient.EntityCondivise.EUtenteCondiviso inseguitore)
    {
        return addInseguitore(utente, inseguitore, null, false);
    }

    public TwitterSimpleClient.EntityCondivise.EUtenteCondiviso
    addInseguitore(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, TwitterSimpleClient.EntityCondivise.EUtenteCondiviso inseguitore, java.util.Map<String, String> __ctx)
    {
        return addInseguitore(utente, inseguitore, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private TwitterSimpleClient.EntityCondivise.EUtenteCondiviso
    addInseguitore(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, TwitterSimpleClient.EntityCondivise.EUtenteCondiviso inseguitore, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("addInseguitore");
                __delBase = __getDelegate(false);
                _utenteManagerDel __del = (_utenteManagerDel)__delBase;
                return __del.addInseguitore(utente, inseguitore, __ctx);
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

    public java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso>
    getInseguito(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente)
    {
        return getInseguito(utente, null, false);
    }

    public java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso>
    getInseguito(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, java.util.Map<String, String> __ctx)
    {
        return getInseguito(utente, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso>
    getInseguito(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _utenteManagerDel __del = (_utenteManagerDel)__delBase;
                return __del.getInseguito(utente, __ctx);
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

    public java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso>
    getInseguitore(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente)
    {
        return getInseguitore(utente, null, false);
    }

    public java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso>
    getInseguitore(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, java.util.Map<String, String> __ctx)
    {
        return getInseguitore(utente, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso>
    getInseguitore(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _utenteManagerDel __del = (_utenteManagerDel)__delBase;
                return __del.getInseguitore(utente, __ctx);
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

    public java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso>
    getUtenti()
    {
        return getUtenti(null, false);
    }

    public java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso>
    getUtenti(java.util.Map<String, String> __ctx)
    {
        return getUtenti(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso>
    getUtenti(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getUtenti");
                __delBase = __getDelegate(false);
                _utenteManagerDel __del = (_utenteManagerDel)__delBase;
                return __del.getUtenti(__ctx);
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

    public TwitterSimpleClient.EntityCondivise.EUtenteCondiviso
    removeInseguitore(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, TwitterSimpleClient.EntityCondivise.EUtenteCondiviso inseguitore)
    {
        return removeInseguitore(utente, inseguitore, null, false);
    }

    public TwitterSimpleClient.EntityCondivise.EUtenteCondiviso
    removeInseguitore(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, TwitterSimpleClient.EntityCondivise.EUtenteCondiviso inseguitore, java.util.Map<String, String> __ctx)
    {
        return removeInseguitore(utente, inseguitore, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private TwitterSimpleClient.EntityCondivise.EUtenteCondiviso
    removeInseguitore(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, TwitterSimpleClient.EntityCondivise.EUtenteCondiviso inseguitore, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("removeInseguitore");
                __delBase = __getDelegate(false);
                _utenteManagerDel __del = (_utenteManagerDel)__delBase;
                return __del.removeInseguitore(utente, inseguitore, __ctx);
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
    updateUtente(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente)
    {
        return updateUtente(utente, null, false);
    }

    public boolean
    updateUtente(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, java.util.Map<String, String> __ctx)
    {
        return updateUtente(utente, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private boolean
    updateUtente(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("updateUtente");
                __delBase = __getDelegate(false);
                _utenteManagerDel __del = (_utenteManagerDel)__delBase;
                return __del.updateUtente(utente, __ctx);
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

    public static utenteManagerPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        utenteManagerPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (utenteManagerPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::TwitterSimpleClient::InterfacceCondivise::utenteManager"))
                {
                    utenteManagerPrxHelper __h = new utenteManagerPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static utenteManagerPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        utenteManagerPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (utenteManagerPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::TwitterSimpleClient::InterfacceCondivise::utenteManager", __ctx))
                {
                    utenteManagerPrxHelper __h = new utenteManagerPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static utenteManagerPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        utenteManagerPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::TwitterSimpleClient::InterfacceCondivise::utenteManager"))
                {
                    utenteManagerPrxHelper __h = new utenteManagerPrxHelper();
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

    public static utenteManagerPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        utenteManagerPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::TwitterSimpleClient::InterfacceCondivise::utenteManager", __ctx))
                {
                    utenteManagerPrxHelper __h = new utenteManagerPrxHelper();
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

    public static utenteManagerPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        utenteManagerPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (utenteManagerPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                utenteManagerPrxHelper __h = new utenteManagerPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static utenteManagerPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        utenteManagerPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            utenteManagerPrxHelper __h = new utenteManagerPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _utenteManagerDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _utenteManagerDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, utenteManagerPrx v)
    {
        __os.writeProxy(v);
    }

    public static utenteManagerPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            utenteManagerPrxHelper result = new utenteManagerPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
