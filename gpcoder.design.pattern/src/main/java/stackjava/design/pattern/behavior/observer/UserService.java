package stackjava.design.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class UserService implements Subject {

	private User user;
	private List<Observer> observers;

	public UserService(User user) {
		this.observers = new ArrayList<Observer>();
		this.user = user;
	}

	public void attach(Observer observer) {
		if (!observers.contains(observer))
			observers.add(observer);
	}

	public void detach(Observer observer) {
		if (observers.contains(observer)) {
			observers.remove(observer);
		}
	}

	public void notify2Observer() {
		for (Observer observer : observers) {
			observer.update(user);
		}
	}

	public void changeUserName(String name) {
		user.setName(name);
		this.notify2Observer();
	}
}
