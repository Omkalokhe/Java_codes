package aggreagtion;

public class Student {
	private int srollNo;
	private String sname;
	private String saddress;
	private long mobileNo;
	private Collage collage;

	public int getSrollNo() {
		return srollNo;
	}

	public void setSrollNo(int srollNo) {
		this.srollNo = srollNo;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Collage getCollage() {
		return collage;
	}

	public void setCollage(Collage collage) {
		this.collage = collage;
	}

	@Override
	public String toString() {
		return "Student [srollNo=" + srollNo + ", sname=" + sname + ", saddress=" + saddress + ", mobileNo=" + mobileNo
				+ ", collage=" + collage + "]";
	}

}
