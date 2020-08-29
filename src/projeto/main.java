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

  public static void updateMartialArt() {
    Boolean flag = false;
    do{
    try{
    System.out.println("Insira a modalidade que deseja alterar: ");
    modality = scan.nextLine();
    martialArt.forEach(martial -> {
      String mod = martial.getModality();
      
      if(mod.equals(modality)){
        System.out.println("Insira a nova modalidade: ");
        String newModality = scan.nextLine();
        martial.setModality(newModality);
        flag = true;
      }
    });
    }catch (Exception erro){
       System.out.println("ERRO! Item não cadastrado");
        

      }
    } while(!flag);
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
		            Create.student();
		            break;
		          case 2:
		            Create.professor();
		            break;
		          case 3:
		            Create.classroom();
		            break;
		          case 4:
		            Create.martialArt();
		            break;
		          case 5:
		            Create.plan();
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
		        secondaryKey = scan.nextInt();
		        
		        switch(secondaryKey){
		          case 1:
		            Update.student();
		            break;
		          case 2:
		            Update.professor();
		            break;
		          case 3:
		            Update.classroom();
		            break;
		          case 4:
		            Update.martialArt();
		            break;
		          case 5:
		            Update.plan();
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
		        secondaryKey = scan.nextInt();
		        
		        switch(secondaryKey){
		          case 1:
		            Get.student();
		            break;
		          case 2:
		            Get.professor();
		            break;
		          case 3:
		            Get.classroom();
		            break;
		          case 4:
		            Get.martialArt();
		            break;
		          case 5:
		            Get.plan();
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
		        secondaryKey = scan.nextInt();
		        
		        switch(secondaryKey){
		          case 1:
		            Delete.student();
		            break;
		          case 2:
		            Delete.professor();
		            break;
		          case 3:
		            Delete.classroom();
		            break;
		          case 4:
		            Delete.martialArt();
		            break;
		          case 5:
		            Delete.plan();
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
