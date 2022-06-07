package Rmi2;

import java.rmi.RemoteException;

public class Mid implements Message {

	@Override
	public void printMsg() throws RemoteException {
		System.out.println("Hello from me...");
	}

}
