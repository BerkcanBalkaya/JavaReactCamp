package day3Assignment2;

public class InstructorManager extends UserManager {
	public void userAdd(User user) {
		System.out.println(user.getName()+"Ýsimli eðitmen kaydý yapýlmýþtýr");
	}
	public void userLogin(User user) {
		System.out.println(user.getName()+ " isimli eðitmen sisteme giriþ yapmýþtýr.");
	}

}
