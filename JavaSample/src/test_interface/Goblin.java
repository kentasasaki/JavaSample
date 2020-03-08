package test_interface;

public class Goblin extends Character {

	//コンストラクタ
	public Goblin(String name) {
		this.name = name;
		this.hp = 60;
		this.attackPower = 10;
	}

	public void run() {
		System.out.println(this.name + "は逃げ出しました");
	}

}
