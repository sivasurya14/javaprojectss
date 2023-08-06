import java.util.Comparator;

public class CompareByDepart implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.getDepartment().compareTo(s2.getDepartment());
	}

}

