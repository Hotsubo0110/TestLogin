package controller;
import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import model.MemberAccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import repository.MemberAccountRepository;
import util.EncryptionUtil;
import validation.Validate01;
import form.LoginForm;

@Controller
public class LoginProcesController {

	// ＤＢ操作用リポジトリ
	@Autowired
	MemberAccountRepository memberReq;

	// 初期表示
	@RequestMapping(value = "/", method = GET)
    public String show() {
        // login.jspを表示
        return "login";
    }

	// ログインボタン押下時の処理
	@RequestMapping(value = "/login", method = POST)
	public String login(
			Model model,
			@Validated(Validate01.class) @ModelAttribute("loginForm") LoginForm loginForm,
			BindingResult result) throws NoSuchAlgorithmException {

		// エラー時用にFormの値を再設定
		model.addAttribute("userId", loginForm.getUserId());
		model.addAttribute("loginPassword", loginForm.getLoginPassword());

		if (result.hasErrors()) {
			// 入力値エラー（login.jspを表示）
			return "login";
		}

		// 画面に入力されたユーザＩＤをキーにメンバ情報を取得
		List<MemberAccount> memberList = memberReq.findByLoginId(loginForm.getUserId());

		if (memberList.size() > 0) {
			// 画面に入力されたパスワードを暗号化
			EncryptionUtil eu = new EncryptionUtil();
			String password = eu.createDigest(loginForm.getLoginPassword());

			// パスワードチェック
			MemberAccount ma = memberList.get(0);
			if (password.equals(ma.getPassword())) {
				// パスワード一致（top.jspを表示）
				// top.jspのuserNameにメンバ名称を表示
				model.addAttribute("userName", memberList.get(0).getMember().getKeiyakuMeigi());
				return "top";
			}
		}

		// 入力されたユーザＩＤ／パスワードがＤＢ値と不整合（login.jspを表示）
		return "login";
	}
}