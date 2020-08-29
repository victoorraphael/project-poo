package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
  
	static Scanner scan = new Scanner(System.in);
	public static String name;
	public static String birth;
	public static String phone;
	public static Boolean isWhatsapp;
	public static String email;
	public static String cpf;
	public static String gender;
	public static String weight;
	public static String height;
	public static String category;
	public static String graduation;
	public static String zip;
	public static String street;
	public static String number;
	public static String neighbour;
	public static String complement;
	public static String city;
	public static int code;
	public static String grade;
	public static int idStudent;
  public static String modality;
	public static String salary;
	public static String filiation;
	public static String federation;
  static ArrayList<Student> students = new ArrayList<>();
  static ArrayList<MartialArt> martialArt = new ArrayList<>();
  static ArrayList<Professor> professors = new ArrayList<>();
	static int professorId = 0;
	
	public static void formPerson() {
		scan.nextLine();
		System.out.println("Insira o Nome Completo:");
		name = scan.nextLine();
		System.out.println("Insira sua Data de Nascimento:");
		birth = scan.nextLine();
		System.out.println("Insira seu Telefone:");
		phone = scan.nextLine();
		System.out.println("eh Whatsapp [Y/N]:");
		isWhatsapp = scan.nextBoolean();
		System.out.println("Insira o seu Email:");
		email = scan.nextLine();
		System.out.println("Insira seu CPF:");
		cpf = scan.nextLine();
		System.out.println("Insira seu Sexo:");
		gender = scan.nextLine();
		System.out.println("Insira seu Peso:");
		weight = scan.nextLine();
		System.out.println("Insira sua Altura:");
		height = scan.nextLine();
		System.out.println("Insira sua Categoria:");
		category = scan.nextLine();
		System.out.println("Insira sua Graduacao:");
		graduation = scan.nextLine();
		System.out.println("Insira seu CEP:");
		zip = scan.nextLine();
		System.out.println("Insira o Logradouro:");
		street = scan.nextLine();
		System.out.println("Insira o Numero:");
		number = scan.nextLine();
		System.out.println("Insira seu Bairro:");
		neighbour = scan.nextLine();
		System.out.println("Insira o Complemento:");
		complement = scan.nextLine();
		System.out.println("Insira sua Cidade:");
		city = scan.nextLine();
		System.out.println("Codigo de verificacao:");
		code = scan.nextInt();
	}
	
	public static void createProfessor() {
		formPerson();
		System.out.println("Insira o salário do Professor: ");
		salary = scan.nextLine();
		System.out.println("Insira a filiação do Professor: ");
		filiation = scan.nextLine();
		System.out.println("Insira a federação do Professor: ");
		federation = scan.nextLine();
		professorId += 1;
		professors.add(new Professor(
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
								));
	}

	public static void createStudent() {
		formPerson();
		System.out.println("Insira o Grau do Aluno: ");
		grade = scan.nextLine();
		students.add(new Student(
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
								));
	}
  public static void createMartialArt() {

		System.out.println("Insira o modalidade que deseja: ");
		modality = scan.nextLine();
		martialArt.add(new MartialArt(modality)); 
  }

  public static void createClassroom(ArrayList<Student> students, ArrayList<Professor> professors){
    System.out.println("Digite o nome do professor");
    
  } 


  public static void createPlan() {
    
  }

  public static void updateMartialArt() {

    System.out.println("Insira a modalidade que deseja alterar: ");
    modality = scan.nextLine();
    martialArt.forEach(martial -> {
      String mod = martial.getModality();
      
      if(mod.equals(modality)){
        System.out.println("Insira a nova modalidade: ");
        String newModality = scan.nextLine();
        martial.setModality(newModality);
      }
    });
	}
  
  public static void deleteMartialArt(){
    System.out.println("Insira a modalidade que deseja deletar: ");
    modality = scan.nextLine();
    martialArt.forEach(martial -> {
      String mod = martial.getModality();
      
      if(mod.equals(modality)){
        martialArt.remove(mod);
      }
    });
  }

  public static void subMenu(func1, func2, func3, func4, func5) {
    
  }

	public static void main(String[] args) {
		
		System.out.println("========== MENU ==========");
		System.out.println("1. Cadastrar");
		System.out.println("2. Atualizar Cadastro");
		System.out.println("3. Buscar Cadastro");
		System.out.println("4. Deletar Cadastro");
		
		int key = scan.nextInt();
		
		switch(key) {
			case 1:
        System.out.println("========== ESCOLHA UMA OPÇÃO ==========");
        System.out.println("1. Aluno");
        System.out.println("2. Professor");
        System.out.println("3. Turma");
        System.out.println("4. Arte Marcial");
        System.out.println("5. Planos");
        int secondaryKey = scan.nextInt();
        
        switch(secondaryKey){
          case 1:
            createStudent();
            break;
          case 2:
            createProfessor();
            break;
          case 3:
            createClassroom();
            break;
          case 4:
            createMartialArt();
            break;
          case 5:
            createPlan();
            break;
          default:
            System.out.println("Escolha uma opção válida!");
            break;
        }
				break;
			case 2:
        System.out.println("========== ESCOLHA UMA OPÇÃO ==========");
        System.out.println("1. Aluno");
        System.out.println("2. Professor");
        System.out.println("3. Turma");
        System.out.println("4. Arte Marcial");
        System.out.println("5. Planos");
        int secondaryKey = scan.nextInt();
        
        switch(secondaryKey){
          case 1:
            updateStudent();
            break;
          case 2:
            updateProfessor();
            break;
          case 3:
            updateClassroom();
            break;
          case 4:
            updateMartialArt();
            break;
          case 5:
            updatePlan();
            break;
          default:
            System.out.println("Escolha uma opção válida!");
            break;
        }
				break;
			case 3:
        System.out.println("========== ESCOLHA UMA OPÇÃO ==========");
        System.out.println("1. Aluno");
        System.out.println("2. Professor");
        System.out.println("3. Turma");
        System.out.println("4. Arte Marcial");
        System.out.println("5. Planos");
        int secondaryKey = scan.nextInt();
        
        switch(secondaryKey){
          case 1:
            getStudent();
            break;
          case 2:
            getProfessor();
            break;
          case 3:
            getClassroom();
            break;
          case 4:
            getMartialArt();
            break;
          case 5:
            getPlan();
            break;
          default:
            System.out.println("Escolha uma opção válida!");
            break;
        }
				break;
			case 4:
        System.out.println("========== ESCOLHA UMA OPÇÃO ==========");
        System.out.println("1. Aluno");
        System.out.println("2. Professor");
        System.out.println("3. Turma");
        System.out.println("4. Arte Marcial");
        System.out.println("5. Planos");
        int secondaryKey = scan.nextInt();
        
        switch(secondaryKey){
          case 1:
            deleteStudent();
            break;
          case 2:
            deleteProfessor();
            break;
          case 3:
            deleteClassroom();
            break;
          case 4:
            deleteMartialArt();
            break;
          case 5:
            deletePlan();
            break;
          default:
            System.out.println("Escolha uma opção válida!");
            break;
        }
				break;
			default:
				break;
		}
	}

}
