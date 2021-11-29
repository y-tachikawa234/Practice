package Endou;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DentakuCalc {
	public BigDecimal calc(BigDecimal num1, String ope, BigDecimal num2) {
		// 定数を宣言。
		final String OPERATOR_ADD = "+";
		final String OPERATOR_SUB = "-";
		final String OPERATOR_MUL = "*";
		final String OPERATOR_DIV = "/";
		// 変数を宣言
		BigDecimal result = BigDecimal.ZERO;

		// 入力された演算子に沿って計算を行い結果を返す
		switch (ope) {
		case OPERATOR_ADD:
			result = num1.add(num2);
			break;
		case OPERATOR_SUB:
			result = num1.subtract(num2);
			break;
		case OPERATOR_MUL:
			result = num1.multiply(num2);
			break;
		case OPERATOR_DIV:
			if (num2.compareTo(BigDecimal.ZERO) == 0) {
				System.out.println("数値2に0が入力されています。");
				System.exit(0);
			} else {
				result = num1.divide(num2, 2, RoundingMode.HALF_UP);
			}
		}
		return result;
	}
	
	public BigDecimal resultValue(BigDecimal result) {
		BigDecimal resultValue = BigDecimal.ZERO;
		resultValue =result.setScale(2, RoundingMode.HALF_UP);
		resultValue = resultValue.stripTrailingZeros();
		return resultValue;
	}
}