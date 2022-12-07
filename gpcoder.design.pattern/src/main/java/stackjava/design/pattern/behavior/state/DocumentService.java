package stackjava.design.pattern.behavior.state;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentService {
	private State state;

	public void checkState() {
		this.state.request();
	}
}
