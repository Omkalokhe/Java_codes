package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Batch;
import entity.Course;
import entity.Faculty;
import entity.Student;

public class ClassServiceImpl implements ClassService {
	public List<Course> cList = new ArrayList<Course>();
	public List<Faculty> fList = new ArrayList<Faculty>();
	public List<Batch> bList = new ArrayList<Batch>();
	public List<Student> sList = new ArrayList<Student>();

	@Override
	public void addCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of course do you want to Add :");
		int count = sc.nextInt();
		for (int i = 1; i <= count; i++) {
			Course c = new Course();
			System.out.println("Enter Course ID :");
			c.setcId(sc.nextInt());
			System.out.println("Enter Course Name :");
			c.setcName(sc.next());
			cList.add(c);
		}
		System.out.println("Courses Added Successfully");
	}

	@Override
	public void displayCourseDetail() {
		System.out.println("----------Course Details----------\n");
		for (Course course : cList) {
			System.out.println(course);
		}
		System.out.println("");

	}

	@Override
	public void addFaculty() {
		Scanner sc = new Scanner(System.in);
		displayCourseDetail();
		System.out.println("Enter the number of Faculty do you want to Add :");
		int count = sc.nextInt();

		for (int i = 1; i <= count; i++) {
			Faculty f = new Faculty();
			boolean flag = true;
			System.out.println("Enter Faculty ID :");
			f.setfId(sc.nextInt());
			System.out.println("Enter Faculty Name :");
			f.setfName(sc.next());
			while (flag) {
//				boolean choice = true;
				System.out.println("Enter Course ID you need to assign to Faculty :");
				int cId = sc.nextInt();
				for (Course course : cList) {
					if (course != null && cId == course.getcId()) {
						f.setCourse(course);
						flag = false;
//						choice = false;
						break;
					}

				}
				if (flag) {

					displayCourseDetail();
					System.out.println(" ");
					System.out.println("Please Enter Valid course Id...!");
				}
			}
			fList.add(f);
		}
		System.out.println("Facultys Added Successfully");
	}

	@Override
	public void displayFacultyDetail() {
		System.out.println("----------Faculty Details----------\n");
		for (Faculty faculty : fList) {
			System.out.println(faculty);
		}
		System.out.println("");

	}

	@Override
	public void addBatch() {
		Scanner sc = new Scanner(System.in);
		displayFacultyDetail();
		System.out.println("Enter the number of Batch do you want to Add :");
		int count = sc.nextInt();

		for (int i = 1; i <= count; i++) {
			Batch b = new Batch();
			boolean flag = true;
			System.out.println("Enter Batch ID :");
			b.setbId(sc.nextInt());
			System.out.println("Enter Batch Name :");
			b.setbName(sc.next());
			while (flag) {
//				boolean choice = true;
				System.out.println("Enter Faculty ID you need to assign to Batch :");
				int fId = sc.nextInt();
				for (Faculty faculty : fList) {
					if (faculty != null && fId == faculty.getfId()) {
						b.setFaculty(faculty);
						flag = false;
//						choice = false;
						break;
					}

				}
				if (flag) {
					displayFacultyDetail();
					System.out.println("Please Enter Valid Faculty Id...!");

				}
			}
			bList.add(b);
		}
		System.out.println("Batchs Added Successfully");
	}

	@Override
	public void displayBatchDetail() {
		System.out.println("----------Batch Details----------\n");
		for (Batch batch : bList) {
			System.out.println(batch);
		}
		System.out.println("");

	}

	@Override
	public void addStudent() {
		Scanner sc = new Scanner(System.in);
		displayBatchDetail();
		System.out.println("Enter the number of Student do you want to Add :");
		int count = sc.nextInt();

		for (int i = 1; i <= count; i++) {
			Student s = new Student();
			boolean flag = true;
			System.out.println("Enter Student ID :");
			s.setsId(sc.nextInt());
			System.out.println("Enter Student Name :");
			s.setsName(sc.next());
			while (flag) {
//				boolean choice = true;
				System.out.println("Enter Batch ID you need to assign to Student :");
				int bId = sc.nextInt();
				for (Batch batch : bList) {
					if (batch != null && bId == batch.getbId()) {
						s.setBatch(batch);
						flag = false;
//						choice = false;
						break;
					}

				}
				if (flag) {
					displayBatchDetail();
					System.out.println("Please Enter Valid Batch Id...!");
				}
			}
			sList.add(s);
		}
		System.out.println("Students Added Successfully");

	}

	@Override
	public void displayStudentDetail() {
		System.out.println("----------Student Details----------\n");
		for (Student student : sList) {
			System.out.println(student);
		}
		System.out.println("");

	}

	@Override
	public void updateDetails() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			boolean innerFlag = true;
			System.out.println("--------------------------MENU-------------------------");
			System.out.println("1. Update Course Details");
			System.out.println("2. Update Faculty Details");
			System.out.println("3. Update Batch Details");
			System.out.println("4. Update Student Details");
			System.out.println("5. Exit");
			System.out.println("---------------------------------------------------");
			System.out.println("Enter Your Choice :");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				while (innerFlag) {
					System.out.println("--------------Fields--------------");
					System.out.println("1. Update Course Name");
					System.out.println("2.Exit");
					System.out.println("Enter Your Choice :");
					int cChoice = sc.nextInt();
					switch (cChoice) {
					case 1:
						updateCourseName();
						break;
					case 2:
						innerFlag = false;
						break;
					default:
						System.out.println("Invalid Choice Please enter Valid Choice..!!");
						break;
					}
				}
				break;
			case 2:
				while (innerFlag) {
					System.out.println("--------------Fields--------------");
					System.out.println("1. Update Faculty Name");
					System.out.println("2.Update Course of Faculty");
					System.out.println("3.Exit");
					System.out.println("Enter Your Choice :");
					int cChoice = sc.nextInt();
					switch (cChoice) {
					case 1:
						System.out.println("Name Updated Successfully");
						break;
					case 2:
						updateFacultyCourse();
						break;
					case 3:
						innerFlag = false;
						break;
					default:
						System.out.println("Invalid Choice Please enter Valid Choice..!!");
						break;
					}
				}
				break;
			case 3:
				while (innerFlag) {
					System.out.println("--------------Fields--------------");
					System.out.println("1. Update Batch Name");
					System.out.println("2.Exit");
					System.out.println("Enter Your Choice :");
					int cChoice = sc.nextInt();
					switch (cChoice) {
					case 1:
						System.out.println("Name Updated Successfully");
						break;
					case 2:
						innerFlag = false;
						break;
					default:
						System.out.println("Invalid Choice Please enter Valid Choice..!!");
						break;
					}
				}
				break;
			case 4:
				while (innerFlag) {
					System.out.println("--------------Fields--------------");
					System.out.println("1. Update Student Name");
					System.out.println("2.Exit");
					System.out.println("Enter Your Choice :");
					int cChoice = sc.nextInt();
					switch (cChoice) {
					case 1:
						System.out.println("Name Updated Successfully");
						break;
					case 2:
						innerFlag = false;
						break;
					default:
						System.out.println("Invalid Choice Please enter Valid Choice..!!");
						break;
					}
				}
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("Invalid Choice Please enter Valid Choice..!!");
				break;
			}

		}
	}

	public void updateCourseName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course Id you need to update Details");
		int id = sc.nextInt();
		boolean flag = true;
		for (Course course : cList) {
			if (course != null && course.getcId() == id) {
				System.out.println("Enter Name You Need to Update");
				course.setcName(sc.next());
				System.out.println("Name Updated Successfully to " + course.getcName() + ".");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Course Id is Not Present");
			updateCourseName();
		}
	}

	public void updateFacultyName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Faculty Id you need to update Details");
		int id = sc.nextInt();
		boolean flag = true;
		for (Faculty faculty : fList) {
			if (faculty != null && faculty.getfId() == id) {
				System.out.println("Enter Name You Need to Update");
				faculty.setfName(sc.next());
				System.out.println("Name Updated Successfully to " + faculty.getfName() + ".");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Faculty Id is Not Present Please Try Again");
			updateCourseName();
		}
	}

	public void updateBatchName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Batch Id you need to update Details");
		int id = sc.nextInt();
		boolean flag = true;
		for (Batch batch : bList) {
			if (batch != null && batch.getbId() == id) {
				System.out.println("Enter Name You Need to Update");
				batch.setbName(sc.next());
				System.out.println("Name Updated Successfully to " + batch.getbName() + ".");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Batch Id is Not Present Please Try Again");
			updateCourseName();
		}
	}

	public void updateStudentName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Batch Id you need to update Details");
		int id = sc.nextInt();
		boolean flag = true;
		for (Student student : sList) {
			if (student != null && student.getsId() == id) {
				System.out.println("Enter Name You Need to Update");
				student.setsName(sc.next());
				System.out.println("Name Updated Successfully to " + student.getsName() + ".");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Batch Id is Not Present Please Try Again");
			updateCourseName();
		}
	}

	public void updateFacultyCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Faculty Id you need to update Details");
		int id = sc.nextInt();
		boolean flag = true;
		for (Faculty faculty : fList) {
			if (faculty != null && faculty.getfId() == id) {
				while (flag) {
					System.out.println("Enter Course Id You Need to Update for Faculty");
					int cid = sc.nextInt();
					for (Course course : cList) {
						if (course != null && cid == course.getcId()) {
							faculty.setCourse(course);
							System.out.println("Faculty Course Updated Successfully to" + course);
							flag = false;
							break;
						}
					}
					if (flag) {
						displayCourseDetail();
						System.out.println(" ");
						System.out.println("Please Enter Valid course Id...!");
					}
				}
			}
		}
		if (flag) {
			System.out.println("Faculty Id is Not Present Please Try Again");
			updateFacultyCourse();
		}
	}

	@Override
	public void deleteDetails() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("--------------------------MENU-------------------------");
			System.out.println("1. Delete Course");
			System.out.println("2. Delete Faculty");
			System.out.println("3. Delete Batch");
			System.out.println("4. Delete Student");
			System.out.println("5. Exit");
			System.out.println("---------------------------------------------------");
			System.out.println("Enter Your Choice :");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				deleteCourse();
				break;
			case 2:
				deleteFaculty();
				break;
			case 3:
				deleteBatch();
				break;
			case 4:
				deleteStudent();
				break;
			case 5:
				flag = false;
				break;

			default:
				System.out.println("Invalid Choice Please enter Valid Choice..!!");
				break;
			}
		}
	}

	public void deleteCourse() {
		Scanner sc = new Scanner(System.in);
		Course course = null;
		while (course == null) {
			System.out.println("Enter Course Id you need to Delete");
			int id = sc.nextInt();
			for (Course c : cList) {
				if (c != null && c.getcId() == id) {
					boolean isAssigned = false;
					for (Faculty f : fList) {
						if (f.getCourse() != null && f.getCourse().getcId() == id) {
							isAssigned = true;
							break;
						}
					}
					if (isAssigned) {
						System.out.println("Course is assigned to a Faculty. Cannot delete!");
						return; // direct exit the method
					}
					course = c;
					break;
				}
			}
			if (course == null) {
				System.out.println("Course Id is Not Present. Please Try Again");
			}
		}
		cList.remove(course);
		System.out.println("Course Removed Successfully.");
	}

	public void deleteFaculty() {
		Scanner sc = new Scanner(System.in);
		Faculty faculty = null;
		while (faculty == null) {
			System.out.println("Enter Faculty Id you need to Delete");
			int id = sc.nextInt();
			for (Faculty f : fList) {
				if (f != null && f.getfId() == id) {
					boolean isAssigned = false;
					for (Batch b : bList) {
						if (b.getFaculty() != null && b.getFaculty().getfId() == id) {
							isAssigned = true;
							break;
						}
					}
					if (isAssigned) {
						System.out.println("Faculty is assigned to a Batch. Cannot delete!");
						return;
					}
					faculty = f;
					break;
				}
			}
			if (faculty == null) {
				System.out.println("Faculty Id is Not Present. Please Try Again");
			}
		}
		fList.remove(faculty);
		System.out.println("Faculty Removed Successfully.");
	}

	public void deleteBatch() {
		Scanner sc = new Scanner(System.in);
		Batch batch = null;
		while (batch == null) {
			System.out.println("Enter Batch Id you need to Delete");
			int id = sc.nextInt();
			for (Batch b : bList) {
				if (b != null && b.getbId() == id) {
					boolean isAssigned = false;
					for (Student s : sList) {
						if (s.getBatch() != null && s.getBatch().getbId() == id) {
							isAssigned = true;
							break;
						}
					}
					if (isAssigned) {
						System.out.println("Batch is assigned to a Students. Cannot delete!");
						return;
					}
					batch = b;
					break;
				}
			}
			if (batch == null) {
				System.out.println("Batch Id is Not Present. Please Try Again");
			}
		}
		bList.remove(batch);
		System.out.println("Batch Removed Successfully.");
	}

	public void deleteStudent() {
		Scanner sc = new Scanner(System.in);
		Student student = null;
		while (student == null) {
			System.out.println("Enter Student Id you need to Delete");
			int id = sc.nextInt();
			for (Student stud : sList) {
				if (stud != null && stud.getsId() == id) {
					student = stud;
					break;
				}
			}
			if (student == null) {
				System.out.println("Student Id is Not Present Please Try Again");

			}
			sList.remove(student);
			System.out.println("Student Detail Remove Successfully");

		}
	}

}
