
/*
 * try-catch文サンプルプログラム
 * ・String sの中身がnullにし長さを確認
 * ・エラー時にエラー内容表示
 */
package error_main;

public class Main2 {

	public static void main(String[] args) {

		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			//エラー内容表示
			System.out.println("--スタックトレース(ここから)--");
			e.printStackTrace();
			System.out.println("--スタックトレース(ここまで)--");
		}

	}

}
