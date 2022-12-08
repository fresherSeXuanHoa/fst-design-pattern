package stackjava.design.pattern.behavior.observer;

public class Mailer implements Observer {

	public void update(User user) {
		System.out.println("Mailer: " + user);
	}

	public void update(Admin admin) {
		System.out.println("Mailer: " + admin);
	}

}
