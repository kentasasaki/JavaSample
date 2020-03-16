package date_main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//現在の日時を取得
		Date now =new Date();
		//カレンダークラス
		Calendar c =Calendar.getInstance();
		//現在の日時をセット
		c.setTime(now);
		System.out.print("現在の日時:"+c.get(Calendar.YEAR));
		//ずれを修正するため＋1
		System.out.print("/"+(c.get(Calendar.MONTH)+1));
		System.out.print("/"+c.get(Calendar.DATE));
		System.out.print(" "+c.get(Calendar.HOUR));
		System.out.print(":"+c.get(Calendar.MINUTE));
		System.out.print(":"+c.get(Calendar.SECOND));
		System.out.println();
		
		
		//表示の変換
		//書式文字列を指定
		SimpleDateFormat f =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//DateからStringを生成
		String s=f.format(now);
		System.out.println("現在の日時:"+s);
	}

}
