package battle;

import test_interface.Character;

public class Battle {

	//メソッド　戦闘をする
	public  int attackTurn(Character attacker, Character target) {
		int damege = attacker.getattacPower();
		return damege;
	}

	//HPの確認
	public  boolean lifeCheck(Character target, Character winner) {
		if (target.gethp() <= 0) {
			System.out.println(target.getname() + "のHPが無くなりました。");
			System.out.println(winner.getname() + "の勝利です！");
			return true;
		} else {
			return false;
		}

	}

	//戦闘結果を表示
	public  void viewHp(Character hero, Character goblin) {
		System.out.println(hero.getname() + ":HP=" + hero.gethp());
		System.out.println(goblin.getname() + ":HP=" + goblin.gethp());
	}

}
