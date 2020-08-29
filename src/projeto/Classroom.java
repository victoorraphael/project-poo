package projeto;

import java.util.ArrayList;

public class Classroom {
	
	
	public Classroom(int id, Professor professor, ArrayList<Student> student, MartialArt modality, String schedule) {
		super();
		this.id = id;
		this.professor = professor;
		this.student = student;
		this.modality = modality;
		this.schedule = schedule;
	}
	
	
	private int id;
	private Professor professor;
	private ArrayList<Student> student;
	private MartialArt modality;
	private String schedule;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public ArrayList<Student> getStudent() {
		return student;
	}
	public void setStudent(ArrayList<Student> student) {
		this.student = student;
	}
	public MartialArt getModality() {
		return modality;
	}
	public void setModality(MartialArt modality) {
		this.modality = modality;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	
	
}
