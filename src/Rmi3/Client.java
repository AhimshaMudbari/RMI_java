package Rmi3;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

public class Client {
	private static Intf look_up;

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		look_up = (Intf) Naming.lookup("MyServer");
		String txt = JOptionPane.showInputDialog("What is your name?");
		String response = look_up.helloTo(txt);
		JOptionPane.showMessageDialog(null, response);
	}

}
