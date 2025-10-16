package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentDetails")
public class Student {
	@Id
	@Column(name = "StudentID")
	private int sid;
	@Column(name = "studentName")
	private String sName;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + "]";
	}

}
