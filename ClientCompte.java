import java.io.Serializable;

public class ClientCompte implements Serializable {
	private int  id;
	Compte compte ;
	
	public ClientCompte(int id , Compte compte)
	{
		this.id = id ;
		this.compte = compte ;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

}
