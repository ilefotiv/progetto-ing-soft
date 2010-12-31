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

public interface _AuthtenticationOperations
{
    TwitterSimpleClient.EntityCondivise.EUtenteCondiviso logIn(String Imei, Ice.Current __current);

    boolean keepAlive(String Imei, Ice.Current __current);
}
