package test_interface;

public class MainTest {
	//メソッド　戦闘をする
	public static int attackTurn(Character attacker, Character target) {
		int damege = attacker.getattacPower();
		System.out.println(attacker.getname() + "の攻撃。" + target.getname() + "へ" + damege + "のダメージ！");
		return damege;
	}

	//HPの確認
	public static boolean lifeCheck(Character target, Character winner) {
		if (target.gethp() <= 0) {
			System.out.println(target.getname() + "のHPが無くなりました。");
			System.out.println(winner.getname() + "の勝利です！");
			return true;
		} else {
			return false;
		}

	}

	//戦闘結果を表示
	public static void viewHp(Character hero, Character goblin) {
		System.out.println(hero.getname() + ":HP=" + hero.gethp());
		System.out.println(goblin.getname() + ":HP=" + goblin.gethp());

	}

	public static void main(String[] args) {
		//インスタンス化
		Character hero = new Hero("勇者", 250, 20);
		Character goblin = new Goblin("ゴブリン");
		int damage = 0;
		boolean gameEnd = true;
		System.out.println(hero.getname() + ":HP=" + hero.gethp() + ":Ap=" + hero.getattacPower());
		System.out.println(goblin.getname() + ":HP=" + goblin.gethp() + ":Ap=" + goblin.getattacPower());

		while (gameEnd) {
			//戦闘　勇者の攻撃
			damage = (attackTurn(hero, goblin));
			//戦闘　ダメージ
			goblin.damage(damage);
			//HP確認
			if (lifeCheck(goblin, hero)) {
				break;
			}

			//戦闘　ゴブリンの攻撃
			damage = (attackTurn(goblin, hero));
			//戦闘　ダメージ
			hero.damage(damage);
			//HP確認
			if (lifeCheck(hero, goblin)) {
				break;
			}

			//勇者　ゴブリンのHP表示
			viewHp(hero, goblin);
		}

	}

}
