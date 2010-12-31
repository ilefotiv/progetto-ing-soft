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

public interface EUtenteCondivisoPrx extends EntityCondivisaPrx
{
    public void setId(String id);
    public void setId(String id, java.util.Map<String, String> __ctx);

    public void setUsername(String username);
    public void setUsername(String username, java.util.Map<String, String> __ctx);

    public void setConnetted(boolean connetted);
    public void setConnetted(boolean connetted, java.util.Map<String, String> __ctx);

    public void setInseguitore(java.util.ArrayList<String> inseguitore);
    public void setInseguitore(java.util.ArrayList<String> inseguitore, java.util.Map<String, String> __ctx);

    public void setInseguito(java.util.ArrayList<String> inseguito);
    public void setInseguito(java.util.ArrayList<String> inseguito, java.util.Map<String, String> __ctx);

    public void setAutoreDi(java.util.ArrayList<String> autoreDi);
    public void setAutoreDi(java.util.ArrayList<String> autoreDi, java.util.Map<String, String> __ctx);

    public String getId();
    public String getId(java.util.Map<String, String> __ctx);

    public String getUsername();
    public String getUsername(java.util.Map<String, String> __ctx);

    public boolean isConnected();
    public boolean isConnected(java.util.Map<String, String> __ctx);

    public java.util.ArrayList<String> getInseguitore();
    public java.util.ArrayList<String> getInseguitore(java.util.Map<String, String> __ctx);

    public java.util.ArrayList<String> getInseguito();
    public java.util.ArrayList<String> getInseguito(java.util.Map<String, String> __ctx);

    public java.util.ArrayList<String> getAutoreDi();
    public java.util.ArrayList<String> getAutoreDi(java.util.Map<String, String> __ctx);
}
