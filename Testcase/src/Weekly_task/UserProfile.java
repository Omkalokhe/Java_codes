package Weekly_task;

public class UserProfile {
		String name;
		int age;
		
		public UserProfile() {
			name="Om";
			age=21;
		}
		void showProfile() {
			String city="Pune";
			System.out.println(name+" "+age+" "+city);
		}
		public static void main(String[] args) {
			UserProfile obj=new UserProfile();
			obj.showProfile();
		}
}

