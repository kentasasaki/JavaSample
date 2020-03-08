package test_interface;

public abstract class Character {

	String name;
	int hp;
	int attackPower;

	//メソッド　攻撃
	public abstract int attack();

	//メソッド　逃走
	public abstract void run();

	//メソッド　ダメージ判定
	public abstract void damage(int damage);

}
