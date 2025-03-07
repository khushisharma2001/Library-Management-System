package library_project;


public class User {
    private String name;
    private int userId;
    private String status;
    private Gender gender;
    private int noOfBooksInPossesion;

    public User(int id, String name, String status, Gender gender, int noOfBooksInPossesion) {
        this.name = name;
        this.userId = id;
        this.status = status;
        this.gender = gender;
        this.noOfBooksInPossesion = noOfBooksInPossesion;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getNoOfBooksInPossesion() {
		return noOfBooksInPossesion;
	}

	public void setNoOfBooksInPossesion(int noOfBooksInPossesion) {
		this.noOfBooksInPossesion = noOfBooksInPossesion;
	}
    
    

}
