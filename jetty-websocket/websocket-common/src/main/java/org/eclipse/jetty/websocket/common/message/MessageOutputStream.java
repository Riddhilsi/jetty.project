//
//  ========================================================================
//  Copyright (c) 1995-2012 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.websocket.common.message;

import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.jetty.websocket.api.extensions.OutgoingFrames;
import org.eclipse.jetty.websocket.common.LogicalConnection;

public class MessageOutputStream extends OutputStream
{
    private final LogicalConnection connection;
    private final OutgoingFrames outgoing;

    public MessageOutputStream(LogicalConnection connection, OutgoingFrames outgoing)
    {
        this.connection = connection;
        this.outgoing = outgoing;
    }

    public boolean isClosed()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void write(int b) throws IOException
    {
        // TODO Auto-generated method stub
    }
}
