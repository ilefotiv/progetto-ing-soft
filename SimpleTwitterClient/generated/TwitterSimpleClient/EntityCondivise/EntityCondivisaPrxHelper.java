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

public final class EntityCondivisaPrxHelper extends Ice.ObjectPrxHelperBase implements EntityCondivisaPrx
{
    public static EntityCondivisaPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        EntityCondivisaPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (EntityCondivisaPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::TwitterSimpleClient::EntityCondivise::EntityCondivisa"))
                {
                    EntityCondivisaPrxHelper __h = new EntityCondivisaPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static EntityCondivisaPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        EntityCondivisaPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (EntityCondivisaPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::TwitterSimpleClient::EntityCondivise::EntityCondivisa", __ctx))
                {
                    EntityCondivisaPrxHelper __h = new EntityCondivisaPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static EntityCondivisaPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        EntityCondivisaPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::TwitterSimpleClient::EntityCondivise::EntityCondivisa"))
                {
                    EntityCondivisaPrxHelper __h = new EntityCondivisaPrxHelper();
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

    public static EntityCondivisaPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        EntityCondivisaPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::TwitterSimpleClient::EntityCondivise::EntityCondivisa", __ctx))
                {
                    EntityCondivisaPrxHelper __h = new EntityCondivisaPrxHelper();
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

    public static EntityCondivisaPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        EntityCondivisaPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (EntityCondivisaPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                EntityCondivisaPrxHelper __h = new EntityCondivisaPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static EntityCondivisaPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        EntityCondivisaPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            EntityCondivisaPrxHelper __h = new EntityCondivisaPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _EntityCondivisaDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _EntityCondivisaDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, EntityCondivisaPrx v)
    {
        __os.writeProxy(v);
    }

    public static EntityCondivisaPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            EntityCondivisaPrxHelper result = new EntityCondivisaPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
