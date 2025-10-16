package service;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import config.HibernateConfig;
import entity.User;
import validate.Validator;

public class UserServiceImpl implements UserService {
	SessionFactory sf = HibernateConfig.getSessionFactory();

	@Override
	public void addUser() {
		Session session = sf.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of User You Need to update : ");
		int userCount = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= userCount; i++) {
			User user = new User();
			int userIdGenerater = (int) (Math.random() * Math.pow(10, 3));
			user.setuId(userIdGenerater);
			System.out.println("User ID is " + userIdGenerater);
			System.out.println("Enter User Name :");
			user.setuName(sc.nextLine());
			System.out.println("Enter Address of User : ");
			user.setuAddress(sc.nextLine());
			System.out.println("Enter Email Address :");
			user.setEmail(Validator.validateEmail());
			System.out.println("Enter Password :");
			System.out.println(
					"Password must contain upper case, lower case, 1 special symbol and digits and greater then 6 char..");
			user.setPassword(Validator.validatePassword());
			System.out.println("Enter Age");
			user.setAge(sc.nextInt());
			System.out.println("Enter Salary");
			user.setSalary(sc.nextDouble());
			sc.nextLine();
			session.save(user);
			session.beginTransaction().commit();
			System.out.println("User Successfully Saved");
		}

	}

	@Override
	public void displayUserDetails() {
		Session session = sf.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Id you need to Display :");
		int id = sc.nextInt();
		sc.nextLine();
		User user = session.get(User.class, id);
		if (user != null && user.getuId() == id) {
			while (true) {
				System.out.println("Enter Email Address:");
				String email = sc.nextLine();
				System.out.println("Enter Password:");
				String pass = sc.nextLine();

				if (user.getEmail().equals(email) && user.getPassword().equals(pass)) {
					System.out.println(user);
					break;
				} else {
					System.out.println("Invalid login credentials! Please try again.\n");
				}
			}
		} else {
			System.out.println("Invalid User...!!!");
			displayUserDetails();
		}
	}

	@Override
	public void updateUser() {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.println("|----------Update Menu----------|");
			System.out.println("1. Update User Name ");
			System.out.println("2. Update User Address ");
			System.out.println("3. Update User Email ");
			System.out.println("4. Update User Password ");
			System.out.println("5. Update User Age ");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				updateName();
				break;
			case 2:
				updateAddress();
				break;
			case 3:
				updateEmail();
				break;
			case 4:
				updatePassword();
				break;
			case 5:
				updateAge();
				break;
			case 6:
				flag = false;
				break;
			default:
				System.out.println("Invalid Choice Please Enter valid choice....!!!");
				break;
			}
		}

	}

	@Override
	public void delete() {
		Session session = sf.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Id you need to Display :");
		int id = sc.nextInt();
		sc.nextLine();
		User user = session.get(User.class, id);
		if (user != null && user.getuId() == id) {
			while (true) {
				System.out.println("Enter Email Address :");
				String email = sc.nextLine();
				System.out.println("Enter Password :");
				String pass = sc.nextLine();
				if (user.getEmail().equals(email) && user.getPassword().equals(pass)) {
					session.delete(user);
					session.beginTransaction().commit();
					System.out.println("User Of ID " + id + " Deleted Successfully");
					break;
				} else {
					System.out.println("Invalid login credentials! Please try again.\n");
				}
			}
		} else {
			System.out.println("Invalid User...!!!");
			delete();
		}

	}

	public void updateName() {
		Session session = sf.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Id you need to Update Details :");
		int id = sc.nextInt();
		sc.nextLine();
		User user = session.get(User.class, id);
		if (user != null && user.getuId() == id) {
			while (true) {
				System.out.println("Enter Email Address :");
				String email = sc.nextLine();
				System.out.println("Enter Password :");
				String pass = sc.nextLine();
				if (user.getEmail().equals(email) && user.getPassword().equals(pass)) {
					System.out.println("Enter Name you need to update :");
					user.setuName(sc.nextLine());
					session.update(user);
					session.beginTransaction().commit();
					System.out.println("User Name Update to " + user.getuName());
					break;
				} else {
					System.out.println("Invalid login credentials! Please try again.\n");
				}
			}
		} else {
			System.out.println("Invalid User...!!!");
			updateName();
		}
	}

	public void updateAddress() {
		Session session = sf.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Id you need to Update Details :");
		int id = sc.nextInt();
		sc.nextLine();
		User user = session.get(User.class, id);

		if (user != null && user.getuId() == id) {
			while (true) {
				System.out.println("Enter Email Address :");
				String email = sc.nextLine();
				System.out.println("Enter Password :");
				String pass = sc.nextLine();
				if (user.getEmail().equals(email) && user.getPassword().equals(pass)) {
					System.out.println("Enter Address you need to update :");
					user.setuAddress(sc.nextLine());
					session.update(user);
					session.beginTransaction().commit();
					System.out.println("User Address Update to " + user.getuAddress());
					break;
				} else {
					System.out.println("Invalid login credentials! Please try again.\n");
				}
			}
		} else {
			System.out.println("Invalid User...!!!");
			updateAddress();
		}
	}

	public void updateEmail() {
		Session session = sf.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Id you need to Update Details :");
		int id = sc.nextInt();
		sc.nextLine();
		User user = session.get(User.class, id);
		if (user != null && user.getuId() == id) {
			while (true) {
				System.out.println("Enter Email Address :");
				String email = sc.nextLine();
				System.out.println("Enter Password :");
				String pass = sc.nextLine();
				if (user.getEmail().equals(email) && user.getPassword().equals(pass)) {
					System.out.println("Enter Email you need to update :");
					user.setEmail(Validator.validateEmail());
					session.update(user);
					session.beginTransaction().commit();
					System.out.println("User Email Update to " + user.getEmail());
					break;
				} else {
					System.out.println("Invalid login credentials! Please try again.\n");
				}
			}
		} else

		{
			System.out.println("Invalid User...!!!");
			updateEmail();
		}
	}

	public void updatePassword() {
		Session session = sf.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Id you need to Update Details :");
		int id = sc.nextInt();
		sc.nextLine();
		User user = session.get(User.class, id);
		if (user != null && user.getuId() == id) {
			while (true) {
				System.out.println("Enter Email Address :");
				String email = sc.nextLine();
				System.out.println("Enter Password :");
				String pass = sc.nextLine();
				if (user.getEmail().equals(email) && user.getPassword().equals(pass)) {
					System.out.println("Enter Password you need to update :");
					user.setPassword(Validator.validatePassword());
					session.update(user);
					session.beginTransaction().commit();
					System.out.println("User Password Update to " + user.getPassword());
				} else {
					System.out.println("Invalid login credentials! Please try again.\n");
				}
			}
		} else {
			System.out.println("Invalid User...!!!");
		}
	}

	public void updateAge() {
		Session session = sf.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Id you need to Update Details :");
		int id = sc.nextInt();
		sc.nextLine();
		User user = session.get(User.class, id);
		if (user != null && user.getuId() == id) {
			while (true) {
				System.out.println("Enter Email Address :");
				String email = sc.nextLine();
				System.out.println("Enter Password :");
				String pass = sc.nextLine();
				if (user.getEmail().equals(email) && user.getPassword().equals(pass)) {
					System.out.println("Enter Age you need to update :");
					user.setAge(sc.nextInt());
					session.update(user);
					session.beginTransaction().commit();
					System.out.println("User Age Update to " + user.getAge());
				} else {
					System.out.println("Invalid login credentials! Please try again.\n");
				}
			}
		} else {
			System.out.println("Invalid User...!!!");
		}
	}

	@Override
	public void sortUser() {
		Session session = sf.openSession();
		List<User> users = session.createQuery("FROM User ORDER BY salary ASC", User.class).list();
		if (users.isEmpty()) {
			System.out.println("No users found in the system.");
		} else {
			System.out.println("\n|---------- All Users Sorted by Salary (Low to High) ----------|");
			for (User user : users) {
				System.out.println(user);
				System.out.println("--------------------------------------------------------------");
			}
		}

	}

}
