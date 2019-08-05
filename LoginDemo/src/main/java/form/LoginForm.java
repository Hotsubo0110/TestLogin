package form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import validation.Validate02;
import validation.Validate03;

public class LoginForm {

	@NotEmpty(groups={Validate02.class},message="ユーザIDを入力してください。")
	private String userId;

	@NotEmpty(groups={Validate02.class},message="パスワードを入力してください。")
	@Size(min=8,max=16,groups={Validate03.class},message="パスワードは{min}文字以上{max}文字以下です。")
	@Pattern(regexp="[a-zA-Z0-9]*",groups={Validate03.class},message="パスワードは英数である必要があります。")
	private String loginPassword;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
}
