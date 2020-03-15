package test_interface;

public class Goblin extends Character {

	//コンストラクタ
	public Goblin(String name) {
		setname(name);
		sethp(60);
		setattackPower(10);

	}

	public void run() {
		System.out.println(getname() + "は逃げ出しました");
	}

}
