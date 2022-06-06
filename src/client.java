import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class client {
	public static void main(String[] args) throws RemoteException {
		client c = new client();
		c.connectRemote();
	}

	private void connectRemote() throws RemoteException {
		try {
			Scanner sc = new Scanner(System.in);
			Registry reg = LocateRegistry.getRegistry("localhost", 7271);
			adder ad = (adder) reg.lookup("server11");
			System.out.println("Enter value of a and b");
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println("addition: " + ad.add(x, y));
			sc.close();
		} catch (NotBoundException | RemoteException e) {
			e.printStackTrace();
		}
	}
}
