/*
 * Mapのサンプルプログラム
 * ・Mapにkeyとkey値の格納
 * ・Mapの値を確認
 * ・入力された値がMapのkeyに含まれたいるか判定
 */
package mapMain;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//key,値の順番
		Map<String, Integer> prefs = new HashMap<>();
		prefs.put("東京", 1000);
		prefs.put("埼玉", 1200);
		prefs.put("千葉", 1000);

		//ペアになっているkeyから値を代入
		int tokyo = prefs.get("東京");
		//中身確認
		System.out.print("東京の人口は" + tokyo);
		System.out.println("\n");

		//for文で中身の確認
		//String keyにMapのkeyが入る
		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + "の人口は" + value);
		}

		//都道府県名が入力
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println(name);

		//入力された都道府県名がMapkeyに含まれているか判断
		if (prefs.containsKey(name)) {
			System.out.println("含まれています");
			System.out.println(name + "の人口は" + prefs.get(name));
		} else {
			System.out.println(name + "は含まれていません");
		}
	}

}
