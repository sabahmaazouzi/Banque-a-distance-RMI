import java.rmi.Naming;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
try {
			
			
			Proxy banque=(Proxy)Naming.lookup("rmi://localhost:1090/banque");
			System.out.println("le solde actuel est :"+banque.solde_client(0));
            // banque.retrait(50, 0);
			int test = banque.retrait(50, 0);
			if (test==1)
				System.out.println("retrait effecuté ");
			else {if(test==0)
				System.out.println("solde insuffisant");
			
			else
				System.out.println("client introuvable");}
			
			System.out.println("nouveau solde :"+banque.solde_client(0));
			int t = banque.transfere(0, 1, 50);
			if (t==1)
				System.out.println("transfere effecuté");
			else
				System.out.println("le transfere a échoué ");
			System.out.println("le solde actuel est 1:"+banque.solde_client(1));
			System.out.println("le solde actuel est 0:"+banque.solde_client(0));
			System.out.println(banque.retouner_compte(1));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 


	}

}
