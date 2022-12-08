package stackjava.design.pattern.behavior.observer;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
	private String name;
	private List<String> roles;
}
