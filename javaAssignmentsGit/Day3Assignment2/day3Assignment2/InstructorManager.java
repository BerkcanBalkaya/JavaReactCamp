package day3Assignment2;

public class InstructorManager extends UserManager {
	public void userAdd(User user) {
		System.out.println(user.getName()+"�simli e�itmen kayd� yap�lm��t�r");
	}
	public void userLogin(User user) {
		System.out.println(user.getName()+ " isimli e�itmen sisteme giri� yapm��t�r.");
	}

}
