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

public interface _utenteManagerOperations
{
    boolean updateUtente(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, Ice.Current __current);

    java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso> getUtenti(Ice.Current __current);

    java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso> getInseguitore(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, Ice.Current __current);

    java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso> getInseguito(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, Ice.Current __current);

    TwitterSimpleClient.EntityCondivise.EUtenteCondiviso addInseguitore(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, TwitterSimpleClient.EntityCondivise.EUtenteCondiviso inseguitore, Ice.Current __current);

    TwitterSimpleClient.EntityCondivise.EUtenteCondiviso removeInseguitore(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, TwitterSimpleClient.EntityCondivise.EUtenteCondiviso inseguitore, Ice.Current __current);
}
