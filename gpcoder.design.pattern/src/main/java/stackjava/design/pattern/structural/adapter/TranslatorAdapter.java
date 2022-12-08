package stackjava.design.pattern.structural.adapter;

public class TranslatorAdapter implements VietnameseTarget, JapaneseTarget {

	private JapaneseAdaptee japaneseAdaptee;
	private VietnameseAdaptee vietnameseAdaptee;

	public TranslatorAdapter(JapaneseAdaptee japaneseAdaptee, VietnameseAdaptee vietnameseAdaptee) {
		this.japaneseAdaptee = japaneseAdaptee;
		this.vietnameseAdaptee = vietnameseAdaptee;
	}

	public String translateJapanese(String msg) {
		return "こんにちは";
	}

	public String translateVietnamese(String msg) {
		return "Le Xuan Hoa";
	}

	public void sendJapanese(String msg) {
		vietnameseAdaptee.receive(this.translateVietnamese(msg));
	}

	public void sendVietnamese(String msg) {
		japaneseAdaptee.recieve(this.translateJapanese(msg));
	}
}
