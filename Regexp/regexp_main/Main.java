/*入力されたユーザー名が入力規則を守っているか判定するプログラム。
 * 下記プログラムの流れ
 * 1.名前を入力する
 * 2.静的メンバのRegexp.isValidNameで入力規則が守られているか判定
 * 3.結果を表示
 */

package regexp_main;

import java.util.Scanner;
import regexp.Regexp;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("【ユーザー名の入力規則】");
		System.out.println("1：入力値は８文字");
		System.out.println("2：入力文字は半角英数字");
		System.out.println();
		System.out.print("ユーザー名の入力をしてください：");

		Scanner scan = new Scanner(System.in);
		String name = scan.next();

		if (Regexp.isValidName(name)) {
			System.out.print("ユーザー名：" + name);
		} else {
			System.out.print("入力規則を守ってください");
		}

	}

}
