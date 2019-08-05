package repository;

import java.util.List;

import model.MemberAccount;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberAccountRepository extends JpaRepository<MemberAccount, String>{
	// ユーザＩＤをキーにレコードを取得
	// JPAの命名規約は以下を参照
	// https://docs.spring.io/spring-data/data-jpa/docs/1.4.3.RELEASE/reference/html/jpa.repositories.html#jpa.query-methods
	public List<MemberAccount> findByLoginId(String loginId);
}
