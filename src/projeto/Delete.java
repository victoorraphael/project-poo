package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Delete{
	
	static Scanner scan = new Scanner(System.in);

  public static void student(ArrayList<Student> students){
	  if(students != null) {
			Student student;
			System.out.println("Digite o nome do estudante que deseja deletar:");
			String nameStudent = scan.nextLine();
			try {
			scan.nextLine();
				for(Student s : students) {
					if(s.getName().contains(nameStudent)){
						students.remove(s);
						System.out.println("Estudante excluido com sucesso");
						break;
					}
				}
			}catch (Exception erro) {
				System.out.println("ERRO! Voce digitou algo errado, tente novamente!");
				System.out.println("#################################################");
			}
		}else {
			System.out.println("Nao ha nenhuma turma cadastrada.");
		}
		
	}

  public static void professor(ArrayList<Professor> professors){
		if(professors != null){
			System.out.println("Insira o id do professor que deseja Deletar: ");
			int id = scan.nextInt();
			int arraySize = professors.size();
			try{
				for (int i = 0; i < arraySize; i ++) {
					if(professors.get(i).getId() == id){
						professors.remove(i);
						System.out.println("Professor excluido com sucesso!");
						break;
					}
				}
			}catch (Exception erro){
				System.out.println("ERRO! Voce digitou algo errado, tente novamente!");
				System.out.println("#################################################");
			}
		} else {
			System.out.println("Nao ha nenhuma turma cadastrada.");
	  }
    }

  
  public static void classroom(ArrayList<Classroom> classrooms){
		if(classrooms != null) {
			Classroom classroom;
			System.out.println("Digite o nome do professor da turma que deseja deletar:");
			String name_class = scan.nextLine();
			try {
			scan.nextLine();
				for(Classroom c : classrooms) {
					if(c.getProfessor().getName().contains(name_class)) {
						classrooms.remove(c);
						System.out.println("Turma excluida com sucesso");
						break;
					}
				}
			}catch (Exception erro) {
				System.out.println("ERRO! Voce digitou algo errado, tente novamente!");
				System.out.println("#################################################");
			}
		}else {
			System.out.println("Nao ha nenhuma turma cadastrada.");
		}
		
	}
  

  
  public static void martialArt(ArrayList<MartialArt> martials) {
		Boolean flag = false;
		MartialArt martial;
		String modality;
		do {
			System.out.println("Insira a modalidade que deseja DELETAR: ");
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
						System.out.println("opcao invalida");
					}

				} else {
					System.out.println("Voce ira DELETAR a modalidade: " + martial.getModality());
					System.out.println("Deseja Continuar [Y/N]?");
					String option = "Y";
					if (option.contains("Y") || option.contains("y")) {
						modality = scan.nextLine();
						martials.remove(modality);
						System.out.println("Plano excluido com sucesso!");
						flag = true;
					} else if (!option.contains("Y") || !option.contains("y")) {
						System.out.println("Cancelado!");
					}

				}
			} catch (Exception erro) {
				System.out.println("ERRO! Voce digitou algo errado, tente novamente!");
				System.out.println("#################################################");
				break;
			}

		} while (!flag);
	}

  public static void plan(ArrayList<Plans> plans) {
		Boolean flag = false;
		Plans plan;
		do {
			scan.nextLine();
			System.out.println("Insira o Plano que deseja DELETAR: ");
			String planName = scan.nextLine();
			plan = Get.plan(plans, planName);

			try {
				if (plan == null) {
					System.out.println("ERRO! Item nao cadastrado");
					System.out.println("1 - Tentar novamente");
					System.out.println("0 - Sair");
					int option = scan.nextInt();
					scan.nextLine();
					if (option == 0) {
						flag = true;
					} else if (option == 1) {
						plan = Get.plan(plans, planName);
					} else {
						System.out.println("Opcao invalida");
					}

				} else {
					System.out.println("Você ira DELETAR a modalidade: " + plan.getName());
					System.out.println("Deseja Continuar [Y/N]?");
					String option = scan.nextLine();
					if (option.contains("Y") || option.contains("y")) {
						plans.remove(plan);
						System.out.println("Plano excluido com sucesso!");
						flag = true;
					} else if (!option.contains("Y") || !option.contains("y")) {
						System.out.println("Cancelado!");
					}

				}
			} catch (Exception erro) {
				System.out.println("ERRO! Voce digitou algo errado, tente novamente!");
				System.out.println("#################################################");
				break;
			}

		} while (!flag);
	}
}