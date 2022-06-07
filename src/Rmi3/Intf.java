package Rmi3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Intf extends Remote {
	public String helloTo(String name) throws RemoteException;
}
