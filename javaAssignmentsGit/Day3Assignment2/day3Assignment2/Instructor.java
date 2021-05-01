package day3Assignment2;

public class Instructor extends User {
	private String[] ownedCourses;
	private float instructorScore = 0;
	private int totalAddedScore = 0;
	private String instructorBiography;

	
	public Instructor(String username, String password, String email, String name, String surname, String address,
			String[] ownedCourses, String instructorBiography) {
		super(username, password, email, name, surname, address);
		this.ownedCourses = ownedCourses;
		this.instructorBiography = instructorBiography;
	}

	public String[] getOwnedCourses() {
		return ownedCourses;
	}

	public void setOwnedCourses(String[] ownedCourses) {
		this.ownedCourses = ownedCourses;
	}

	public float getInstructorScore() {
		return instructorScore;
	}

	public void setInstructorScore(float instructorScore) {
		totalAddedScore++;
		this.instructorScore = (this.instructorScore * (totalAddedScore - 1)+instructorScore) / totalAddedScore;
	}

	public String getInstructorBiography() {
		return instructorBiography;
	}

	public void setInstructorBiography(String instructorBiography) {
		this.instructorBiography = instructorBiography;
	}
}
