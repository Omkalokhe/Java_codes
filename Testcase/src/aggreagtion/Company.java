package aggreagtion;

public class Company {
	private int cId;
	private String cName;
	private String cAddress;
	private int pincode;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Company [cId=" + cId + ", cName=" + cName + ", cAddress=" + cAddress + ", pincode=" + pincode + "]";
	}

}
