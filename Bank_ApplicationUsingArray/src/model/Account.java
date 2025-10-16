package model;

public class Account {

	private long accountNo;
	private String accountHolderName;
	private String address;
	private String email;
	private long mobileNo;
	private double balance = 5000;
	private String panCardNo;
	private String aadharCardNo;

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPanCardNo() {
		return panCardNo;
	}

	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}

	public String getAddharCardNo() {
		return aadharCardNo;
	}

	public void setAddharCardNo(String addharCardNo) {
		this.aadharCardNo = addharCardNo;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", address=" + address
				+ ", email=" + email + ", mobileNo=" + mobileNo + ", balance=" + balance + ", panCardNo=" + panCardNo
				+ ", addharCardNo=" + aadharCardNo + "]";
	}

}
