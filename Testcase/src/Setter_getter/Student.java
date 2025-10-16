package Setter_getter;

public class Student {
		private int rollNo;
		private String name;
		private String address;
		private double percentage;
		

		public int getRollNo() {
			return rollNo;
		}

		public void setRollNo(int rn) {
			rollNo = rn;
		}
		
		public void setAddress(String add) {
			address = add;
		}
		
		public void setPercentage(double perc) {
			percentage = perc;
		}


		public void setName(String n) {
			name = n;
		}

		public String getAddress() {
			return address;
		}

		public double getPercentage() {
			return percentage;
		}
		
		public String getName() {
			return name;
		}

		
}
