package endou_refactoring;

/**
 * 入力チェック結果DTO.
 * 
 * @author yuta.tachikawa
 */
public class CheckRsultDto {

	/**
	 * エラーフラグ.
	 */
	private boolean errFlg;

	/**
	 * エラーメッセージ.
	 */
	private String errorMessage;

	/**
	 * @return errFlg
	 */
	public boolean isErrFlg() {
		return errFlg;
	}

	/**
	 * @return errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errFlg セットする errFlg
	 */
	public void setErrFlg(boolean errFlg) {
		this.errFlg = errFlg;
	}

	/**
	 * @param errorMessage セットする errorMessage
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
