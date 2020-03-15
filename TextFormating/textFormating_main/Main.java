package textFormating_main;

public class Main {

	public static void main(String[] args) {
		//表示のフォーマット作成
		final String format = "名前:%-10s 所持金:%,6d";
		//適当な名前、金額設定
		String s1 = String.format(format, "hero", 1000);
		String s2 = String.format(format, "goblin", 100);

		//表示
		System.out.println(s1);
		System.out.println(s2);

	}

}
