package Rmi2;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
	Server() {
	}

	public static void main(String[] args) throws Exception, RemoteException {
		Mid obj = new Mid();
		Message stubMessage = (Message) UnicastRemoteObject.exportObject(obj, 0);
		Registry registry = LocateRegistry.getRegistry();
		registry.bind("hello", stubMessage);
		System.out.println("Server ready");
	}

}
