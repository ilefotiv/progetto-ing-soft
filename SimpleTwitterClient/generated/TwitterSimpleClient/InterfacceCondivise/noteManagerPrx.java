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

public interface noteManagerPrx extends Ice.ObjectPrx
{
    public java.util.ArrayList<TwitterSimpleClient.EntityCondivise.ENotaCondivisa> getListaNote(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente);
    public java.util.ArrayList<TwitterSimpleClient.EntityCondivise.ENotaCondivisa> getListaNote(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso utente, java.util.Map<String, String> __ctx);

    public TwitterSimpleClient.EntityCondivise.ENotaCondivisa getNotaById(String id);
    public TwitterSimpleClient.EntityCondivise.ENotaCondivisa getNotaById(String id, java.util.Map<String, String> __ctx);

    public void addNota(TwitterSimpleClient.EntityCondivise.ENotaCondivisa nota);
    public void addNota(TwitterSimpleClient.EntityCondivise.ENotaCondivisa nota, java.util.Map<String, String> __ctx);
}
