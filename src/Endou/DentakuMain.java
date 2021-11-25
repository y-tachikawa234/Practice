package Endou;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DentakuMain{	
	public static void main (String[] args) {
		//メッセージを出力
		DentakuMessage msg = new DentakuMessage();
		msg.printMessage();
		// 演算子の定数を宣言。
		final String ADD_OPERATORBUTTON = "+";
		final String SUB_OPERATORBUTTON = "-";
		final String MUL_OPERATORBUTTON = "*";
		final String DIV_OPERATORBUTTON = "/";
		// 数値1、演算子、数値2、計算結果の変数を宣言。
		BigDecimal num1 = BigDecimal.valueOf(0);
		String ope = null;
		BigDecimal num2 = BigDecimal.valueOf(0);
		BigDecimal result = BigDecimal.valueOf(0);
		
		//スキャナークラスの初期化
		Scanner scan = new Scanner(System.in);
		// 数値1に入力される値が数値以外の場合エラーメッセージを出力、数値の場合は値を出力
		try {
			num1 = scan.nextBigDecimal();
			System.out.println("1つ目の値の入力を確認 値：" + num1);
		} catch (InputMismatchException e) {
			System.out.println("数値1には数値を入力してください。");
			System.exit(0);
		}
		// 演算子以外の場合エラーメッセージを出力
		ope = scan.next();
		if (!ADD_OPERATORBUTTON.equals(ope) && !SUB_OPERATORBUTTON.equals(ope) && !MUL_OPERATORBUTTON.equals(ope)
				&& !DIV_OPERATORBUTTON.equals(ope)) {
			System.out.println("2つ目の値には演算子(+,-,*,/)のいずれかを入力してください。");
			System.exit(0);
		} else {
			System.out.println("2つ目の値の入力を確認 値：" + ope);
		}

		// 数値2に入力される値が数値以外の場合エラーメッセージを出力、数値の場合は値を出力
		try {
			num2 = scan.nextBigDecimal();
		} catch (InputMismatchException e) {
			System.out.println("数値2に文字が入力されています。数値を入力してください。");
			System.exit(0);
		}
		System.out.println("3つ目の値の入力を確認 値：" + num2);
		scan.close();

		//計算クラスのメソッドで計算を行う
		DentakuCalc calculation = new DentakuCalc();
		result = calculation.calc(num1,ope,num2);
		//計算結果の出力
		System.out.println(
				String.format("計算結果は%s %s %s = %sです。", String.valueOf(num1), ope, String.valueOf(num2), String.valueOf(result)));
	}
	
}