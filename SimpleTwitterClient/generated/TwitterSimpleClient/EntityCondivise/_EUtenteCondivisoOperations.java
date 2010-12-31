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

public interface _EUtenteCondivisoOperations
{
    void setId(String id, Ice.Current __current);

    void setUsername(String username, Ice.Current __current);

    void setConnetted(boolean connetted, Ice.Current __current);

    void setInseguitore(java.util.ArrayList<String> inseguitore, Ice.Current __current);

    void setInseguito(java.util.ArrayList<String> inseguito, Ice.Current __current);

    void setAutoreDi(java.util.ArrayList<String> autoreDi, Ice.Current __current);

    String getId(Ice.Current __current);

    String getUsername(Ice.Current __current);

    boolean isConnected(Ice.Current __current);

    java.util.ArrayList<String> getInseguitore(Ice.Current __current);

    java.util.ArrayList<String> getInseguito(Ice.Current __current);

    java.util.ArrayList<String> getAutoreDi(Ice.Current __current);
}
