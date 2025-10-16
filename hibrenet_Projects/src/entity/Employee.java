package entity;

public class Employee {
		private int eid;
		private String eName;
		
		
		public int getEid() {
			return eid;
		}


		public void setEid(int eid) {
			this.eid = eid;
		}


		public String geteName() {
			return eName;
		}


		public void seteName(String eName) {
			this.eName = eName;
		}


		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", eName=" + eName + "]";
		}
}
