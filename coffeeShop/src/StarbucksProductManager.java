
public class StarbucksProductManager extends BaseProductManager{

	@Override
	public void sell(Product product) {
		super.sell(product);
		getStar(product);
	}
	
	public void getStar(Product product) {
		
		System.out.println(product.getPiece() + " yýldýz kazandýnýz.");
	}
	

}
