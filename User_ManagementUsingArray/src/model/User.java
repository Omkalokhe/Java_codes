package model;

public class User {
	private int userId;
	private String userName;
	private String address;
	private String email;
	private long mobileNo;
	private String panCardNo;
	private String aadharCardNo;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPanCardNo() {
		return panCardNo;
	}

	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}

	public String getAadharCardNo() {
		return aadharCardNo;
	}

	public void setAadharCardNo(String aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", address=" + address + ", email=" + email
				+ ", mobileNo=" + mobileNo + ", panCardNo=" + panCardNo + ", aadharCardNo=" + aadharCardNo + "]";
	}

}
