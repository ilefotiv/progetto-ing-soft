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

public final class listaNoteHelper
{
    public static void
    write(IceInternal.BasicStream __os, java.util.ArrayList<TwitterSimpleClient.EntityCondivise.ENotaCondivisa> __v)
    {
        if(__v == null)
        {
            __os.writeSize(0);
        }
        else
        {
            __os.writeSize(__v.size());
            for(ENotaCondivisa __elem : __v)
            {
                __os.writeObject(__elem);
            }
        }
    }

    public static java.util.ArrayList<TwitterSimpleClient.EntityCondivise.ENotaCondivisa>
    read(IceInternal.BasicStream __is)
    {
        java.util.ArrayList<TwitterSimpleClient.EntityCondivise.ENotaCondivisa> __v;
        __v = new java.util.ArrayList<TwitterSimpleClient.EntityCondivise.ENotaCondivisa>();
        final int __len0 = __is.readSize();
        __is.startSeq(__len0, 4);
        final String __type0 = ENotaCondivisa.ice_staticId();
        for(int __i0 = 0; __i0 < __len0; __i0++)
        {
            __v.add(null);
            __is.readObject(new IceInternal.ListPatcher<ENotaCondivisa>(__v, ENotaCondivisa.class, __type0, __i0));
            __is.checkSeq();
            __is.endElement();
        }
        __is.endSeq(__len0);
        return __v;
    }
}
