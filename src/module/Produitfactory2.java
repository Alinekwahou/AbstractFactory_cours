package module;

public class Produitfactory2 implements IProduitFactory1 {
	public ProduitA getProduitA() {
		return new ProduitA2();
	}
	public ProduitB getProduitB() {
		return new ProduitB2();
	}
	
}
