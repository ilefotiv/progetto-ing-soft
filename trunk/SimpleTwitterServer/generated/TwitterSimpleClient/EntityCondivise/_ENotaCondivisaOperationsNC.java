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

public interface _ENotaCondivisaOperationsNC
{
    void setId(int id);

    void setContent(String content);

    void setData(long data);

    void setScrittaDa(EUtenteCondiviso untente);

    EUtenteCondiviso getScrittaDa();

    int getId();

    String getContent();

    long getData();
}
