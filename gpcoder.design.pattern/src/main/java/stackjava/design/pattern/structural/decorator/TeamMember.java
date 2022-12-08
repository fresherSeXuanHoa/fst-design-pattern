package stackjava.design.pattern.structural.decorator;

public class TeamMember extends EmployeeDecorator {

	public TeamMember(EmployeeComponent employeeComponent) {
		super(employeeComponent);
	}
	
	public void report() {
		System.out.println("Team member report!");
	}
}
