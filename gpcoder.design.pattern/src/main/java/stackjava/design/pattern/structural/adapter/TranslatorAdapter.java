package stackjava.design.pattern.structural.adapter;

public class TranslatorAdapter implements VietnameseTarget {

	private JapaneseAdaptee japaneseAdaptee;

	public TranslatorAdapter(JapaneseAdaptee japaneseAdaptee) {
		this.japaneseAdaptee = japaneseAdaptee;
	}

	public void send(String msg) {
		japaneseAdaptee.recieve(this.translate(msg));
	}

	public String translate(String msg) {
		return "こんにちは";
	}

}
