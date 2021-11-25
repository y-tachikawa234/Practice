package endou_refactoring;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 四則演算を行うクラス.
 * 
 * @author yuta.tachikawa
 *
 */
public class Calc {

	/**
	 * 計算メソッド.
	 * 
	 * @return 計算結果
	 */
	public BigDecimal calc(BigDecimal num1, BigDecimal num2, String operator) {
		
		return switch (operator) {
			case OperatorConstant.OPERATOR_ADD -> add(num1, num2);
			case OperatorConstant.OPERATOR_SUB -> subtract(num1, num2);
			case OperatorConstant.OPERATOR_MUL -> multiply(num1, num2);
			case OperatorConstant.OPERATOR_DIV -> divide(num1, num2);
			default -> throw new IllegalArgumentException("Unexpected value: " + operator);
		}; 
	}
	
	/**
	 * 加算メソッド.
	 * 
	 * @param num1 数値1
	 * @param num2 数値2
	 * @return 計算結果
	 */
	private BigDecimal add(BigDecimal num1, BigDecimal num2) {
		return toScale(num1.add(num2));
	}
	
	/**
	 * 減算メソッド.
	 * 
	 * @param num1 数値1
	 * @param num2 数値2
	 * @return 計算結果
	 */
	private BigDecimal subtract(BigDecimal num1, BigDecimal num2) {
		return toScale(num1.subtract(num2));
	}
	
	/**
	 * 乗算メソッド.
	 * 
	 * @param num1 数値1
	 * @param num2 数値2
	 * @return 計算結果
	 */
	private BigDecimal multiply(BigDecimal num1, BigDecimal num2) {
		return toScale(num1.multiply(num2));
	}
	
	/**
	 * 除算メソッド.
	 * 
	 * @param num1 数値1
	 * @param num2 数値2
	 * @return 計算結果
	 */
	private BigDecimal divide(BigDecimal num1, BigDecimal num2) {
		return toScale(num1.divide(num2));
	}
	
	/**
	 * 四捨五入メソッド.
	 * 
	 * @param value 計算結果
	 * @return 計算結果
	 */
	private BigDecimal toScale(BigDecimal value) {
		
		return value.setScale(2, RoundingMode.HALF_UP).stripTrailingZeros();
	}
}
