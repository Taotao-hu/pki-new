package com.pki.entity;

import javax.persistence.*;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user", catalog = "pki")
public class User implements java.io.Serializable {

	// Fields

	private Integer UId;
	private String UName;
	private Integer UType;
	private String UPsd;
	private String UAccount;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String UName, Integer UType, String UPsd, String UAccount) {
		this.UName = UName;
		this.UType = UType;
		this.UPsd = UPsd;
		this.UAccount = UAccount;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "u_id", unique = true, nullable = false)
	public Integer getUId() {
		return this.UId;
	}

	public void setUId(Integer UId) {
		this.UId = UId;
	}

	@Column(name = "u_name")
	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	@Column(name = "u_type")
	public Integer getUType() {
		return this.UType;
	}

	public void setUType(Integer UType) {
		this.UType = UType;
	}

	@Column(name = "u_psd")
	public String getUPsd() {
		return this.UPsd;
	}

	public void setUPsd(String UPsd) {
		this.UPsd = UPsd;
	}

	@Column(name = "u_account")
	public String getUAccount() {
		return this.UAccount;
	}

	public void setUAccount(String UAccount) {
		this.UAccount = UAccount;
	}

}