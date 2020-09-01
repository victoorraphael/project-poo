package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Update{

  static Scanner scan = new Scanner(System.in);

  public static void student(ArrayList<Student> students){
	try {
	if (students.size() > 0) {
		System.out.println("Digite o nome do Estudante que deseja alterar: ");
  	String name = scan.nextLine();
	students.forEach( stud -> {
	  if(stud.getName().equals(name)){
		  System.out.println("Digite o novo nome do Aluno: ");
		  String newName = scan.nextLine();
	    stud.setName(newName);
	  }
	});
	} else {
		System.out.println("Nenhum aluno cadastrado!");
	}
	} catch (Exception erro) {
		System.out.println("Voc� digitou algo errado!");
	}
  }

  public static void professor(ArrayList<Professor> professors) {
	  
	  try {
	  
	  if (professors.size() > 0) {
			System.out.println("Digite o nome do professor que deseja alterar: ");
	  	String name = scan.nextLine();
		professors.forEach( prof -> {
		  if(prof.getName().equals(name)){
			  System.out.println("Digite o novo nome do professor: ");
			  String newName = scan.nextLine();
		    prof.setName(newName);
		  }
		});
		} else {
			System.out.println("Nenhum professor cadastrado!");
		}
	  } catch (Exception erro) {
		System.out.println("ERRO! Voc� digitou algo errado!");	
	  }
  }
	  

  public static void classroom(ArrayList<Classroom> classrooms){
    Classroom classroom;
    String op;
    System.out.println("Digite o Id da turma:");
	  String name_class = scan.nextLine();
  	boolean flag;
  	classroom = Get.classroom(classrooms, name_class);
  	if(classroom == null) {
		flag = false;
  	}else {
		flag = true;
  	}
	 
    while(!(flag)){
      System.out.println("Esse turma nao existe, deseja tentar novamente. [Y/N]");
      op = scan.nextLine();
      if((op.equals("y")) || (op.equals("Y"))) {
    	  System.out.println("Digite o Id da turma novamente: ");
    	  name_class = scan.nextLine();
    	  classroom = Get.classroom(classrooms, name_class);
    	  if(classroom == null) {
  			flag = false;
  		}else {
  			flag = true;
  			
  		}
      }else {
    	  flag = true;
      }	      
    }
    if(classroom != null) {
    	System.out.println("Professor: " + classroom.getProfessor().getName());
    	System.out.println("Modalidade: " + classroom.getModality().getModality());
    	System.out.println("Horario: " + classroom.getSchedule());
    	System.out.println("Qual campo deseja alterar? \n1-Professor\n2-Modalidade\n3-Horario");
    	int op2 = scan.nextInt();
    	scan.nextLine();
    	if(op2 == 1) {
    		ArrayList<Professor> professors = new ArrayList<Professor>();
    		op2 = 0;
    		professors = Get.allProfessor();
    		System.out.println("Escolha o professor que deseja colocar no lugar do professor atual:");
    		int i = 1;
    		for(Professor p : professors) {
    			System.out.println(i + " - " + p.getName());
    			i++;
    		}
    		op2 = scan.nextInt();
    		scan.nextLine();
    		classroom.setProfessor(professors.get((op2)-1));
    		System.out.println("Professor da turma atualizado!");
    		
    	}else if(op2 == 2) {
    		ArrayList<MartialArt> martialArts = new ArrayList<MartialArt>();
    		op2 = 0;
    		martialArts = Get.allMartialArt();
    		System.out.println("Escolha a modalidade que deseja colocar no lugar da modalidade atual:");
    		int i = 1;
    		for(MartialArt m : martialArts) {
    			System.out.println(i + " - " + m.getModality());
    			i++;
    		}
    		op2 = scan.nextInt();
    		scan.nextLine();
    		classroom.setModality(martialArts.get((op2)-1));
    		System.out.println("Modalidade da turma atualizada!");
    	}else {
    		System.out.println("Para qual deseja alterar?");
    		String newSchedule = scan.nextLine();
    		classroom.setSchedule(newSchedule);
    		System.out.println("Horario da turma atualizada!");
    	}
    	
    }else {
    	System.out.println("Nenhuma classe atualizada");
    }
    
    
  }

  
  public static void martialArt(ArrayList<MartialArt> martials) {
		Boolean flag = false;
		MartialArt martial;
		String modality;
		do {
			System.out.println("Insira a modalidade que deseja alterar: ");
			modality = scan.nextLine();
			martial = Get.martialArt(martials, modality);

			try {
				if (martial == null) {
					System.out.println("ERRO! Item nao cadastrado");
					System.out.println("1 - Tentar novamente");
					System.out.println("0 - Sair");
					int option = scan.nextInt();
					scan.nextLine();
					if (option == 0) {
						flag = true;
					} else if (option == 1) {
						modality = scan.nextLine();
						martial = Get.martialArt(martials, modality);
					} else {
						System.out.println("Opcao invalida");
					}

				} else {
					System.out.println("Insira a nova modalidade: ");
					modality = scan.nextLine();
					martial.setModality(modality);
					flag = true;
				}
			} catch (Exception erro) {
				System.out.println("ERRO! Voce digitou algo errado, tente novamente!");
				System.out.println("#################################################");
				break;
			}

		} while (!flag);
	}

  public static void plan(ArrayList<Plans> plans){
    Boolean flag = false;
		Plans plan1;
		do {
			System.out.println("Insira o PLANO que deseja alterar: ");
			String planName = scan.nextLine();
			plan1 = Get.plan(plans, planName);

			try {
				if (plan1 == null) {
					System.out.println("ERRO! Item não cadastrado");
					System.out.println("1 - Tentar novamente");
					System.out.println("0 - Sair");
					int option = scan.nextInt();
					scan.nextLine();
					if (option == 0) {
						flag = true;
					} else if (option == 1) {
						planName = scan.nextLine();
						plan1 = Get.plan(plans, planName);
					} else {
						System.out.println("Opção invalida");
					}

				} else {
					System.out.println("Insira o nome do novo Plano: ");
					planName = scan.nextLine();
					plan1.setName(planName);
					System.out.println("Insira o novo valor: ");
					double price = scan.nextDouble();
					plan1.setPrice(price);
					System.out.println("Insira o novo período: ");
					String period = scan.nextLine();
					scan.nextLine();
					plan1.setPeriod(period);
					System.out.println("Insira o novo id: ");
					int id = scan.nextInt();
					plan1.setId(id);
					flag = true;
				}
			} catch (Exception erro) {
				System.out.println("ERRO! Você digitou algo errado, tente novamente!");
				System.out.println("#################################################");
				break;
			}

		} while (!flag);
	}

  }
