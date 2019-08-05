package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the MEMBER database table.
 * 
 */
@Entity
@NamedQuery(name="Member.findAll", query="SELECT m FROM Member m")
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MEMBER_ID")
	private long memberId;

	@Column(name="ADDRESS_BANCHI")
	private String addressBanchi;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE_TIME")
	private Date createDateTime;

	@Column(name="CREATE_USER")
	private String createUser;

	@Column(name="KEIYAKU_MEIGI")
	private String keiyakuMeigi;

	@Column(name="KEIYAKU_MEIGI_HALF_KANA")
	private String keiyakuMeigiHalfKana;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_LOGIN_DATE_TIME")
	private Date lastLoginDateTime;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE_TIME")
	private Date lastUpdateDateTime;

	@Column(name="LAST_UPDATE_USER")
	private String lastUpdateUser;

	@Column(name="MOSHIKOMI_TANTO")
	private String moshikomiTanto;

	@Column(name="MOSHIKOMI_TANTO_HALF_KANA")
	private String moshikomiTantoHalfKana;

	@Column(name="MOSHIKOMI_TANTO_SHOZOKU")
	private String moshikomiTantoShozoku;

	@Column(name="MOSHIKOMI_TANTO_YAKUSHOKU")
	private String moshikomiTantoYakushoku;

	@Column(name="PHONE_EXT_NO")
	private String phoneExtNo;

	@Column(name="PHONE_NO")
	private String phoneNo;

	@Column(name="POST_CD")
	private String postCd;

	@Temporal(TemporalType.DATE)
	@Column(name="SERVICE_END_DATE")
	private Date serviceEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="SERVICE_START_DATE")
	private Date serviceStartDate;

	@Column(name="SERVICE_STATE")
	private String serviceState;

	private String shikuchoson;

	private String todofuken;

	@Column(name="TOSHA_TANTO_KASHO_CD1")
	private String toshaTantoKashoCd1;

	@Column(name="TOSHA_TANTO_KASHO_CD2")
	private String toshaTantoKashoCd2;

	@Column(name="TOSHA_TANTO_KASHO_CD3")
	private String toshaTantoKashoCd3;

	//bi-directional one-to-one association to MemberAccount
	@OneToOne(mappedBy="member")
	private MemberAccount memberAccount;

	public Member() {
	}

	public long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public String getAddressBanchi() {
		return this.addressBanchi;
	}

	public void setAddressBanchi(String addressBanchi) {
		this.addressBanchi = addressBanchi;
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

	public String getKeiyakuMeigi() {
		return this.keiyakuMeigi;
	}

	public void setKeiyakuMeigi(String keiyakuMeigi) {
		this.keiyakuMeigi = keiyakuMeigi;
	}

	public String getKeiyakuMeigiHalfKana() {
		return this.keiyakuMeigiHalfKana;
	}

	public void setKeiyakuMeigiHalfKana(String keiyakuMeigiHalfKana) {
		this.keiyakuMeigiHalfKana = keiyakuMeigiHalfKana;
	}

	public Date getLastLoginDateTime() {
		return this.lastLoginDateTime;
	}

	public void setLastLoginDateTime(Date lastLoginDateTime) {
		this.lastLoginDateTime = lastLoginDateTime;
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

	public String getMoshikomiTanto() {
		return this.moshikomiTanto;
	}

	public void setMoshikomiTanto(String moshikomiTanto) {
		this.moshikomiTanto = moshikomiTanto;
	}

	public String getMoshikomiTantoHalfKana() {
		return this.moshikomiTantoHalfKana;
	}

	public void setMoshikomiTantoHalfKana(String moshikomiTantoHalfKana) {
		this.moshikomiTantoHalfKana = moshikomiTantoHalfKana;
	}

	public String getMoshikomiTantoShozoku() {
		return this.moshikomiTantoShozoku;
	}

	public void setMoshikomiTantoShozoku(String moshikomiTantoShozoku) {
		this.moshikomiTantoShozoku = moshikomiTantoShozoku;
	}

	public String getMoshikomiTantoYakushoku() {
		return this.moshikomiTantoYakushoku;
	}

	public void setMoshikomiTantoYakushoku(String moshikomiTantoYakushoku) {
		this.moshikomiTantoYakushoku = moshikomiTantoYakushoku;
	}

	public String getPhoneExtNo() {
		return this.phoneExtNo;
	}

	public void setPhoneExtNo(String phoneExtNo) {
		this.phoneExtNo = phoneExtNo;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPostCd() {
		return this.postCd;
	}

	public void setPostCd(String postCd) {
		this.postCd = postCd;
	}

	public Date getServiceEndDate() {
		return this.serviceEndDate;
	}

	public void setServiceEndDate(Date serviceEndDate) {
		this.serviceEndDate = serviceEndDate;
	}

	public Date getServiceStartDate() {
		return this.serviceStartDate;
	}

	public void setServiceStartDate(Date serviceStartDate) {
		this.serviceStartDate = serviceStartDate;
	}

	public String getServiceState() {
		return this.serviceState;
	}

	public void setServiceState(String serviceState) {
		this.serviceState = serviceState;
	}

	public String getShikuchoson() {
		return this.shikuchoson;
	}

	public void setShikuchoson(String shikuchoson) {
		this.shikuchoson = shikuchoson;
	}

	public String getTodofuken() {
		return this.todofuken;
	}

	public void setTodofuken(String todofuken) {
		this.todofuken = todofuken;
	}

	public String getToshaTantoKashoCd1() {
		return this.toshaTantoKashoCd1;
	}

	public void setToshaTantoKashoCd1(String toshaTantoKashoCd1) {
		this.toshaTantoKashoCd1 = toshaTantoKashoCd1;
	}

	public String getToshaTantoKashoCd2() {
		return this.toshaTantoKashoCd2;
	}

	public void setToshaTantoKashoCd2(String toshaTantoKashoCd2) {
		this.toshaTantoKashoCd2 = toshaTantoKashoCd2;
	}

	public String getToshaTantoKashoCd3() {
		return this.toshaTantoKashoCd3;
	}

	public void setToshaTantoKashoCd3(String toshaTantoKashoCd3) {
		this.toshaTantoKashoCd3 = toshaTantoKashoCd3;
	}

	public MemberAccount getMemberAccount() {
		return this.memberAccount;
	}

	public void setMemberAccount(MemberAccount memberAccount) {
		this.memberAccount = memberAccount;
	}

}