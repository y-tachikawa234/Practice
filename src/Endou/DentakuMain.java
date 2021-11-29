package Endou;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DentakuMain{	
	public static void main (String[] args) {
		//メッセージを出力
		DentakuMessage.printMessage();
		// 演算子の定数を宣言。
		final String OPERATOR_ADD = "+";
		final String OPERATOR_SUB = "-";
		final String OPERATOR_MUL = "*";
		final String OPERATOR_DIV = "/";
		// 数値1、演算子、数値2、計算結果の変数を宣言。
		BigDecimal num1 = BigDecimal.ZERO;
		String ope = null;
		BigDecimal num2 = BigDecimal.ZERO;
		BigDecimal result = BigDecimal.ZERO;
		
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
		if (!OPERATOR_ADD.equals(ope) && !OPERATOR_SUB.equals(ope) && !OPERATOR_MUL.equals(ope)
				&& !OPERATOR_DIV.equals(ope)) {
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

		//計算クラスのメソッドで計算の処理を行う
		DentakuCalc calculation = new DentakuCalc();
		result = calculation.calc(num1,ope,num2);
		result = calculation.resultValue(result);
		
		//計算結果の出力
		System.out.println(
				String.format("計算結果は%s %s %s = %sです。", String.valueOf(num1), ope, String.valueOf(num2), String.valueOf(result)));
	}
	
}