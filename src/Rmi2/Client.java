package Rmi2;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Rmi2.Message;

public class Client {
	private Client() {
	}

	public static void main(String[] args) throws Exception {
		Registry registry = LocateRegistry.getRegistry(null);
		Message stub = (Message) registry.lookup("unique");
		stub.printMsg();
	}

}
