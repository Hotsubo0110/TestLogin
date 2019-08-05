package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MEMBER_ACCOUNT database table.
 * 
 */
@Entity
@Table(name="MEMBER_ACCOUNT")
@NamedQuery(name="MemberAccount.findAll", query="SELECT m FROM MemberAccount m")
public class MemberAccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MEMBER_ID")
	private long memberId;

	@Temporal(TemporalType.DATE)
	@Column(name="ACCOUNT_LOCK_DATE_TIME")
	private Date accountLockDateTime;

	@Column(name="ACCOUNT_LOCK_SUM_CNT")
	private BigDecimal accountLockSumCnt;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE_TIME")
	private Date createDateTime;

	@Column(name="CREATE_USER")
	private String createUser;

	@Column(name="DISPLAY_ORDER")
	private BigDecimal displayOrder;

	@Column(name="FIRST_TIME_FLG")
	private String firstTimeFlg;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE_TIME")
	private Date lastUpdateDateTime;

	@Column(name="LAST_UPDATE_USER")
	private String lastUpdateUser;

	@Column(name="LOGIN_ID")
	private String loginId;

	@Column(name="MAIL_ADDRESS")
	private String mailAddress;

	@Column(name="NEW_MESSAGE_FLG")
	private String newMessageFlg;

	private String password;

	//bi-directional one-to-one association to Member
	@OneToOne
	@JoinColumn(name="MEMBER_ID")
	private Member member;

	public MemberAccount() {
	}

	public long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public Date getAccountLockDateTime() {
		return this.accountLockDateTime;
	}

	public void setAccountLockDateTime(Date accountLockDateTime) {
		this.accountLockDateTime = accountLockDateTime;
	}

	public BigDecimal getAccountLockSumCnt() {
		return this.accountLockSumCnt;
	}

	public void setAccountLockSumCnt(BigDecimal accountLockSumCnt) {
		this.accountLockSumCnt = accountLockSumCnt;
	}

	public Date getCreateDateTime() {
		return this.createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public BigDecimal getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(BigDecimal displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getFirstTimeFlg() {
		return this.firstTimeFlg;
	}

	public void setFirstTimeFlg(String firstTimeFlg) {
		this.firstTimeFlg = firstTimeFlg;
	}

	public Date getLastUpdateDateTime() {
		return this.lastUpdateDateTime;
	}

	public void setLastUpdateDateTime(Date lastUpdateDateTime) {
		this.lastUpdateDateTime = lastUpdateDateTime;
	}

	public String getLastUpdateUser() {
		return this.lastUpdateUser;
	}

	public void setLastUpdateUser(String lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}

	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getMailAddress() {
		return this.mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getNewMessageFlg() {
		return this.newMessageFlg;
	}

	public void setNewMessageFlg(String newMessageFlg) {
		this.newMessageFlg = newMessageFlg;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}