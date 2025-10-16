package validate;

import entity.Batch;
import entity.Course;
import entity.Faculty;
import entity.Student;
import service.ClassServiceImpl;

public class Validator {
	ClassServiceImpl obj = new ClassServiceImpl();

	private boolean isCourseIdExists(int id) {
		for (Course c : obj.cList) {
			if (c != null && c.getcId() == id) {
				return true;
			}
		}
		return false;
	}

	private boolean isFacultyIdExists(int id) {
		for (Faculty f : obj.fList) {
			if (f != null && f.getfId() == id) {
				return true;
			}
		}
		return false;
	}

	private boolean isBatchIdExists(int id) {
		for (Batch b : obj.bList) {
			if (b != null && b.getbId() == id) {
				return true;
			}
		}
		return false;
	}

	private boolean isStudentIdExists(int id) {
		for (Student s : obj.sList) {
			if (s != null && s.getsId() == id) {
				return true;
			}
		}
		return false;
	}
}
