package test_interface;

public class Goblin extends Character {

	//コンストラクタ
	public Goblin(String name) {
		this.name = name;
		this.hp = 60;
		this.attackPower = 10;
	}

	@Override
	public int attack() {
		// TODO 自動生成されたメソッド・スタブ
		return this.attackPower;
	}

	@Override
	public void run() {
		System.out.println(this.name + "は逃げ出しました");
	}

	@Override
	public void damage(int damage) {
		this.hp -= damage;
	}
}
