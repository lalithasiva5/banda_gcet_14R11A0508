import java.util.Date;
int s[]=new int[5];
String students={"s1,s2,s3,s4,s5"};
int arraylength=students.length;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		setStudent("add s1");
		setStudent("add s2");
		setStudent("add s3");
		setStudent("add s4");
		setStudent("add s5");
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		Array.setInt(s1[] s);
		Array.setInt(s2[] s);
		Array.setInt(s3[] s);
		Array.setInt(s4[] s);
		Array.setInt(s5[] s);
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		getStudent(int s1);
		getStudent(int s2);
		getStudent(int s3);
		getStudent(int s4);
		getStudent(int s5);

		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		setStudent(student s1,int s1);
		setStudent(student s2,int s2);
		setStudent(student s3,int s3);
		setStudent(student s4,int s4);
		setStudent(student s5,int s5);
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		addFirst(Student s1);
		addFirst(Student s2);
		addFirst(Student s3);
		addFirst(Student s4);
		addFirst(Student s5);
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		addLast(Student s1);
		addLast(Student s2);
		addLast(Student s3);
		addLast(Student s4);
		addLast(Student s5);
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
