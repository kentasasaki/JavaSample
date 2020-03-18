package arrayList_main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("勇者");
		Hero h2 = new Hero("魔法使い");
		List<Hero> hero = new ArrayList<Hero>();
		hero.add(h1);
		hero.add(h2);

		//for文で呼び出し
		for (int i = 0; i < hero.size(); i++) {
			System.out.println(hero.get(i).getName());
		}

		//拡張for文で呼び出し
		for (Hero h : hero) {
			System.out.println(h.getName());
		}

		//イテレーターの宣言
		Iterator<Hero> it = hero.iterator();
		//イテレーターで呼び出し
		while (it.hasNext()) {
			Hero h = it.next();
			System.out.println(h.getName());
		}

	}

}
