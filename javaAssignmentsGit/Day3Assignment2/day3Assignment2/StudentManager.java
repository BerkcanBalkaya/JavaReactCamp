package day3Assignment2;

public class StudentManager extends UserManager {
	public void userAdd(Student user) {
		System.out.println(user.getName() + " �simli ��renci kayd� yap�lm��t�r");
	}

	public void scoring(Instructor user, float score) {
		user.setInstructorScore(score);
		System.out.println(user.getName() + " isimli e�itmenin �u anki puan� " + user.getInstructorScore());
	}
	
	public void userLogin(User user) {
		System.out.println(user.getName()+ " isimli ��renci sisteme giri� yapm��t�r.");
	}

}
