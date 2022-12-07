package stackjava.design.pattern.behavior.state;

public class SubmittedState implements State {

	public void request() {
		System.out.println("Submitted State!");
	}

}
