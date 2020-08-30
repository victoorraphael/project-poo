package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Get{
	
	static Scanner scan = new Scanner(System.in);
	static String name;

  public static Student student(ArrayList<Student> students){
	  System.out.println("Digite o nome do estudante: ");
	  name = scan.nextLine();
	  
	  for(Student s : students) {
		  if(s.getName().equals(name)) {
			  return s;
		  }
	  }
	  return null;
  }
  
  public static ArrayList<Student> allStudent(){
		return Repository.students;
  }

  public static Professor professor(ArrayList<Professor> professors) {
	  System.out.println("Digite o nome do professor: ");
	  name = scan.nextLine();
		  for(Professor p : professors) {
				if(p.getName().equals(name)) {
					return p;
				}
		}
		return null;
	}

  public static ArrayList<Professor> allProfessor() {
		return Repository.professors;
	}

  public static Classroom classroom(ArrayList<Classroom> classrooms) {
	  System.out.println("Digite o id da classe: ");
	  int id = scan.nextInt();
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

  public static MartialArt MartialArt(ArrayList<MartialArt> martialArt) {
	  System.out.println("Digite o nome da Arte Marcial: ");
	  String modality = scan.nextLine();
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
