package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Create{

  static Scanner scan = new Scanner(System.in);
	

  
  static int professorId = 0;
  public static int idStudent = 0;
  public static int id_classroom;

  public static void formPerson() {
		scan.nextLine();
		System.out.println("Insira o Nome Completo:");
		String name = scan.nextLine();
		System.out.println("Insira sua Data de Nascimento:");
		String birth = scan.nextLine();
		System.out.println("Insira seu Telefone:");
		String phone = scan.nextLine();
		System.out.println("eh Whatsapp [Y/N]:");
		boolean isWhatsapp = scan.nextBoolean();
		System.out.println("Insira o seu Email:");
		String email = scan.nextLine();
		System.out.println("Insira seu CPF:");
		String cpf = scan.nextLine();
		System.out.println("Insira seu Sexo:");
		String gender = scan.nextLine();
		System.out.println("Insira seu Peso:");
		String weight = scan.nextLine();
		System.out.println("Insira sua Altura:");
		String height = scan.nextLine();
		System.out.println("Insira sua Categoria:");
		String category = scan.nextLine();
		System.out.println("Insira sua Graduacao:");
		String graduation = scan.nextLine();
		System.out.println("Insira seu CEP:");
		String zip = scan.nextLine();
		System.out.println("Insira o Logradouro:");
		String street = scan.nextLine();
		System.out.println("Insira o Numero:");
		String number = scan.nextLine();
		System.out.println("Insira seu Bairro:");
		String neighbour = scan.nextLine();
		System.out.println("Insira o Complemento:");
		String complement = scan.nextLine();
		System.out.println("Insira sua Cidade:");
		String city = scan.nextLine();
		System.out.println("Codigo de verificacao:");
		int code = scan.nextInt();
	}

  public static Professor professor() {
    Professor professor;
    System.out.println("Insira o Nome Completo:");
		String name = scan.nextLine();
		System.out.println("Insira sua Data de Nascimento:");
		String birth = scan.nextLine();
		System.out.println("Insira seu Telefone:");
		String phone = scan.nextLine();
		System.out.println("eh Whatsapp [Y/N]:");
		boolean isWhatsapp = scan.nextBoolean();
		System.out.println("Insira o seu Email:");
		String email = scan.nextLine();
		System.out.println("Insira seu CPF:");
		String cpf = scan.nextLine();
		System.out.println("Insira seu Sexo:");
		String gender = scan.nextLine();
		System.out.println("Insira seu Peso:");
		String weight = scan.nextLine();
		System.out.println("Insira sua Altura:");
		String height = scan.nextLine();
		System.out.println("Insira sua Categoria:");
		String category = scan.nextLine();
		System.out.println("Insira sua Graduacao:");
		String graduation = scan.nextLine();
		System.out.println("Insira seu CEP:");
		String zip = scan.nextLine();
		System.out.println("Insira o Logradouro:");
		String street = scan.nextLine();
		System.out.println("Insira o Numero:");
		String number = scan.nextLine();
		System.out.println("Insira seu Bairro:");
		String neighbour = scan.nextLine();
		System.out.println("Insira o Complemento:");
		String complement = scan.nextLine();
		System.out.println("Insira sua Cidade:");
		String city = scan.nextLine();
		System.out.println("Codigo de verificacao:");
		int code = scan.nextInt();
		scan.nextLine();
		System.out.println("Insira o salário do Professor: ");
		double salary = scan.nextDouble();
		System.out.println("Insira a filiação do Professor: ");
		String filiation = scan.nextLine();
		System.out.println("Insira a federação do Professor: ");
		String federation = scan.nextLine();
		professorId += 1;
		professor = new Professor(
								name,
								birth,
								graduation,
								cpf,
								street,
								neighbour,
								city,
								zip,
								number,
								complement,
								email,
								phone,
								isWhatsapp,
								gender,
								category,
								weight,
								height,
								code,
								salary,
								filiation,
								federation,
								professorId
								);
    if(professor != null){
      saveProfessor(professor, Repository.professors);
    }
    return professor;
	}

  public static void saveProfessor(Professor professor, ArrayList<Professor> professors){
    professors.add(professor);
  }

  public static Student student() {
    Student student;
    idStudent++;
    System.out.println("Insira o Nome Completo:");
		String name = scan.nextLine();
		System.out.println("Insira sua Data de Nascimento:");
		String birth = scan.nextLine();
		System.out.println("Insira seu Telefone:");
		String phone = scan.nextLine();
		System.out.println("eh Whatsapp [Y/N]:");
		boolean isWhatsapp = scan.nextBoolean();
		System.out.println("Insira o seu Email:");
		String email = scan.nextLine();
		System.out.println("Insira seu CPF:");
		String cpf = scan.nextLine();
		System.out.println("Insira seu Sexo:");
		String gender = scan.nextLine();
		System.out.println("Insira seu Peso:");
		String weight = scan.nextLine();
		System.out.println("Insira sua Altura:");
		String height = scan.nextLine();
		System.out.println("Insira sua Categoria:");
		String category = scan.nextLine();
		System.out.println("Insira sua Graduacao:");
		String graduation = scan.nextLine();
		System.out.println("Insira seu CEP:");
		String zip = scan.nextLine();
		System.out.println("Insira o Logradouro:");
		String street = scan.nextLine();
		System.out.println("Insira o Numero:");
		String number = scan.nextLine();
		System.out.println("Insira seu Bairro:");
		String neighbour = scan.nextLine();
		System.out.println("Insira o Complemento:");
		String complement = scan.nextLine();
		System.out.println("Insira sua Cidade:");
		String city = scan.nextLine();
		System.out.println("Codigo de verificacao:");
		int code = scan.nextInt();
		scan.nextLine();
		System.out.println("Insira o Grau do Aluno: ");
		String grade = scan.nextLine();
		student = new Student(
								name,
								birth,
								graduation,
								cpf,
								street,
								neighbour,
								city,
								zip,
								number,
								complement,
								email,
								phone,
								isWhatsapp,
								gender,
								category,
								weight,
								height,
								code,
								grade,
								idStudent
								);
   if(student != null){
      saveStudent(student, Repository.students);
    }
    return student;
	}

  public static void saveStudent(Student student, ArrayList<Student> students){
    students.add(student);
  }

  public static MartialArt martialArt() {
		  MartialArt martialArt;
      System.out.println("Insira o modalidade que deseja: ");
			String modality = scan.nextLine();
			martialArt = new MartialArt(modality); 
  if(martialArt != null){
      saveMartialArt(martialArt, Repository.martialArts);
    }
    return martialArt;
	}

  public static void saveMartialArt(MartialArt martialArt, ArrayList<MartialArt> martialArts){
    martialArts.add(martialArt);
  }


  public static Classroom classroom(ArrayList<Professor> professors, ArrayList<MartialArt> martialArts){
		
		Professor professor;
		MartialArt martialArt;
		String schedule;
		Classroom classroom;
		String op;
		System.out.println("Digite o nome do professor");
		String name_professor = scan.nextLine();
		boolean flag;
		professor = Get.professor(professors, name_professor);
		if(professor == null) {
			flag = false;
		}else {
			flag = true;
		}
		 
	    while(!(flag)){
	      System.out.println("Esse professor não existe, deseja tentar novamente. [Y/N]");
	      op = scan.nextLine();
	      if((op.equals("y")) || (op.equals("Y"))) {
	    	  System.out.println("Digite o nome do professor novamente: ");
	    	  name_professor = scan.nextLine();
	    	  professor = Get.professor(professors, name_professor);
	    	  if(professor == null) {
	  			flag = false;
	  		}else {
	  			flag = true;
	  			
	  		}
	      }else {
	    	  flag = true;
	    	  return null;
	      }	      
	    }
	    System.out.println("Digite o nome da modalidade de Arte Marcial:");
	    String modality_martialArt = scan.nextLine();
	    martialArt = Get.martialArt(martialArts, modality_martialArt);
	    if(martialArt == null) {
			flag = false;
		}else {
			flag = true;
		}
	    while(!(flag)){
		      System.out.println("Esse modalidade não existe, deseja tentar novamente. [Y/N]");
		      op = scan.nextLine();
		      if((op.equals("y")) || (op.equals("Y"))) {
		    	  System.out.println("Digite o nome da modalidade novamente: ");
		    	  modality_martialArt = scan.nextLine();
		    	  if(Get.martialArt(martialArts, modality_martialArt) == null) {
		  			flag = false;
		  		}else {
		  			flag = true;
		  		}
		      }else {
		    	  flag = true;
		    	  return null;
		      }	      
		}
	    System.out.println("Qual o horário dessa turma? \n1 - 15h\n2 - 19h\n3 - 22h");
	    int h = scan.nextInt();
	    if(h==1) {
	    	schedule = "15h";
	    } else if(h==2) {
	    	schedule = "19h";
	    } else {
	    	schedule = "22h";
	    }
	    
		id_classroom++;
	    classroom = new Classroom(id_classroom,professor,null,martialArt,schedule);
	    
	    if(classroom != null){
        saveClassrrom(classroom, Repository.classrooms);
      }
      return classroom;
	}
	
	public static void saveClassrrom(Classroom classroom, ArrayList<Classroom> classrooms) {
		classrooms.add(classroom);
	}

	  
  //Revisar plano 
  public static void plan() {
    System.out.println("Digite o preço do plano: ");
    double price = scan.nextDouble();
    System.out.println("Digite o periodo do plano: ");
    String period = scan.nextLine();
    System.out.println("Tem cupom de desconto [Y/N]: ");
    Boolean promocode = scan.nextBoolean();
  }

}