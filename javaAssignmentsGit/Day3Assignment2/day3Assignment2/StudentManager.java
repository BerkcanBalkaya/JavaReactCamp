package day3Assignment2;

public class StudentManager extends UserManager {
	public void userAdd(Student user) {
		System.out.println(user.getName() + " Ýsimli öðrenci kaydý yapýlmýþtýr");
	}

	public void scoring(Instructor user, float score) {
		user.setInstructorScore(score);
		System.out.println(user.getName() + " isimli eðitmenin þu anki puaný " + user.getInstructorScore());
	}
	
	public void userLogin(User user) {
		System.out.println(user.getName()+ " isimli öðrenci sisteme giriþ yapmýþtýr.");
	}

}
