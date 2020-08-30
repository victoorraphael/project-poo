package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Get{
	
	static Scanner scan = new Scanner(System.in);
	static String name;

  public static Student student(ArrayList<Student> students, String name){  
	  for(Student s : students) {
		  if(s.getName().contains(name)) {
			  System.out.println("===== DADOS DO ALUNO =====");
			  System.out.println("Nome: " + s.getName());
			  System.out.println("Data de nascimento: " + s.getBirth());
			  System.out.println("Email: " + s.getEmail());
			  System.out.println("Altura: " + s.getHeight());
			  System.out.println("Peso: " + s.getWeight());
			  System.out.println("Categoria: " + s.getCategory());
			  System.out.println("Graduacao: " + s.getGrade());		 
			  
			  return s;
		  }
	  }
	  return null;
  }
  
  public static ArrayList<Student> allStudent(){
		return Repository.students;
  }

  public static Professor professor(ArrayList<Professor> professors, String name) {
	  for(Professor p : professors) {
		if(p.getName().equals(name)) {
			System.out.println("===== DADOS DO ALUNO =====");
			System.out.println("Nome: " + p.getName());
			System.out.println("Data de nascimento: " + p.getBirth());
			System.out.println("Email: " + p.getEmail());
			System.out.println("Altura: " + p.getHeight());
			System.out.println("Peso: " + p.getWeight());
			System.out.println("Categoria: " + p.getCategory());
			return p;
		}
	  }
	  return null;
  }

  public static ArrayList<Professor> allProfessor() {
		return Repository.professors;
	}

  public static Classroom classroom(ArrayList<Classroom> classrooms, int id) {
	  for(Classroom c : classrooms) {
		  if(c.getId() == id) {
			  return c;
		  }
	  }
	  return null;
  }
  
  public static ArrayList<Classroom> allClassroom(){
    return Repository.classrooms;
  }

  public static MartialArt martialArt(ArrayList<MartialArt> martialArt, String modality) {
	  for(MartialArt m : martialArt) {
			if(m.getModality().equals(modality)) {
				return m;
			}
	}
	return null;
  }

  public static ArrayList<MartialArt> allMartialArt(){
    return Repository.martialArts;
  }

  public static Plans plan(ArrayList<Plans> plans){
	  System.out.println("Digite o nome do plano: ");
	  name = scan.nextLine();
	  for(Plans p : plans) {
		  if(p.getName().equals(name)) {
			  return p;
		  }
	  }
	return null;
  }
  
  public static ArrayList<Plans> getAllPlans(){
	  return Repository.plans;
  }
  
}
