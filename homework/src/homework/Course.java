package homework;

public class Course {

	private int id ;
	private String instructor;
	private String courseName;
	private int totalCourseDays;
	
	public Course(int id, String instructor , String courseName , int totalCourseDays) {
		this.id = id;
		this.instructor = instructor;
		this.courseName = courseName;
		this.totalCourseDays = totalCourseDays;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getTotalCourseDays() {
		return totalCourseDays;
	}

	public void setTotalCourseDays(int totalCourseDays) {
		this.totalCourseDays = totalCourseDays;
	}
	
	
}
