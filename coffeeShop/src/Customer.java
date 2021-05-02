import java.sql.Date;

public class Customer implements IEntity{
	
	private int id;
	private String firstName;
	private String lastName;
	private int date;
	private long nationalityId;
	
	public Customer(int id, String firstName, String lastName, int date, long nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public long getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	
	
	
}
