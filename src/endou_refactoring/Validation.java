package endou_refactoring;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * 入力チェッククラス.
 * 
 * @author yuta.tachikawa
 *
 */
public class Validation {
	
	//数値不備フォーマット 
	private static final String ERR_INPUT_MESSAGE_NUM = "数値%sには数値を入力してください。";
	
	// 演算子不備フォーマット
	private static final String ERR_INPUT_MESSAGE_OPERATOR = "2つ目の値には演算子(+,-,*,/)のいずれかを入力してください。";
	
	// 数値不備(0入力)フォーマット
	private static final String ERR_INPUT_MESSAGE_TRAL_0 = "数値2に0が入力されています。"; 
	
	// 定数0
	private static final String ZERO = "0";
	
	
	/**
	 * 入力チェックメソッド.
	 * 
	 * @param num1 数値1
	 * @param ope 演算子
	 * @param num2 数値2
	 * @return チェック結果DTO
	 */
	public CheckRsultDto checkInputValue(String num1, String ope, String num2) {
		
		if (!isNumeric(num1)) {
			
			CheckRsultDto dto = new CheckRsultDto();
			dto.setErrFlg(true);
			dto.setErrorMessage(String.format(ERR_INPUT_MESSAGE_NUM, "1"));
			return dto;
			
		} else if (!isNumeric(num2)) {
			
			CheckRsultDto dto = new CheckRsultDto();
			dto.setErrFlg(true);
			dto.setErrorMessage(String.format(ERR_INPUT_MESSAGE_NUM, "2"));
			return dto;
			
		} else if (isSymbol(ope)) {
			
			CheckRsultDto dto = new CheckRsultDto();
			dto.setErrFlg(true);
			dto.setErrorMessage(ERR_INPUT_MESSAGE_OPERATOR);
			return dto;
			
		} else if (ZERO.equals(num2) && OperatorConstant.OPERATOR_DIV.equals(ope)) {
			
			CheckRsultDto dto = new CheckRsultDto();
			dto.setErrFlg(true);
			dto.setErrorMessage(ERR_INPUT_MESSAGE_TRAL_0);
			
		}

		return new CheckRsultDto();
	}
	
	/**
	 * 数値チェック.
	 * 
	 * @param value 入力値
	 * @return チェック結果
	 */
	private boolean isNumeric(String value) {
		
		try {
			
			new BigDecimal(value);
			
		} catch (NumberFormatException e) {
			
			return false;
			
		}
		
		return true;
	}
	
	/**
	 * 演算子チェック.
	 * 
	 * @param value 入力値
	 * @return チェック結果
	 */
	private boolean isSymbol(String value) {
		
		return !Arrays.asList(
				OperatorConstant.OPERATOR_ADD,
				OperatorConstant.OPERATOR_DIV,
				OperatorConstant.OPERATOR_MUL,
				OperatorConstant.OPERATOR_SUB)
				.contains(value);
	}
}
