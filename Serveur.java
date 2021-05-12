import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Serveur {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	try {
		Banque b = new Banque()	;
		b.addClient( new ClientCompte(0,new Compte(1000,"ahmed")));
		b.addClient( new ClientCompte(1,new Compte(5000,"ali")));
		LocateRegistry.createRegistry(1090);
		Naming.rebind("rmi://localhost:1090/banque", b);
		System.out.println(" le serveur est pret � recevoir des demandes...");
		
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
