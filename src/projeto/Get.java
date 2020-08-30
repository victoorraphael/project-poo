package projeto;

public class Get{

  public static Student student(ArrayList<Student> students, String name){
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

  public static Professor professor(ArrayList<Professor> professors, String name) {
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

  public static ArrayList<Classroom> allClassroom(){
    return Repository.classrooms;
  }

  public static MartialArt MartialArt(ArrayList<MartialArt> martialArt, String modality) {
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

  public static void plan(){
    
  }
}