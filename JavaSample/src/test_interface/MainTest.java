package test_interface;

public class MainTest {

	public static void main(String[] args) {
		//インスタンス化
		Character hero = new Hero("勇者", 250, 20);
		Character goblin = new Goblin("ゴブリン");
		//ダメージ
		int damage = 0;
		//戦闘中のフラグ
		boolean battle = true;
		//ターン数
		int battleTurn = 0;
		Character character[] = { hero, goblin, null };
		System.out.println(character[0].name + ":HP=" + character[0].hp + ":Ap=" + character[0].attackPower);
		System.out.println(character[1].name + ":HP=" + character[1].hp + ":Ap=" + character[1].attackPower);

		//戦闘開始
		while (battle) {
			battleTurn++;
			System.out.println("【" + battleTurn + "ターン目】");

			character[0] = hero;
			character[1] = goblin;
			character[2] = null;
			for (int j = 0; j < 2; j++) {
				damage = character[0].attack();
				character[1].damage(damage);
				System.out.println(character[0].name + "の攻撃。" + character[1].name + "へ" + damage + "のダメージ！");
				//攻撃対象のHPがゼロの以下で戦闘終了
				if (character[1].hp <= 0) {
					battle = false;
					break;
				}

				character[2] = character[0];
				character[0] = character[1];
				character[1] = character[2];
			}
		}
		System.out.println("戦闘終了。" + character[0].name + "の勝利です！");
	}

}
