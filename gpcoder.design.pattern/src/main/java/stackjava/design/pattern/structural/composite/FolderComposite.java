package stackjava.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class FolderComposite implements FileComponent {
	@NonNull
	private String name;

	private List<FileComponent> files = new ArrayList<FileComponent>();

	public void copy() {
		System.out.println("Folder copy " + name + ", " + files);
	}

	public void cut() {
		System.out.println("Folder cut " + name + ", " + files);

	}

	public void paste() {
		System.out.println("Folder paste " + name + ", " + files);
	}

	public void delete() {
		System.out.println("Folder delete " + name + ", " + files);
	}

	public int getSize() {
		int total = 0;
		for (FileComponent file : files) {
			total += file.getSize();
		}
		return total;
	}
}
