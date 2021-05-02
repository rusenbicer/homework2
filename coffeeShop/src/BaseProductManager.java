
public abstract class BaseProductManager implements IProductService{

	@Override
	public void sell(Product product) {
		System.out.println(product.getPiece()+" adet " +product.getName() +" " + (product.getPiece() * product.getPrice()) +" TL 'dir");
		
	}

}
