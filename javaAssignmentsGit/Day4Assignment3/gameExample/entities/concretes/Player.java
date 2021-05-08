package gameExample.entities.concretes;

public class Player {
	String identityNumber;
	String firstName;
	String lastName;
	int birthYear;

	public Player(String identityNumber, String firstName, String lastName, int birthYear) {
		super();
		this.identityNumber = identityNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

}
