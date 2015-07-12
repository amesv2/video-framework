package org.vrits.model;

import java.util.Date;

/**
 * @author BOLLAPUH
 * 
 */
public class User {

	private Long userId;
	private String firstName;
	private String secondName;
	private String profileName;
	private String password;
	private Date dob;
	private String mailId;
	private String mobileNum;
	private String gender;
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName
				+ ", secondName=" + secondName + ", profileName=" + profileName
				+ ", password=" + password + ", dob=" + dob + ", mailId="
				+ mailId + ", mobileNum=" + mobileNum + ", gender=" + gender
				+ "]";
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}