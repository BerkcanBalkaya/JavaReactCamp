package oopOdev;
//	Kurslarýmýzýn bulunduracaðý günler için özel olarak oluþturulmuþ olan CourseDays classý bulunmaktadýr.
public class CoursesDays {
	String content;
	String assignment[];
//	Constructor tanýmlamasý yapýlmýþtýr. Burada þimdilik sadece ödev sayýsýna ve dersin içeriðine kara verilmiþtir.
	public CoursesDays(String content, int assignmentCount) {
		this.content=content;
		this.assignment = new String[assignmentCount];
	}
	
}
