
public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdaptor());
		BaseProductManager productManager = new StarbucksProductManager();
		try {
			customerManager.save(new Customer(1, "Ruþen", "Biçer", 1988, 12345678987L));
			productManager.sell(new Product(1, "Latte", 14, 3, "grande"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
