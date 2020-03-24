/*
 * テキストに記載されている文字を読み取り表示させるサンプルプログラム
 */
package Stream_main;

import java.io.FileReader;


public class MAin {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//try-with-resources
		try (FileReader fr = new FileReader("data.txt");) {
			int input = fr.read();
			//一文字ずつ読み込み表示
			//int→char変更
			while (input != -1) {
				System.out.print((char)input);
				input = fr.read();
			}

		} catch (Exception e) {

			System.out.println("何らかの例外が発生しました");

		}

	}
}
