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

public interface _utenteManagerOperationsNC
{
    boolean updateUtente(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente);

    java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso> getUtenti();

    java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso> getInseguitore(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente);

    java.util.ArrayList<TwitterSimpleClient.EntityCondivise.EUtenteCondiviso> getInseguito(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente);

    TwitterSimpleClient.EntityCondivise.EUtenteCondiviso addInseguitore(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, TwitterSimpleClient.EntityCondivise.EUtenteCondiviso inseguitore);

    TwitterSimpleClient.EntityCondivise.EUtenteCondiviso removeInseguitore(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, TwitterSimpleClient.EntityCondivise.EUtenteCondiviso inseguitore);
}
