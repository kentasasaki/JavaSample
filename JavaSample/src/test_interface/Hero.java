package test_interface;

public class Hero extends Character {

	//コンストラクタ
	public Hero() {
		this.name = "勇者";
		this.hp = 100;
		this.attackPower = 30;
	}

	//コンストラクタ
	public Hero(String name, int hp, int attackpower) {
		this.name = name;
		this.hp = hp;
		this.attackPower = attackpower;
	}

	@Override
	public void run() {
		System.out.println(this.name + "は逃げ出しました");

	}
}
