package stackjava.design.pattern.behavior.observer;

public interface Subject {
	void attach(Observer observer);

	void detach(Observer observer);

	void notify2Observer();
}
