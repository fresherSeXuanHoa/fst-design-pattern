package stackjava.design.pattern.structural.decorator;

public class Application {
	public static void main(String[] args) {
		EmployeeComponent employeeComponent = new Employee("Employee");
		employeeComponent.doTask();
		System.out.println(employeeComponent + " " + employeeComponent.hashCode());

		TeamMember teamMember = new TeamMember(employeeComponent);
		teamMember.report();
		System.out.println(teamMember + " " + teamMember.hashCode());

		Leader leader = new Leader(employeeComponent);
		leader.motivate();
		System.out.println(leader + " " + leader.hashCode());
	}
}
