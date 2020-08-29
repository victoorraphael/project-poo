package projeto;

public class Update{

  static Scanner scan = new Scanner(System.in);

  public static void student(String name, ArrayList<Student> students){
    students.forEach( stud => {
      if(stud.getName().equal(name)){
        stud.setName(name);
      }
    })
  }

  public static void professor(String name, String ArrayList<Professor> professors){
    professors.forEach( prof => {
      if(prof.getName().equal(name)){
        prof.setName(name);
      }
    })
  }

  public static void classroom(int idClass, String newProf, String newMartial, ArrayList<Classroom> classrooms){
    classrooms.forEach( clas -> {
      if(clas.getId == idClass){
        
      }
    })
  }

  public static void martialArt(){

  }

  public static void plan(){

  }
}