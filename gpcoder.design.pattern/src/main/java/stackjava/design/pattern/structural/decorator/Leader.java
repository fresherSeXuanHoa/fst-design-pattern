package stackjava.design.pattern.structural.decorator;

public class Leader extends EmployeeDecorator {

	public Leader(EmployeeComponent employeeComponent) {
		super(employeeComponent);
	}

	public void motivate() {
		System.out.println("Leader motivate!");
	}
}
