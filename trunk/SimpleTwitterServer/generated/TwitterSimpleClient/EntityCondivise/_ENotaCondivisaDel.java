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

public interface _ENotaCondivisaDel extends _EntityCondivisaDel
{
    void setId(int id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setContent(String content, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setData(long data, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setScrittaDa(EUtenteCondiviso untente, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    EUtenteCondiviso getScrittaDa(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    int getId(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    String getContent(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long getData(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;
}
