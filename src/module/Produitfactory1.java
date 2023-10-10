package module;

public class Produitfactory1 implements IProduitFactory1  {
	public ProduitA getProduitA() {
		return new ProduitA1();
	}
	public ProduitB getProduitB() {
		return new ProduitB1();
	}
	
	}
