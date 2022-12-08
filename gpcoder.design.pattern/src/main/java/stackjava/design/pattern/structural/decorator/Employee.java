package stackjava.design.pattern.structural.decorator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements EmployeeComponent {
	private String name;

	public void doTask() {
		System.out.println("Employee do task!");
	}
}
