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

public final class noteManagerPrxHelper extends Ice.ObjectPrxHelperBase implements noteManagerPrx
{
    public void
    addNota(TwitterSimpleClient.EntityCondivise.ENotaCondivisa nota)
    {
        addNota(nota, null, false);
    }

    public void
    addNota(TwitterSimpleClient.EntityCondivise.ENotaCondivisa nota, java.util.Map<String, String> __ctx)
    {
        addNota(nota, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    addNota(TwitterSimpleClient.EntityCondivise.ENotaCondivisa nota, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _noteManagerDel __del = (_noteManagerDel)__delBase;
                __del.addNota(nota, __ctx);
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

    public java.util.ArrayList<TwitterSimpleClient.EntityCondivise.ENotaCondivisa>
    getListaNote(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente)
    {
        return getListaNote(utente, null, false);
    }

    public java.util.ArrayList<TwitterSimpleClient.EntityCondivise.ENotaCondivisa>
    getListaNote(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, java.util.Map<String, String> __ctx)
    {
        return getListaNote(utente, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private java.util.ArrayList<TwitterSimpleClient.EntityCondivise.ENotaCondivisa>
    getListaNote(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getListaNote");
                __delBase = __getDelegate(false);
                _noteManagerDel __del = (_noteManagerDel)__delBase;
                return __del.getListaNote(utente, __ctx);
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

    public TwitterSimpleClient.EntityCondivise.ENotaCondivisa
    getNotaById(String id)
    {
        return getNotaById(id, null, false);
    }

    public TwitterSimpleClient.EntityCondivise.ENotaCondivisa
    getNotaById(String id, java.util.Map<String, String> __ctx)
    {
        return getNotaById(id, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private TwitterSimpleClient.EntityCondivise.ENotaCondivisa
    getNotaById(String id, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getNotaById");
                __delBase = __getDelegate(false);
                _noteManagerDel __del = (_noteManagerDel)__delBase;
                return __del.getNotaById(id, __ctx);
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

    public static noteManagerPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        noteManagerPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (noteManagerPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::TwitterSimpleClient::InterfacceCondivise::noteManager"))
                {
                    noteManagerPrxHelper __h = new noteManagerPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static noteManagerPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        noteManagerPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (noteManagerPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::TwitterSimpleClient::InterfacceCondivise::noteManager", __ctx))
                {
                    noteManagerPrxHelper __h = new noteManagerPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static noteManagerPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        noteManagerPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::TwitterSimpleClient::InterfacceCondivise::noteManager"))
                {
                    noteManagerPrxHelper __h = new noteManagerPrxHelper();
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

    public static noteManagerPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        noteManagerPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::TwitterSimpleClient::InterfacceCondivise::noteManager", __ctx))
                {
                    noteManagerPrxHelper __h = new noteManagerPrxHelper();
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

    public static noteManagerPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        noteManagerPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (noteManagerPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                noteManagerPrxHelper __h = new noteManagerPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static noteManagerPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        noteManagerPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            noteManagerPrxHelper __h = new noteManagerPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _noteManagerDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _noteManagerDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, noteManagerPrx v)
    {
        __os.writeProxy(v);
    }

    public static noteManagerPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            noteManagerPrxHelper result = new noteManagerPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
