package stackjava.design.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class AdminService implements Subject {

	private Admin admin;
	private List<Observer> observers;

	public AdminService(Admin admin) {
		this.admin = admin;
		this.observers = new ArrayList<Observer>();
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
			observer.update(admin);
		}
	}
	
	public void login() {
		this.notify2Observer();
	}

}
