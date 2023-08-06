import java.util.Comparator;
	


public class CompareById implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getId().compareTo(s2.getId());
		
//		return s1.getId().compareTo(s2.getId());
//				return s1.getName().compareTo(s2.getName());
		
	}

}








