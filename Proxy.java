import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Proxy extends Remote {
	
	public  int solde_client(int id)throws RemoteException;
	public int retrait(int montant,int id) throws RemoteException;
	public int transfere(int id_1 ,int id_2, int somme) throws RemoteException ;
	public Compte retouner_compte(int id ) throws RemoteException ;


}
