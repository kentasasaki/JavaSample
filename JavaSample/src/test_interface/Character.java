package test_interface;

public abstract class Character {

	String name;
	protected int hp;
	protected int attackPower;

	//-----------geter------------------------
	//カプセル化　ゲッター　nameを取得
	public String getname() {
		return this.name;
	}

	//カプセル化　ゲッター　Hpを取得
	public int gethp() {
		return this.hp;
	}

	//カプセル化　ゲッター　attackPowerの取得
	public int getattacPower() {
		return this.attackPower;
	}
	//----------------------------------------

	//-----------seter------------------------
	//カプセル化　セッター　HPの設定
	public void sethp(int hp) {
		this.hp = hp;
	}

	//メソッド　逃走
	public abstract void run();

	//メソッド　ダメージ判定
	public void damage(int damage) {
		int hp = this.gethp();
		hp -= damage;
		this.sethp(hp);
	}

}
