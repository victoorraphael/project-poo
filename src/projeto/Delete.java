package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Delete{
	
	static Scanner scan = new Scanner(System.in);

  public static void student(){

  }

  public static void professor(
    int id,
    ArrayList<Professor> professors
    ){
      int arraySize = professors.size();
      for (int i = 0; i < arraySize; i ++) {
        if(professors.get(i).getId() == id){
          professors.remove(i);
        }
      }
    }

  public static void classroom(ArrayList<Classroom> classrooms){
		if(classrooms != null) {
			Classroom classroom;
			System.out.println("Digite o id que deseja deletar:");
			int id = scan.nextInt();
			try {
			scan.nextLine();
				for(Classroom c : classrooms) {
					if(c.getId() == id) {
						classrooms.remove(c);
						System.out.println("Classe excluida com sucesso");
						break;
					}
				}
			}catch (Exception erro) {
				System.out.println("ERRO! Voce digitou algo errado, tente novamente!");
				System.out.println("#################################################");
			}
		}else {
			System.out.println("Não há nenhuma turma cadastrada.");
		}
		
	}
  
  //Deleta o elemento de MartialArt - OK!
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
					System.out.println("ERRO! Item não cadastrado");
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
						System.out.println("Opção invalida");
					}

				} else {
					System.out.println("Você irá DELETAR a modalidade: " + martial.getModality());
					System.out.println("Deseja Continuar [Y/N]?");
					String Option = "Y";
					if (Option == "Y") {
						modality = scan.nextLine();
						martials.remove(martial);
						flag = true;
					} else if (Option != "Y") {
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

  public static void plan(){
    
  }
}