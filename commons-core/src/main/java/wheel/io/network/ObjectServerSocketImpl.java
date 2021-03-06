//Copyright (C) 2004 Klaus Wuestefeld
//This is free software. It is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the license distributed along with this file for more details.
//Contributions: Alexandre Nodari.

package wheel.io.network;

import java.io.IOException;
import java.net.ServerSocket;


public class ObjectServerSocketImpl implements ObjectServerSocket {

	private final ServerSocket _serverSocket;

	public ObjectServerSocketImpl(int port) throws IOException {
		_serverSocket = new ServerSocket(port);
	}

	@Override
	public ObjectSocket accept() throws IOException {
		return new ObjectSocketImpl(_serverSocket.accept());
	}

	@Override
	public void close() throws IOException {
		_serverSocket.close();
	}
}
