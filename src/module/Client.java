package module;

public class Client {

	public static void main(String[] args) {
		
			IProduitFactory1 produitfactory1 = new Produitfactory1();
			IProduitFactory1 produitfactory2 = new Produitfactory2();
			
			ProduitA produitA = null;
			ProduitB produitB = null;
			
			
			System.out.println("Utilisation de la premiere fabrique");
			produitA = produitfactory1.getProduitA();
			produitB = produitfactory1.getProduitB();
			
			
			produitA.methodeA();
			produitB.methodeB();
			
			
		
	
		
			System.out.println("Utilisation de la deuxieme fabrique");
			produitA = produitfactory2.getProduitA();
			produitB = produitfactory2.getProduitB();
			
			
			produitA.methodeA();
			produitB.methodeB();
			
	}
}

