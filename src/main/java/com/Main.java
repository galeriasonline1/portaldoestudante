package com;

public class Main {

	public static void main(String[] args) {
		User test = new User();
		
		UserDao tdao = new UserDao();
		test.setLogin("admin");
		test.setPassword("12345");
		tdao.insert(test);
		
		for (User t : tdao.list()) {
			System.out.println("Login: " + t.getLogin() + " Password: " + t.getPassword());
		}
	}

}
