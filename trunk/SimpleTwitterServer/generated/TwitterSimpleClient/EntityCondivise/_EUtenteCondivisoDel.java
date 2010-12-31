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

public interface _EUtenteCondivisoDel extends _EntityCondivisaDel
{
    void setId(String id, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setUsername(String username, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setConnetted(boolean connetted, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setInseguitore(java.util.ArrayList<String> inseguitore, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setInseguito(java.util.ArrayList<String> inseguito, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setAutoreDi(java.util.ArrayList<String> autoreDi, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    String getId(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    String getUsername(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    boolean isConnected(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    java.util.ArrayList<String> getInseguitore(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    java.util.ArrayList<String> getInseguito(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    java.util.ArrayList<String> getAutoreDi(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;
}
