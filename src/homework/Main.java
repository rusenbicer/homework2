package homework;

public class Main {

	public static void main(String[] args) {
		
			Course course1 = new Course(1, "Engin Demiroğ", "C# + Angular",21);
			Course course2 = new Course(2, "Engin Demiroğ", "JAVA + REACT",14);
			Course course3 = new Course(3, "Engin Demiroğ", "Programlamaya Giriş için Temel Kurs",1);
		
			Course[] courses = {course1,course2,course3};
			
			System.out.println("Kodlama.io Sitesinde Bulunan Kursların Listesi");
			System.out.println("***********************************************");
			int i = 1 ;
			for(Course course : courses) {
				System.out.println(i+") "+course.getCourseName()+" - (Eğitmen:"+course.getInstructor()+")");
				i++;
			}
			
			Student student1 = new Student("Ruşen", "Biçer", "bicer@gmail.com");
			Student student2 = new Student("Cem", "Yeyim", "yeyim@outlook.com");
			Student student3 = new Student("Burak", "Özen", "ozen@hotmail.com");
			
			Student[] students = {student1,student2,student3};
			
			System.out.println("\nKodlama.io Sitesinde Bulunan Öğrencilerin Listesi");
			System.out.println("***********************************************");
			int y = 1 ;
			for(Student student : students) {
				System.out.println(y+") "+student.getName()+ " " + student.getSurname());
				y++;
			}
			
			System.out.println("\n***********************************************");
			CourseManager courseManager = new CourseManager();
			courseManager.addToCourse(student1, course2);
			courseManager.addToCourse(student2, course1);
			courseManager.addToCourse(student2, course2);
			courseManager.addToCourse(student2, course3);
			courseManager.addToCourse(student3, course3);
			
			System.out.println("\n***********************************************");
			System.out.println(courseManager.courseViewRate(student1, course2, 2));
			System.out.println(courseManager.courseViewRate(student2, course1, 5));
			System.out.println(courseManager.courseViewRate(student3, course3, 1));
			
			
	}

}
