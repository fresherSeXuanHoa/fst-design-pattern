package stackjava.design.pattern.behavior.observer;

public class Logger implements Observer {

	public void update(User user) {
		System.out.println("Logger: " + user);
	}

	public void update(Admin admin) {
		System.err.println("Logger: " + admin);
	}

}
