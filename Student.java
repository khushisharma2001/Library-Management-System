package library_project;

public class Student extends User implements Member{

	public Student(int userId, String name,  String status, int noOfBooksInPossesion, Gender gender) {
		super(userId, name, status, gender, noOfBooksInPossesion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String searchBook(String bookToSearch) {
		// TODO Auto-generated method stub
		return null;
	}




}
