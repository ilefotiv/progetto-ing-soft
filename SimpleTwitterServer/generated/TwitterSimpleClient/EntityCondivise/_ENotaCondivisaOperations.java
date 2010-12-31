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

public interface _ENotaCondivisaOperations
{
    void setId(int id, Ice.Current __current);

    void setContent(String content, Ice.Current __current);

    void setData(long data, Ice.Current __current);

    void setScrittaDa(EUtenteCondiviso untente, Ice.Current __current);

    EUtenteCondiviso getScrittaDa(Ice.Current __current);

    int getId(Ice.Current __current);

    String getContent(Ice.Current __current);

    long getData(Ice.Current __current);
}
