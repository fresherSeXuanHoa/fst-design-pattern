package stackjava.design.pattern.structural.composite;

public interface FileComponent {
	void copy();

	void cut();

	void paste();

	void delete();

	int getSize();
}
