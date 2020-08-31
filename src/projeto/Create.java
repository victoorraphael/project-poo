package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Create{

	static Scanner scan = new Scanner(System.in);



	static int professorId = 0;
	public static int idStudent = 0;
	public static int id_classroom = 0;

	public static boolean validateWpp(String isWhatsapp) {
		if(isWhatsapp.equals("y") || isWhatsapp.equals("Y")) {
			return true;
		} else if (isWhatsapp.contains("nN")) {
			return false; 
		}
	return false;
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
		String isWhatsapp = scan.nextLine();
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
		System.out.println("Insira o salÃ¡rio do Professor: ");
		double salary = scan.nextDouble();
		System.out.println("Insira a filiaÃ§Ã£o do Professor: ");
		String filiation = scan.nextLine();
		System.out.println("Insira a federaÃ§Ã£o do Professor: ");
		String federation = scan.nextLine();
		professorId += 1;
		boolean checkWpp = validateWpp(isWhatsapp);
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
								checkWpp,
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
		String isWhatsapp = scan.nextLine();
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
		boolean checkWpp = validateWpp(isWhatsapp);
		
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
							checkWpp,
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

  public static Plans plan(ArrayList<Plans> plans) {
	  Plans plan = null;
    try{
		System.out.println("Digite o nome do Plano:");
		String name = scan.next();
		System.out.println("Digite o valor do planos, R$: ");
		double price = scan.nextDouble();
		System.out.println("Digite o perodo: ");
		scan.next();
		String period = scan.nextLine();
		System.out.println("Digite o Id do Plano");
		int id = scan.nextInt();
		plan = new Plans(name, price, period, id);
		plans.add(plan);
		if (plan != null) {
			savePlan(plan, Repository.plans);			
	}
  } catch (Exception erro){
    System.out.println("ERRO! Voce digitou algo errado!");
  }
		return plan;
  }

	  public static void savePlan(Plans plan, ArrayList<Plans> plans){
	    plans.add(plan);
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
	      System.out.println("Esse professor nao existe, deseja tentar novamente. [Y/N]");
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
		      System.out.println("Esse modalidade nÃo existe, deseja tentar novamente. [Y/N]");
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
	    System.out.println("Qual o horÃ¡rio dessa turma? \n1 - 15h\n2 - 19h\n3 - 22h");
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

}