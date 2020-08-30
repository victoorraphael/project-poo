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
		
		System.out.println("========== MENU ==========");
		System.out.println("1. Cadastrar");
		System.out.println("2. Atualizar Cadastro");
		System.out.println("3. Buscar Cadastro");
		System.out.println("4. Deletar Cadastro");
		
		int key = scan.nextInt();
		scan.nextLine();
		
		switch(key) {
			case 1:
		        System.out.println("========== ESCOLHA UMA OPÇÃO ==========");
		        System.out.println("1. Aluno");
		        System.out.println("2. Professor");
		        System.out.println("3. Turma");
		        System.out.println("4. Arte Marcial");
		        System.out.println("5. Planos");
		        int secondaryKey = scan.nextInt();
	        scan.nextLine();
		        
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
		            System.out.println("Digite o nome do aluno:")
	            
		            Get.student(Repository.students);
		            break;
		          case 2:
		            Get.professor(Repository.professors);
		            break;
		          case 3:
		            Get.classroom(Repository.classrooms);
		            break;
		          case 4:
		            Get.martialArt(Repository.martialArts);
		            break;
		          case 5:
		            Get.plan(Repository.plans);
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
