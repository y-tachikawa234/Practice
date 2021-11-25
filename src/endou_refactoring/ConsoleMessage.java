package endou_refactoring;

/**
 * 電卓機能の標準出力クラス.
 * 
 * @author yuta.tachikawa
 */
public class ConsoleMessage {	
	
	private static final String INPUT_MESSAGE = "%sつ目の値の入力を確認 値： %s";
	
	private static final String RESULT_MESSAGE = "計算結果は%s %s %s = %sです。";
	
	/**
	 * 初期出力メッセージメソッド.
	 * 
	 */
	public void defaultMessage() {
		
		System.out.println("""
				--------------------------------------------------------
				Java電卓プログラム
				
				四則演算を行うプログラムです。
				小数点を含む計算は四捨五入し小数点第2位まで表示します。
				計算式に誤りがあるとエラーが発生します。
				計算式は以下のように指定してください。
				
				指定方法①：数値1 演算子 数値2[Enter]
				
				指定方法②：数値1 [Enter]
				          ：演算子[Enter]
				          ：数値2 [Enter]
				
				演算子には+,-,*,/が指定できます。
				上記以外を設定するとエラーが発生します。
				
				--------------------------------------------------------
				値を入力してください。
				""");
	}
	
	/**
	 * 初期出力メッセージメソッド.
	 * 
	 */
	public void inputMessage(String no, String value) {
		
		String msg = String.format(INPUT_MESSAGE, no, value);
		System.out.println(msg);
	}
	
	/**
	 * エラーメッセージ出力メソッド.
	 * 
	 */
	public void errorMessage(String msg) {
		System.out.println(msg);
	}
	
	/**
	 * 計算結果出力メソッド.
	 * 
	 */
	public void resultMessage(String num1, String operator, String num2, String result) {
		
		String msg = String.format(RESULT_MESSAGE, num1, operator, num2, result);
		System.out.println(msg);
	}
	

}
