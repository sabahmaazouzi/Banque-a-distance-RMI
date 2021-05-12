import java.io.Serializable;

public class Compte implements Serializable {
	
	private int solde;
	String nom ;
	public Compte( int solde, String nom) {
		super();
		
		this.solde = solde;
		this.nom = nom ;
	}
	
	/*public int getid() {
		return id;
	}
	*/
	public String  getnom() {
		return nom ;
	}
	/*public void setid(int id) {
		this.id = id;
	}
	*/
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	
	public String toString()
	{
		return "solde :"+solde+"   nom : "+nom ;
	}
	
}
