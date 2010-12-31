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

public interface _EUtenteCondivisoOperationsNC
{
    void setId(String id);

    void setUsername(String username);

    void setConnetted(boolean connetted);

    void setInseguitore(java.util.ArrayList<String> inseguitore);

    void setInseguito(java.util.ArrayList<String> inseguito);

    void setAutoreDi(java.util.ArrayList<String> autoreDi);

    String getId();

    String getUsername();

    boolean isConnected();

    java.util.ArrayList<String> getInseguitore();

    java.util.ArrayList<String> getInseguito();

    java.util.ArrayList<String> getAutoreDi();
}
