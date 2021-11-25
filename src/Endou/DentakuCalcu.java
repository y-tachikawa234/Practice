package Endou;

import java.math.BigDecimal;

public class DentakuCalcu {
	BigDecimal calc(BigDecimal num1,String ope,BigDecimal num2){
	// 定数を宣言。
	final String ADD_OPERATORBUTTON = "+";
	final String SUB_OPERATORBUTTON = "-";
	final String MUL_OPERATORBUTTON = "*";
	final String DIV_OPERATORBUTTON = "/";
	// 変数を宣言
	BigDecimal result = BigDecimal.valueOf(0);

		// 計算処理
		// 計算結果	
        switch(ope){
        	case ADD_OPERATORBUTTON:
        		result = num1.add(num2);
            	result = result.setScale(2, BigDecimal.ROUND_HALF_UP);
            	result = result.stripTrailingZeros();
            	break;        	 
        	case SUB_OPERATORBUTTON:
        		result = num1.subtract(num2);
            	result = result.setScale(2, BigDecimal.ROUND_HALF_UP);
            	result = result.stripTrailingZeros();
	        	break;
	        case MUL_OPERATORBUTTON:
	        	result = num1.multiply(num2);
            	result = result.setScale(2, BigDecimal.ROUND_HALF_UP);
            	result = result.stripTrailingZeros();
	        	break;
	        case DIV_OPERATORBUTTON:
	        	if(num2.compareTo(BigDecimal.ZERO) == 0) {
	        		System.out.println("数値2に0が入力されています。");
	    			System.exit(0);
	        	}else {
		        	result = num1.divide(num2);
		        	result = result.setScale(2, BigDecimal.ROUND_HALF_UP);
		        	result = result.stripTrailingZeros();
		        	break;
	            }
		}return result;
	}
}