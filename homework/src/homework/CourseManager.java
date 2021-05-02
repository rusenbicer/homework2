package homework;

public class CourseManager {

	public void addToCourse(Student student , Course course) {
		
		System.out.println(student.getName()+" "+student.getSurname() + " : " + course.getCourseName()+ " kursuna kay�t oldunuz.");
		
		sendToMail(student);
	}
	
	public String courseViewRate(Student student,Course course , int watchDay) {
		
		int courseViewRate = (100 * watchDay) / course.getTotalCourseDays();
		String mesaj = student.getName()+" "+student.getSurname()+" : " + course.getCourseName()+ " kursunun % " +courseViewRate+" '�n� tamamlad�." ;
		
		return mesaj ;
	}
	
	public void sendToMail(Student student) {
		
		String mail = student.getEmail();
		String[] eMail = mail.split("@");
		
		System.out.println("Ders Program�n�z, "+ mail.charAt(0)+mail.charAt(1) +"***@"+ eMail[1]+ "   adresine g�nderilmi�tir.\nL�tfen Kontrol Ediniz...!");
		System.out.println("-------------------------------------------");
	}
	
}
