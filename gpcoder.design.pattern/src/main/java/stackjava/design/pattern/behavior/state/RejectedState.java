package stackjava.design.pattern.behavior.state;

public class RejectedState implements State {

	public void request() {
		System.out.println("Rejected State");
	}
}
