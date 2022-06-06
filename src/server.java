import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class server extends UnicastRemoteObject implements adder {

	private static final long serialVersionUID = 1L;

	public server() throws RemoteException {
	}

	public static void main(String[] args) {
		try {
			Registry reg = LocateRegistry.createRegistry(7271);
			reg.rebind("server11", new server());
			System.out.println("server is ready");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int add(int a, int b) throws RemoteException {
		return a + b;
	}
}
