package Endou;

public class DentakuMessage {

	final String LINE = "--------------------------------------------------------";
	final String SPACE = " ";

	public void printMessage() {
		// メッセージを出力
		System.out.println(LINE);
		System.out.println("Java電卓プログラム");
		System.out.println(SPACE);
		System.out.println("四則演算を行うプログラムです。");
		System.out.println("小数点を含む計算は四捨五入し小数点第2位まで表示します。");
		System.out.println("計算式に誤りがあるとエラーが発生します。");
		System.out.println("計算式は以下のように指定してください。");
		System.out.println(SPACE);
		System.out.println("指定方法①：数値1 演算子 数値2[Enter]");
		System.out.println(SPACE);
		System.out.println("指定方法②：数値1 [Enter]");
		System.out.println("　　　　　：演算子[Enter]");
		System.out.println("　　　　　：数値2 [Enter]");
		System.out.println(SPACE);
		System.out.println("演算子には+,-,*,/が指定できます。");
		System.out.println("上記以外を設定するとエラーが発生します。");
		System.out.println(SPACE);
		System.out.println(LINE);
		System.out.println(SPACE);
		System.out.println("値を入力してください。");

	}

}
