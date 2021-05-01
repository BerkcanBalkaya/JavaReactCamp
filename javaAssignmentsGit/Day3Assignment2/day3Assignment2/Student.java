package day3Assignment2;

public class Student extends User {
	private String[] attendedCourses;
	private String[] ownedCertificates;

	public Student(String username, String password, String email, String name, String surname, String address,
			String[] attendedCourses, String[] ownedCertificates) {
		super(username, password, email, name, surname, address);
		this.attendedCourses = attendedCourses;
		this.ownedCertificates = ownedCertificates;
	}

	public String[] getAttendedCourses() {
		return attendedCourses;
	}

	public void setAttendedCourses(String[] attendedCourses) {
		this.attendedCourses = attendedCourses;
	}

	public String[] getOwnedCertificates() {
		return ownedCertificates;
	}

	public void setOwnedCertificates(String[] ownedCertificates) {
		this.ownedCertificates = ownedCertificates;
	}
}
