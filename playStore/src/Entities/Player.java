package Entities;

public class Player {

	private int id;
	private String firstName;
	private String lastName;
	private int date;
	private long nationalId;
	
	
	public Player(int id, String firstName, String lastName, int date ,long nationalId) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
		this.nationalId = nationalId;
		
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

	public long getNationalId() {
		return nationalId;
	}

	public void setNationalId(long nationalId) {
		this.nationalId = nationalId;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
	
	
	
	
}
