package oopOdev;

public class Main {
	public static void main(String[] args) {
		//�rnekte kullan�lmak �zere 3 adet Courses nesnesi olu�turuldu
		Courses courses1 = new Courses(1,"JAVA ile Daha Ayd�nl�k Yar�nlara","Berkcan Balkaya",29.99,12);
		Courses courses2 = new Courses(2,"Python ile Daha Ayd�nl�k Yar�nlara","Ebubekir Yazici",29.99,14);
		Courses courses3 = new Courses(3,"C# ile Daha Ayd�nl�k Yar�nlara","Salih Degirmenci",29.99,16);
		System.out.println("");
		//��erisindeki methodlar� kullanabilmek i�in CourseMagager nesnesi olu�turduk.
		CoursesManager coursesManager = new CoursesManager();
		//�devde istenildi�i �zere Courses dizisi tan�mlad�k ve bu diziyi foreach mant��� ile yazd�rd�k.
		Courses[] Course = {courses1,courses2,courses3};
		for (Courses courses : Course) {
			System.out.println(courses.getName() + " Adl� Kursumuzun Durumu = "+courses.getCourseState());
		}
		//CourseMagager methodlar�n� kullanarak course1 de bulunan de�i�kenler �zerinde de�i�iklikler yap�lm��t�r. 
		System.out.println();
		coursesManager.CoursePriceChanger(courses1, 100);
		coursesManager.CourseStateChanger(courses1);
		coursesManager.CourseDayManager(courses1,"Nesne Tabanl� Programlamaya Giri�",3,1);
		
	} 
}
