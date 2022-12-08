package stackjava.design.pattern.structural.composite;

import java.util.Arrays;

public class Application {
	public static void main(String[] args) {
		FileComponent cmd = new FileLeaf("Command Prompt", 20);
		FileComponent regedit = new FileLeaf("Regedit", 10);
		FileComponent system = new FolderComposite("System32", Arrays.asList(cmd, regedit));

		cmd.copy();
		regedit.cut();

		System.out.println(cmd.getSize());
		System.out.println(regedit.getSize());
		System.out.println(system.getSize());
	}
}
