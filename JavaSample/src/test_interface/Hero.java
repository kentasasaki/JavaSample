package test_interface;

public class Hero extends Character {

	//コンストラクタ
	public Hero() {
		setname("勇者");
		sethp(100);
		setattackPower(30);
	}

	//コンストラクタ
	public Hero(String name, int hp, int attackpower) {
		setname(name);
		sethp(hp);
		setattackPower(attackpower);
	}

	@Override
	public void run() {
		System.out.println(getname() + "は逃げ出しました");

	}
}
