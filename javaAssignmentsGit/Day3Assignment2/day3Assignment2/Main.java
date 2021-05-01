package day3Assignment2;

public class Main {
	public static void main(String[] args) {
		Student berkcan = new Student(
				"username1","sifre1","berkcan@hotmail.com","Berkcan","Balkaya",
				"Adres1", new String[]{"Python","Java"}, new String[]{"C#"} 
				);
		Student ebu = new Student(
				"username2","sifre2","ebu@hotmail.com","Ebu","Yazýcý",
				"Adres2", new String[]{"Javascript","Java",""}, new String[]{"C#"} 
				);
		Instructor engin = new Instructor(
				"instructor1","sifre3","engin@hotmail.com","Engin","Demirog",
				"Adres3", new String[]{"Java","C#","Python"},"InstructorBiograpy");
		UserManager userManager = new UserManager();
		
		User[] users= new User[] {berkcan,ebu,engin};
		for (User user : users) {
			userManager.userAdd(user);
		}
		
		System.out.println();
		UserManager[] userManagers = new UserManager [] {
				new UserManager(), new StudentManager(),new InstructorManager() 
		};
		userManagers[1].userLogin(berkcan);
		userManagers[1].userLogin(ebu);
		userManagers[2].userLogin(engin);
		
		System.out.println();
		
		userManagers[1].scoring(engin, 5);
		userManagers[1].scoring(engin, 4.5f);
		userManagers[1].scoring(engin, 5);
		
	
		
	}

}
