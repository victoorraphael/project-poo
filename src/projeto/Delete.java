package projeto;

public class Delete{

  public static void student(){

  }

  public static void professor(
    id,
    ArrayList<Professor> professors
    ){
      int arraySize = professors.size();
      for (int i = 0; i < arraySize; i ++) {
        if(professors.get(i).getId() == id()){
          professors.remove(i);
        }
      }
    }

  public static void classroom(){

  }
  //Deleta o elemento de MartialArt - OK!
  public static void deleteMartialArt(ArrayList<MartialArt> martials) {
		Boolean flag = false;
		MartialArt martial;
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
				System.out.println("ERRO! Você digitou algo errado, tente novamente!");
				System.out.println("#################################################");
				break;
			}

		} while (!flag);
	}

  public static void plan(){
    
  }
}