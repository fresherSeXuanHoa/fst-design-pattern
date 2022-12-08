package stackjava.design.pattern.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileLeaf implements FileComponent {
	private String name;
	private int size;

	public void copy() {
		System.out.println("File Copy " + name);
	}

	public void cut() {
		System.out.println("File Cut " + name);
	}

	public void paste() {
		System.out.println("File Paste " + name);
	}

	public void delete() {
		System.out.println("File Delete " + name);
	}

	public int getSize() {
		return size;
	}

}
