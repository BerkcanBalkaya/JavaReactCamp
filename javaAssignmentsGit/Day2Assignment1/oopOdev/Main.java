package oopOdev;

public class Main {
	public static void main(String[] args) {
		//Örnekte kullanılmak üzere 3 adet Courses nesnesi oluşturuldu
		Courses courses1 = new Courses(1,"JAVA ile Daha Aydınlık Yarınlara","Berkcan Balkaya",29.99,12);
		Courses courses2 = new Courses(2,"Python ile Daha Aydınlık Yarınlara","Ebubekir Yazici",29.99,14);
		Courses courses3 = new Courses(3,"C# ile Daha Aydınlık Yarınlara","Salih Degirmenci",29.99,16);
		System.out.println("");
		//İçerisindeki methodları kullanabilmek için CourseMagager nesnesi oluşturduk.
		CoursesManager coursesManager = new CoursesManager();
		//Ödevde istenildiği üzere Courses dizisi tanımladık ve bu diziyi foreach mantığı ile yazdırdık.
		Courses[] Course = {courses1,courses2,courses3};
		for (Courses courses : Course) {
			System.out.println(courses.getName() + " Adlı Kursumuzun Durumu = "+courses.getCourseState());
		}
		//CourseMagager methodlarını kullanarak course1 de bulunan değişkenler üzerinde değişiklikler yapılmıştır. 
		System.out.println();
		coursesManager.CoursePriceChanger(courses1, 100);
		coursesManager.CourseStateChanger(courses1);
		coursesManager.CourseDayManager(courses1,"Nesne Tabanlı Programlamaya Giriş",3,1);
		
	} 
}
