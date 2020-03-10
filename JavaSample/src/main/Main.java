package main;

import battle.Battle;
import test_interface.Character;
import test_interface.Goblin;
import test_interface.Hero;

public class Main {
	public static void main(String[] args) {
		//インスタンス化
		Character hero = new Hero("勇者", 250, 20);
		Character goblin = new Goblin("ゴブリン");
		Battle battle = new Battle();
		int damage = 0;
		boolean gameEnd = true;

		System.out.println(hero.getname() + ":HP=" + hero.gethp() + ":Ap=" + hero.getattacPower());
		System.out.println(goblin.getname() + ":HP=" + goblin.gethp() + ":Ap=" + goblin.getattacPower());

		while (gameEnd) {
			//戦闘　勇者の攻撃
			damage = battle.attackTurn(hero, goblin);
			//戦闘　ダメージ
			goblin.damage(damage);
			//戦闘　ダメージの表示
			System.out.println(hero.getname() + "の攻撃。" + goblin.getname() + "へ" + damage + "のダメージ！");
			//HP確認,
			if (battle.lifeCheck(goblin, hero)) {
				System.out.println(goblin.getname() + "のHPが無くなりました。");
				System.out.println(hero.getname() + "の勝利です！");
				//ループ用の変数の値変更　無限ループ回避
				gameEnd = false;
				//ループ抜ける
				break;
			}

			//戦闘　ゴブリンの攻撃
			damage = battle.attackTurn(goblin, hero);
			//戦闘　ダメージ
			hero.damage(damage);
			//戦闘　ダメージの表示
			System.out.println(goblin.getname() + "の攻撃。" + hero.getname() + "へ" + damage + "のダメージ！");

			//HP確認
			if (battle.lifeCheck(hero, goblin)) {
				System.out.println(hero.getname() + "のHPが無くなりました。");
				System.out.println(goblin.getname() + "の勝利です！");
				//ループ用の変数の値変更　無限ループ回避
				gameEnd = false;
				//ループ抜ける
				break;
			}

			//勇者　ゴブリンのHP表示
			battle.viewHp(hero, goblin);
		}

	}

}
