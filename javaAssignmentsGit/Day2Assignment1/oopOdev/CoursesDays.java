package oopOdev;
//	Kurslar�m�z�n bulunduraca�� g�nler i�in �zel olarak olu�turulmu� olan CourseDays class� bulunmaktad�r.
public class CoursesDays {
	String content;
	String assignment[];
//	Constructor tan�mlamas� yap�lm��t�r. Burada �imdilik sadece �dev say�s�na ve dersin i�eri�ine kara verilmi�tir.
	public CoursesDays(String content, int assignmentCount) {
		this.content=content;
		this.assignment = new String[assignmentCount];
	}
	
}
