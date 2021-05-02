
public class Product implements IEntity{

	private int id;
	private String name;
	private double price;
	private int piece;
	private String size ;
	
	
	public Product(int id, String name, double price, int piece, String size) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.piece = piece;
		this.size = size;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPiece() {
		return piece;
	}
	public void setPiece(int piece) {
		this.piece = piece;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	
}
