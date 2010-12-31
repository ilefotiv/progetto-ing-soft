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

public final class AuthtenticationPrxHelper extends Ice.ObjectPrxHelperBase implements AuthtenticationPrx
{
    public boolean
    keepAlive(String Imei)
    {
        return keepAlive(Imei, null, false);
    }

    public boolean
    keepAlive(String Imei, java.util.Map<String, String> __ctx)
    {
        return keepAlive(Imei, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private boolean
    keepAlive(String Imei, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("keepAlive");
                __delBase = __getDelegate(false);
                _AuthtenticationDel __del = (_AuthtenticationDel)__delBase;
                return __del.keepAlive(Imei, __ctx);
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
    logIn(String Imei)
    {
        return logIn(Imei, null, false);
    }

    public TwitterSimpleClient.EntityCondivise.EUtenteCondiviso
    logIn(String Imei, java.util.Map<String, String> __ctx)
    {
        return logIn(Imei, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private TwitterSimpleClient.EntityCondivise.EUtenteCondiviso
    logIn(String Imei, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("logIn");
                __delBase = __getDelegate(false);
                _AuthtenticationDel __del = (_AuthtenticationDel)__delBase;
                return __del.logIn(Imei, __ctx);
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

    public static AuthtenticationPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        AuthtenticationPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (AuthtenticationPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::TwitterSimpleClient::InterfacceCondivise::Authtentication"))
                {
                    AuthtenticationPrxHelper __h = new AuthtenticationPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static AuthtenticationPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        AuthtenticationPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (AuthtenticationPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::TwitterSimpleClient::InterfacceCondivise::Authtentication", __ctx))
                {
                    AuthtenticationPrxHelper __h = new AuthtenticationPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static AuthtenticationPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        AuthtenticationPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::TwitterSimpleClient::InterfacceCondivise::Authtentication"))
                {
                    AuthtenticationPrxHelper __h = new AuthtenticationPrxHelper();
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

    public static AuthtenticationPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        AuthtenticationPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::TwitterSimpleClient::InterfacceCondivise::Authtentication", __ctx))
                {
                    AuthtenticationPrxHelper __h = new AuthtenticationPrxHelper();
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

    public static AuthtenticationPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        AuthtenticationPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (AuthtenticationPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                AuthtenticationPrxHelper __h = new AuthtenticationPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static AuthtenticationPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        AuthtenticationPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            AuthtenticationPrxHelper __h = new AuthtenticationPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _AuthtenticationDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _AuthtenticationDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, AuthtenticationPrx v)
    {
        __os.writeProxy(v);
    }

    public static AuthtenticationPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            AuthtenticationPrxHelper result = new AuthtenticationPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
