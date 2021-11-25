package endou_refactoring;

import java.math.BigDecimal;
import java.util.Scanner;

public class DentakuMain {

	public static void main(String[] args) {
		
		var consoleMessage = new ConsoleMessage();
		consoleMessage.defaultMessage();
		
		Scanner sc = new Scanner(System.in);
		
		String num1 = sc.nextLine();
		consoleMessage.inputMessage("1", num1);
		
		String operator = sc.nextLine();
		consoleMessage.inputMessage("2", operator);
		
		String num2 = sc.nextLine();
		consoleMessage.inputMessage("3", num2);
		sc.close();
		
		var validation = new Validation();
		CheckRsultDto checkResult = validation.checkInputValue(num1, operator, num2);
		
		if (checkResult.isErrFlg()) {
			
			consoleMessage.errorMessage(checkResult.getErrorMessage());
			System.exit(0);
		}
		
		var calc = new Calc();
		BigDecimal result = calc.calc(new BigDecimal(num1), new BigDecimal(num2), operator);
		
		consoleMessage.resultMessage(num1, operator, num2, result.toPlainString());
		System.exit(0);
	}
}
