package stackjava.design.pattern.structural.adapter;

public class Application {
	public static void main(String[] args) {
		VietnameseTarget vietnameseTarget = new TranslatorAdapter(new JapaneseAdaptee(), new VietnameseAdaptee());
		JapaneseTarget japaneseTarget = new TranslatorAdapter(new JapaneseAdaptee(), new VietnameseAdaptee());
		
		vietnameseTarget.sendVietnamese("Le Xuan Hoa");
		japaneseTarget.sendJapanese("こんにちは");
	}
}
