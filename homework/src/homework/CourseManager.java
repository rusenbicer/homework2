package homework;

public class CourseManager {

	public void addToCourse(Student student , Course course) {
		
		System.out.println(student.getName()+" "+student.getSurname() + " : " + course.getCourseName()+ " kursuna kayýt oldunuz.");
		
		sendToMail(student);
	}
	
	public String courseViewRate(Student student,Course course , int watchDay) {
		
		int courseViewRate = (100 * watchDay) / course.getTotalCourseDays();
		String mesaj = student.getName()+" "+student.getSurname()+" : " + course.getCourseName()+ " kursunun % " +courseViewRate+" 'ýný tamamladý." ;
		
		return mesaj ;
	}
	
	public void sendToMail(Student student) {
		
		String mail = student.getEmail();
		String[] eMail = mail.split("@");
		
		System.out.println("Ders Programýnýz, "+ mail.charAt(0)+mail.charAt(1) +"***@"+ eMail[1]+ "   adresine gönderilmiþtir.\nLütfen Kontrol Ediniz...!");
		System.out.println("-------------------------------------------");
	}
	
}
