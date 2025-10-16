package Weekly_task;

public class LibraryBook {
		String title;
		String author;
		int pages;
		
		public LibraryBook() {
			title="ABC";
			author="XYZ";
			pages=200;
		}
		void printBook(){
			String location="Nigdi";
			int openingTime=8;
			System.out.println(title+" "+author+" "+pages+" "+location+" "+openingTime);
		}
		public static void main(String[] args) {
			LibraryBook obj=new LibraryBook();
			obj.printBook();
		}
}
