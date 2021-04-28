package oopOdev;

public class Courses {
	int id;
	private String name;
	private String instructor;
	private double unitPrice;
	private String courseState = "Devam Etmekte";
//	Burada özel olarak kurslarýmýzýn içerisinde bulunacak günler için ayrý bir nesne tipi kullanýlmýþtýr.
	private CoursesDays[] coursesDays;
	public Courses() {
		System.out.println("Kurs template oluþturuldu");
	}
//	CoursesDays dizi olduðundan boyutuna oluþturulurken karar verilmiþtir ve daha sonradan CourseManager tarafýnda 
	public Courses(int id, String name, String instructor, double unitPrice,int dayCount) {
		this.id=id;
		this.setInstructor(instructor);
		this.setName(name);
		this.setUnitPrice(unitPrice);
		this.coursesDays= new CoursesDays[dayCount];
		System.out.println(name + " Adlý Kursunuz Oluþturulmuþtur.");
	}
	public String getCourseState() {
		return courseState;
	}
	public void setCourseState(String courseState) {
		this.courseState = courseState;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public CoursesDays[] getDay() {
		return coursesDays;
	}
	public void setDay(CoursesDays day, int index) {
		this.coursesDays[index] = day;
	}
}
