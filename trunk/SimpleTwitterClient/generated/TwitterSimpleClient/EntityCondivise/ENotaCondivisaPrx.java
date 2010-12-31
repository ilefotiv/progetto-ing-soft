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

public interface ENotaCondivisaPrx extends EntityCondivisaPrx
{
    public void setId(int id);
    public void setId(int id, java.util.Map<String, String> __ctx);

    public void setContent(String content);
    public void setContent(String content, java.util.Map<String, String> __ctx);

    public void setData(long data);
    public void setData(long data, java.util.Map<String, String> __ctx);

    public void setScrittaDa(EUtenteCondiviso untente);
    public void setScrittaDa(EUtenteCondiviso untente, java.util.Map<String, String> __ctx);

    public EUtenteCondiviso getScrittaDa();
    public EUtenteCondiviso getScrittaDa(java.util.Map<String, String> __ctx);

    public int getId();
    public int getId(java.util.Map<String, String> __ctx);

    public String getContent();
    public String getContent(java.util.Map<String, String> __ctx);

    public long getData();
    public long getData(java.util.Map<String, String> __ctx);
}
