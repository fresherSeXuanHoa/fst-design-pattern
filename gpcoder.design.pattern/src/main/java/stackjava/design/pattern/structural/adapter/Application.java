package stackjava.design.pattern.structural.adapter;

public class Application {
	public static void main(String[] args) {
		VietnameseTarget vietnameseTarget = new TranslatorAdapter(new JapaneseAdaptee());
		vietnameseTarget.send("Le Xuan Hoa");
	}
}
