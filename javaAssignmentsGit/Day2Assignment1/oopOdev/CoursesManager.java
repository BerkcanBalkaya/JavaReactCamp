package oopOdev;
//	Courses Class� ile ilgili i�lemleri ger�ekle�tirmek amac�yla CoursesManager ��lem class� olu�turulmu�tur.
public class CoursesManager {
//	�rnek olmas� a��s�ndan 3 adet (Kurs Durumu, Kurs �creti ve Kurs G�n D�zenleyicisi) i�lem tan�mlanm��t�r.
	public void CourseStateChanger(Courses course) {
		if (course.getCourseState().equals("Devam Etmekte")) {
			course.setCourseState("Tamamland�");
			System.out.println(course.getName() + " Adl� kursunuzun durumu 'Tamamland�' olarak de�i�tirildi");
		}
		else if (course.getCourseState().equals("Tamamland�")) {
			course.setCourseState("Devam Etmekte");
			System.out.println(course.getName() + " Adl� kursunuzun durumu 'Devam Etmekte' olarak de�i�tirildi");
		}
	}
	public void CoursePriceChanger (Courses course, double unitPrice) {
		course.setUnitPrice(unitPrice);
		System.out.println(course.getName()+ " Adl� kursunuzun fiyat� "+ unitPrice + " olarak de�i�tirilmi�tir");
	}
	public void CourseDayManager (Courses course,String content, int assignmentCount,int day) {
		CoursesDays temp = new CoursesDays(content,assignmentCount);
		course.setDay(temp, day-1);
		System.out.println(day + ". G�n�n i�eri�i \"" + course.getDay()[day-1].content + "\" ve toplam �dev say�s� \"" + course.getDay()[day-1].assignment.length + "\" olarak ayarlanm��t�r." );
	}
}
