package ProgramaCadastro;

public abstract class Menu {
	
	public static String getMenu(){
		String menu="***** Sistema Academico*****\n"
				+ "Menu: \n=====================\n"
				+ "digite uma op�ao:\n"
				+ "1-cadastrar aluno\n"
				+ "2-listar aluno \n"
				+ "3-cadastrar professor \n"
				+ "4-listar professor \n"
				+ "5--cadastrar coordenador\n"
				+ "6-listar coordenador\n"
				+ "7-cadastrar pesquisador\n"
				+ "8-listar pesquisador\n"
				+ "9-cadastrar estagiario\n"
				+ "10-listar estagiario\n"
				+ "11-cadastrar psicologo\n"
				+ "12-listar psicologo\n"
				+ "13-cadastrar tecnico\n"
				+ "14-listar tecnico\n"
				+ "15-cadastrar bolsista\n"
				+ "16-listar bolsista\n"
				+ "17-cadastrar fornecedor\n"
				+ "18-listar fornecedor\n"
				+ "0-sair ";
		return menu;
	}

}