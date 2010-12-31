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

public interface _AuthtenticationDel extends Ice._ObjectDel
{
    TwitterSimpleClient.EntityCondivise.EUtenteCondiviso logIn(String Imei, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    boolean keepAlive(String Imei, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;
}
