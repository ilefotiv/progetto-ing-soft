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

public interface AuthtenticationPrx extends Ice.ObjectPrx
{
    public TwitterSimpleClient.EntityCondivise.EUtenteCondiviso logIn(String Imei);
    public TwitterSimpleClient.EntityCondivise.EUtenteCondiviso logIn(String Imei, java.util.Map<String, String> __ctx);

    public boolean keepAlive(String Imei);
    public boolean keepAlive(String Imei, java.util.Map<String, String> __ctx);
}
