package oopOdev;
//	Courses Classý ile ilgili iþlemleri gerçekleþtirmek amacýyla CoursesManager Ýþlem classý oluþturulmuþtur.
public class CoursesManager {
//	Örnek olmasý açýsýndan 3 adet (Kurs Durumu, Kurs Ücreti ve Kurs Gün Düzenleyicisi) iþlem tanýmlanmýþtýr.
	public void CourseStateChanger(Courses course) {
		if (course.getCourseState().equals("Devam Etmekte")) {
			course.setCourseState("Tamamlandý");
			System.out.println(course.getName() + " Adlý kursunuzun durumu 'Tamamlandý' olarak deðiþtirildi");
		}
		else if (course.getCourseState().equals("Tamamlandý")) {
			course.setCourseState("Devam Etmekte");
			System.out.println(course.getName() + " Adlý kursunuzun durumu 'Devam Etmekte' olarak deðiþtirildi");
		}
	}
	public void CoursePriceChanger (Courses course, double unitPrice) {
		course.setUnitPrice(unitPrice);
		System.out.println(course.getName()+ " Adlý kursunuzun fiyatý "+ unitPrice + " olarak deðiþtirilmiþtir");
	}
	public void CourseDayManager (Courses course,String content, int assignmentCount,int day) {
		CoursesDays temp = new CoursesDays(content,assignmentCount);
		course.setDay(temp, day-1);
		System.out.println(day + ". Günün içeriði \"" + course.getDay()[day-1].content + "\" ve toplam ödev sayýsý \"" + course.getDay()[day-1].assignment.length + "\" olarak ayarlanmýþtýr." );
	}
}
