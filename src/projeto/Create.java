package projeto;

public class Create{

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

  public static void professor() {
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

  public static void student() {
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

  public static void martialArt() {

		System.out.println("Insira o modalidade que deseja: ");
		modality = scan.nextLine();
		martialArt.add(new MartialArt(modality)); 
  }

  public static void classroom(ArrayList<Student> students, ArrayList<Professor> professors){
    System.out.println("Digite o nome do professor");
    name_professor = scan.nextLine();
    Boolean flag = verifyProfessor(students, professors);
    while(!(flag){
      System.out.println("Esse professor não existe, deseja tentar novamente. [Y/N]");
      op = scan.nextLine
      
    }
    
  }


  public static Boolean verifyProfessor(ArrayList<Professor> professors, String name){
    for(Professor p : professors) {
			if(p.getName().equals(name)) {
				return true;
			}
		}
    return false;
  } 

  public static void plan() {
    System.out.println("Digite o preço do plano: ");
    double price = scan.nextDouble();
    System.out.println("Digite o periodo do plano: ");
    String period = scan.nextLine();
    System.out.println("Tem cupom de desconto [Y/N]: ");
    Boolean promocode = scan.nextBoolean();
  }

}
