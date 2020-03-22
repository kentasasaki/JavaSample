
/*
 * try-with-resources文
 */
package error_main;

import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		//try-catchを抜けるときfw.closeしてくれる
		try (FileWriter fw = new FileWriter("data.txt");) {

			//data.txtへ書き込み
			fw.write("hello");

		} catch (Exception e) {

			System.out.println("何らかの例外が発生しました");

		}
	}

}
