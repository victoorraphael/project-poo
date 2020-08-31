package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
  
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

    Student student;
    Professor professor;
    Classroom classroom;
    MartialArt martialArt;
    Plans plan;
    
    boolean loop = true;
    
    do {
    System.out.println("========== MENU ==========");
		System.out.println("1. Cadastrar");
		System.out.println("2. Atualizar Cadastro");
		System.out.println("3. Buscar Cadastro");
		System.out.println("4. Deletar Cadastro");
		System.out.println("0. Sair");
		int key = scan.nextInt();
		
		scan.nextLine();
		
		switch(key) {
			case 0:
	        	System.out.println("Obrigado por usar nosso sistema!");
	        	loop = false;
	        	break;
			case 1:
		        System.out.println("========== ESCOLHA UMA OPÇÃO ==========");
		        System.out.println("1. Aluno");
		        System.out.println("2. Professor");
		        System.out.println("3. Turma");
		        System.out.println("4. Arte Marcial");
		        System.out.println("5. Planos");
		        
		        int secondaryKey = scan.nextInt();
		        scan.nextLine();
	        
		        // Submenu
		        switch(secondaryKey){
		          case 1:
		            Create.student();
		            break;
		          case 2:
		            Create.professor();
		            break;
		          case 3:
		            if(Repository.professors == null){
		              System.out.println("Nenhum professor inserido no sistema ainda.");
		              break;
		            }
		            if(Repository.martialArts == null){
		              System.out.println("Nenhuma arte marcial inserida no sistema ainda.");
		              break;
		            }
		            Create.classroom(Repository.professors, Repository.martialArts);
		            break;
		          case 4:
		            Create.martialArt();
		            break;
		          case 5:
		            Create.plan();
		            break;
		          default:
		            System.out.println("Escolha uma opcao valida!");
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
		        scan.nextLine();
		        
		        switch(secondaryKey){
		          case 1:		        	  
		        	  Update.student(Repository.students);
		            break;
		          case 2:
		            Update.professor(Repository.professors);
		            break;
		          case 3:
		            Update.classroom(Repository.classrooms);
		            break;
		          case 4:
		            Update.martialArt(Repository.martialArts);
		            break;
		          case 5:
		            Update.plan(Repository.plans);
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
		        	  scan.nextLine();
		        	  System.out.println("Digite o nome do aluno:");
		        	  String name = scan.nextLine();
		        	  Get.student(Repository.students, name);
		        	  break;
		          case 2:
		        	  System.out.println("Digite o nome do aluno:");
		        	  String prof = scan.nextLine();
		        	  Get.professor(Repository.professors, prof);
		        	  break;
		          case 3:
		        	  System.out.println("Digite o id da turma: ");
		        	  int id = scan.nextInt();
		            Get.classroom(Repository.classrooms, id);
		            break;
		          case 4:
		        	  System.out.println("Digite a modalidade da turma: ");
		        	  String modality = scan.nextLine();
		            Get.martialArt(Repository.martialArts, modality);
		            break;
		          case 5:
		        	  System.out.println("Insira o nome do plano: ");
		        	  String planName = scan.nextLine();
		            Get.plan(Repository.plans, planName);
		            break;
		          default:
		            System.out.println("Escolha uma opção válida!");
		            break;
		        }
				break;
			case 4:
		        System.out.println("========== ESCOLHA UMA OPCAO ==========");
		        System.out.println("1. Aluno");
		        System.out.println("2. Professor");
		        System.out.println("3. Turma");
		        System.out.println("4. Arte Marcial");
		        System.out.println("5. Planos");
		        secondaryKey = scan.nextInt();
		        
		        switch(secondaryKey){
		          case 1:
					System.out.println("Digite o id do Aluno: ");
					int id = scan.nextInt();
		            Delete.student(id, Repository.students);
		            break;
		          case 2:
		        	Delete.professor(Repository.professors);
					break;
		          case 3:
		            Delete.classroom(Repository.classrooms);
		            break;
		          case 4:
		            Delete.martialArt(Repository.martialArts);
		            break;
		          case 5:
		            Delete.plan();
		            break;
		          default:
		            System.out.println("Escolha uma opcao valida!");
		            break;
		        }
				break;
			default:
				System.out.println("Digite uma opcao valida!");
				break;
		}
	} while (loop);
		
	}

}
