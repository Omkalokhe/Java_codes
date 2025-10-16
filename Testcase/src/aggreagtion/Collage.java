package aggreagtion;

public class Collage {
	private int cId;
	private String cName;
	private String caddress;

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

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	@Override
	public String toString() {
		return "Collage [cId=" + cId + ", cName=" + cName + ", caddress=" + caddress + "]";
	}

}
