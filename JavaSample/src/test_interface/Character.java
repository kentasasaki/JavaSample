package test_interface;

public abstract class Character {
	private String name;
	private int hp;
	private int attackPower;

	//
	//	protected String name;
	//	protected int hp;
	//	protected int attackPower;
	//
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
	public void setname(String name) {
		this.name = name;
	}

	public void sethp(int hp) {
		this.hp = hp;
	}

	public void setattackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	//----------------------------------------

	//メソッド　逃走
	public abstract void run();

	//メソッド　ダメージ判定
	public void damage(int damage) {
		int hp = this.gethp();
		hp -= damage;
		this.sethp(hp);
	}

}
