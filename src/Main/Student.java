package Main;

public class Student extends Person{
	
	private int idStudent;
	private String grade;
	
	public Student(String name, String birth, String graduation, String cpf, String street, String neighbour, String city,
			String zip, String number, String complement, String email, String phone, Boolean isWhatsapp, String gender,
			String category, String weight, String height, int code, String grade, int idStudent) {
		super(name, birth, graduation, cpf, street, neighbour, city, zip, number, complement, email, phone, isWhatsapp, gender,
				category, weight, height, code);
		
		this.grade = grade;
		this.idStudent = idStudent;
	}
	
	
	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}


	public int getIdStudent() {
		return idStudent;
	}


	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public void matricular() {
		
	}

}
