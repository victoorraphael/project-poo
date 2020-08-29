package Main;

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
	public static String salary;
	public static String filiation;
	public static String federation;
	static ArrayList<Student> students = new ArrayList<>();
	static ArrayList<Professor> professors = new ArrayList<>();
	static int professorId = 0;


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

	
	public static void formPerson() {
		scan.nextLine();
		System.out.println("Insira o Nome Completo:");
		name = scan.nextLine();
		System.out.println("Insira sua Data de Nascimento:");
		birth = scan.nextLine();
		System.out.println("Insira seu Telefone:");
		phone = scan.nextLine();
		System.out.println("� Whatsapp [Y/N]:");
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
		System.out.println("Insira sua Gradu��o:");
		graduation = scan.nextLine();
		System.out.println("Insira seu CEP:");
		zip = scan.nextLine();
		System.out.println("Insira o Logradouro:");
		street = scan.nextLine();
		System.out.println("Insira o N�mero:");
		number = scan.nextLine();
		System.out.println("Insira seu Bairro:");
		neighbour = scan.nextLine();
		System.out.println("Insira o Complemento:");
		complement = scan.nextLine();
		System.out.println("Insira sua Cidade:");
		city = scan.nextLine();
		System.out.println("C�digo de verifica��o:");
		code = scan.nextInt();
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
	
	public static void main(String[] args) {
		
		System.out.println("========== MENU ==========");
		System.out.println("1. Cadastrar");
		System.out.println("2. Atualizar Cadastro");
		System.out.println("3. Buscar Cadastro");
		System.out.println("4. Deletar Cadastro");
		
		int key = scan.nextInt();
		
		switch(key) {
			case 1:
				createStudent();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
		}
	}

}
