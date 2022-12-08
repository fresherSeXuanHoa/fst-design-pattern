package stackjava.design.pattern.structural.decorator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDecorator implements EmployeeComponent {
	private String name;

	protected EmployeeComponent employeeComponent;

	public EmployeeDecorator(EmployeeComponent employeeComponent) {
		this.employeeComponent = employeeComponent;
	}

	public void doTask() {
		System.out.println("Employee Decorator do task!");
	}

}
