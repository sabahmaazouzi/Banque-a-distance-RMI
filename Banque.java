import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Banque extends UnicastRemoteObject implements Proxy{
	private ArrayList<ClientCompte> clients ;
	
	
	
	public Banque() throws RemoteException {
		super();
		clients = new ArrayList<ClientCompte>();
		
	}
	
	
	public  int solde_client(int id)throws RemoteException
	{
		for (ClientCompte c : clients)
		{
			if ( c.getId()==id )
			{
				return( c.compte.getSolde());
				
			}
			
				
				
		}
		
	return -1;
		
	}
	public int transfere(int id_1 ,int id_2, int somme) throws RemoteException
	{   
		
		for (ClientCompte c : clients)
		{
			if(c.getId()== id_1)
			{
				for (ClientCompte c_2 : clients)
				{
					if(c_2.getId()== id_2)
					{
						int bool = retrait(somme,id_1);
						if ( bool == 1)
						{
							//c.compte.setSolde(c.compte.getSolde()-somme);
							c_2.compte.setSolde(c_2.compte.getSolde()+somme);
							return 1 ;
						}
					}
				}
			}
		}
		return 0;
	}
	
	
	public Compte retouner_compte(int id ) throws RemoteException {
		
		for(ClientCompte c : clients)
		{
			return c.getCompte();
		}
		
		return null ;
		
		
		
	}
	
	
	public int retrait(int montant,int id) throws RemoteException
	{
		for (ClientCompte  c : clients)
		{
			if ( c.getId()==id )
			{	if (montant <= c.compte.getSolde())
					{c.compte.setSolde(c.compte.getSolde()-montant);
					return 1;}
			return 0;
			//return c.compte.getSolde();
			}}
		return -1;
		
		
	}
	public void addClient(ClientCompte  c){
		clients.add(c);
	}
	public void removeCompte(int i){
		clients.remove(i);
	}

}
