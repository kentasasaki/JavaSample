/*
 Setクラスのサンプルプログラム
 ・HashSet=順番バラバラに格納
 ・TreeSet=辞書順に格納
 ・LinkedHashSet=格納順に格納
 上記3点の値の格納、要素の確認
 */

package setClass_main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Set<String> colors = new HashSet<>();
		//値の格納
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		//重複無視
		colors.add("赤");
		System.out.println(colors.size());
		//要素の確認
		//順序バラバラ
		for (String s : colors) {
			System.out.print(s + "→");
		}

		System.out.println();

		Set<String> Colors2 = new TreeSet<>();
		//値の格納
		Colors2.add("赤");
		Colors2.add("青");
		Colors2.add("黄");
		//要素の確認
		//辞書順
		for (String s : Colors2) {
			System.out.print(s + "→");
		}

		System.out.println();

		Set<String> Colors3 = new LinkedHashSet<>();
		//値の格納
		Colors3.add("赤");
		Colors3.add("青");
		Colors3.add("黄");
		//要素の確認
		//格納順
		for (String s : Colors3) {
			System.out.print(s + "→");
		}
	}

}
