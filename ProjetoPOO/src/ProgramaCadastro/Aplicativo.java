package ProgramaCadastro;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicativo {

	public static void main(String[] args) {
		String nome;
		char sexo;
		String localNascimento;
		String dataNascimento;
		String formacao;
		double valorBolsa;
		
        Scanner input=new Scanner(System.in);
		System.out.println(Menu.getMenu());
		int opcao=input.nextInt();
        ArrayList <Aluno> alunos=new ArrayList <Aluno>();
		ArrayList <Professor> professores=new ArrayList <Professor>();
		ArrayList <Coordenador> coordenadores =new ArrayList <Coordenador>();
		ArrayList <Pesquisador> pesquisadores =new ArrayList <Pesquisador>();
		ArrayList <Estagiario> estagiarios=new ArrayList <Estagiario>();
		ArrayList <Psicologo> psicologos=new ArrayList <Psicologo>();
		ArrayList <Tecnico> tecnicos=new ArrayList <Tecnico>();
		ArrayList <Bolsista> bolsistas= new ArrayList <Bolsista>();
		ArrayList <Fornecedor> fornecedores=new ArrayList <Fornecedor>();
		while (opcao!=0) {
			switch (opcao) {
				case 1: //aluno
					double nota1=0,nota2=0,nota3=0;
					System.out.println("cadastrando aluno:");
					System.out.println("digite o nome do aluno:");
					nome=input.next();
					System.out.println("informe o sexo do aluno:");
					sexo=input.next().charAt(0);
					System.out.println("informe o local de nascimento");
					localNascimento=input.next();
					System.out.println("informe a data de nascimento");
					dataNascimento=input.next();
					System.out.println("informe o valor da bolsa");
					valorBolsa=input.nextDouble();
					System.out.println("nota 1: ");
					nota1=input.nextDouble();
					System.out.println("nota 2: ");
					nota2=input.nextDouble();
					System.out.println("nota 3: ");
					nota3=input.nextDouble();
					Aluno aluno=new Aluno(nome);
					aluno.setSexo(sexo);
					aluno.setDataNascimento(dataNascimento);
					aluno.setLocalNascimento(localNascimento);
					aluno.setNota1(opcao);
					aluno.setSalarioBolsa(valorBolsa);
					aluno.setNota1(nota1);
					aluno.setNota2(nota2);
					aluno.setNota3(nota3);
					alunos.add(aluno);
					break;
					
		        case 2:
		        	System.out.println("listando aluno:");
		        	for(int i=0;i<alunos.size();i++)
		        	System.out.println(alunos);
					break;
					
		        case 3: //professor
		        	System.out.println("cadastrando professor:");
		        	System.out.println("digite o nome do professor:");
					nome=input.next();
					System.out.println("informe o sexo do professor:");
					sexo=input.next().charAt(0);
					System.out.println("informe o local de nascimento");
					localNascimento=input.next();
					System.out.println("informe a data de nascimento");
					dataNascimento=input.next();
					System.out.println("informe a formaçao do professor");
					formacao=input.next();
					System.out.println("informe o salario:");
					valorBolsa=input.nextDouble();
					Professor professor=new Professor(nome);
					professor.setSexo(sexo);
					professor.setDataNascimento(dataNascimento);
					professor.setLocalNascimento(localNascimento);
					professor.setFormacao(formacao);
					professor.setSalarioBolsa(valorBolsa);
					professores.add(professor);
					
			        break;
			        
		        case 4:
		        	System.out.println("listando professor:");
		        	for (int i=0;i<professores.size();i++) {
		            	System.out.println(professores);
		        	}
		        	
			        break;
			        
		        case 5: //coordenador
		        	String curso;
					System.out.println("cadastrando coordenador:");
					System.out.println("digite o nome do coordenador:");
					nome=input.next();
					System.out.println("informe o sexo do coordenador:");
					sexo=input.next().charAt(0);
					System.out.println("informe o local de nascimento");
					localNascimento=input.next();
					System.out.println("informe a data de nascimento");
					dataNascimento=input.next();
					System.out.println("informe o curso: ");
					curso=input.next();
					System.out.println("informe a formaçao do coordenador");
					formacao=input.next();
					System.out.println("informe o salario:");
					valorBolsa=input.nextDouble();
					Coordenador coordenador=new Coordenador(nome);
					coordenador.setSexo(sexo);
					coordenador.setDataNascimento(dataNascimento);
					coordenador.setLocalNascimento(localNascimento);
					coordenador.setFormacao(formacao);
					coordenador.setSalarioBolsa(valorBolsa);
					coordenador.setCurso(curso);
					coordenadores.add(coordenador);
					break;
					
		        case 6:
		        	System.out.println("listando coordenador:");
		        	for (int i=0;i<coordenadores.size();i++) {
		            	System.out.println(coordenadores);
		        	}
		        	
					break;
					
		        case 7: //pesquisador
		        	int codigoPesquisa;
		        	String grupoPesquisa;
		        	String instituicaoVinculada;
		        	System.out.println("cadastrando pesquisador:");
		        	System.out.println("digite o nome do pesquisador:");
					nome=input.next();
					System.out.println("informe o sexo do pesquisador:");
					sexo=input.next().charAt(0);
					System.out.println("informe o local de nascimento");
					localNascimento=input.next();
					System.out.println("informe a data de nascimento");
					dataNascimento=input.next();
					System.out.println("informe a instituiçao vinculada: ");
					instituicaoVinculada=input.next();
					System.out.println("informe o grupo de pesquisa: ");
					grupoPesquisa=input.next();
					System.out.println("informe o codigo de pesquisa: ");
					codigoPesquisa=input.nextInt();
					System.out.println("informe o salario:");
					valorBolsa=input.nextDouble();
					Pesquisador pesquisador=new Pesquisador(nome);
					pesquisador.setSexo(sexo);
					pesquisador.setDataNascimento(dataNascimento);
					pesquisador.setLocalNascimento(localNascimento);
					pesquisador.setCodigoPesquisa(codigoPesquisa);
					pesquisador.setGrupoPesquisa(grupoPesquisa);
					pesquisador.setSalarioBolsa(valorBolsa);
					pesquisador.setInstituicaoVinculada(instituicaoVinculada);
					pesquisadores.add(pesquisador);
			        break;
			        
		        case 8:
		        	System.out.println("listando pesquisador:");
		        	for (int i=0;i<pesquisadores.size();i++) {
		        		System.out.println(pesquisadores);
		        	}
		
		        	System.out.println(" ");
			        break;
			        
			    case 9: //estagiario
			    	String instituicao;
			    	int periodo;
					System.out.println("cadastrando estagiario:");
					System.out.println("digite o nome do estagiario:");
					nome=input.next();
					System.out.println("informe o sexo do estagiario:");
					sexo=input.next().charAt(0);
					System.out.println("informe o local de nascimento");
					localNascimento=input.next();
					System.out.println("informe a data de nascimento");
					dataNascimento=input.next();
					System.out.println("informe a instituiçao: ");
					instituicao=input.next();
					System.out.println("informe o periodo: ");
					periodo=input.nextInt();
					System.out.println("informe o curso: ");
					curso=input.next();
					System.out.println("informe o salario:");
					valorBolsa=input.nextDouble();
					Estagiario estagiario=new Estagiario(nome);
					estagiario.setSexo(sexo);
					estagiario.setDataNascimento(dataNascimento);
					estagiario.setLocalNascimento(localNascimento);
					estagiario.setInstituicao(instituicao);
					estagiario.setCurso(curso);
					estagiario.setSalarioBolsa(valorBolsa);
					estagiario.setPeriodo(periodo);
					estagiarios.add(estagiario);
					break;
					
			    case 10:
			        System.out.println("listando estagiario:");
			        for (int i=0;i<estagiarios.size();i++) {
			        	System.out.println(estagiarios);
		        	}
			        System.out.println(" ");
					break;
					
			    case 11: //psicologo
			    	int numeroConselho;
			        int cargaHoraria;
			        System.out.println("cadastrando psicologo:");
			        System.out.println("digite o nome do psicologo:");
					nome=input.next();
					System.out.println("informe o sexo do psicologo:");
					sexo=input.next().charAt(0);
					System.out.println("informe o local de nascimento");
					localNascimento=input.next();
					System.out.println("informe a data de nascimento");
					dataNascimento=input.next();
					System.out.println("informe o numero do conselho: ");
					numeroConselho=input.nextInt();
					System.out.println("informe a carga horaria:");
					cargaHoraria=input.nextInt();
					System.out.println("inforne o salario:");
					valorBolsa=input.nextDouble();
					Psicologo psicologo=new Psicologo(nome);
					psicologo.setSexo(sexo);
					psicologo.setLocalNascimento(localNascimento);
					psicologo.setDataNascimento(dataNascimento);
					psicologo.setCargaHoraria(cargaHoraria);
					psicologo.setNumeroConselho(numeroConselho);
					psicologo.setSalarioBolsa(valorBolsa);
					psicologos.add(psicologo);
				    break;
				    
			    case 12:
			        System.out.println("listando psicologo:");
			        for (int i=0;i<psicologos.size();i++) {
			        	System.out.println(psicologos);
		        	}
				       break;
				       
			    case 13: //tecnico
			    	String especialidade;
		        	System.out.println("cadastrando tecnico:");
		        	System.out.println("digite o nome do tecnico:");
					nome=input.next();
					System.out.println("informe o sexo do tecnico:");
					sexo=input.next().charAt(0);
					System.out.println("informe o local de nascimento");
					localNascimento=input.next();
					System.out.println("informe a data de nascimento");
					dataNascimento=input.next();
					System.out.println("informe a especialidade: ");
					especialidade=input.next();
					System.out.println("informe o numero do conselho: ");
					numeroConselho=input.nextInt();
					System.out.println("informe a carga horaria:");
					cargaHoraria=input.nextInt();
					System.out.println("informe o salario:");
					valorBolsa=input.nextDouble();
					Tecnico tecnico=new Tecnico(nome);
					tecnico.setSexo(sexo);
					tecnico.setDataNascimento(dataNascimento);
					tecnico.setLocalNascimento(localNascimento);
					tecnico.setCargaHoraria(cargaHoraria);
					tecnico.setNumeroConselho(numeroConselho);
					tecnico.setEspecialidade(especialidade);
					tecnico.setSalarioBolsa(valorBolsa);
					tecnicos.add(tecnico);
			        break;
			        
		        case 14:
		        	System.out.println("listando tecnico:");
		        	for (int i=0;i<tecnicos.size();i++) {
		        		System.out.println(tecnicos);
		        	}
			        break;
			        
		        case 15: //bolsista
		        	String orientador;
		        	double bolsa;
		        	System.out.println("cadastrando bolsista:");
		        	System.out.println("digite o nome do bolsista:");
					nome=input.next();
					System.out.println("informe o sexo do bolsista:");
					sexo=input.next().charAt(0);
					System.out.println("informe o local de nascimento");
					localNascimento=input.next();
					System.out.println("informe a data de nascimento");
					dataNascimento=input.next();
					System.out.println("informe o valor da bolsa");
					bolsa=input.nextDouble();
					System.out.println("informe o orientador");
					orientador=input.next();
				    System.out.println("informe o salario:");
				    valorBolsa=input.nextDouble();
					Bolsista bolsista=new Bolsista(nome);
					bolsista.setSexo(sexo);
					bolsista.setDataNascimento(dataNascimento);
					bolsista.setLocalNascimento(localNascimento);
					bolsista.setValorBolsa(bolsa);
					bolsista.setOrientador(orientador);
					bolsistas.add(bolsista);
			        break;
			        
		        case 16: 
		        	System.out.println("listando bolsista:");
		        	for (int i=0;i<bolsistas.size();i++) {
		        		System.out.println(bolsistas);
		        	}
		        	System.out.println(" ");
			        break;
			        
		        case 17: //fornecedor
		        	String razaoSocial;
		        	String cnpj;
		        	String cidade;
		        	System.out.println("cadastrando fornecedor:");
		        	System.out.println("informe a razao social");
		        	razaoSocial=input.next();
		        	System.out.println("informe o cnpj");
		        	cnpj=input.next();
		        	System.out.println("informe a cidade");
		        	cidade=input.next();
					Fornecedor fornecedor=new Fornecedor();
					fornecedor.setRazaoSocial(razaoSocial);
					fornecedor.setCnpj(cnpj);
					fornecedor.setCidade(cidade);
					fornecedores.add(fornecedor);
			        break;
			        
		        case 18:
		        	System.out.println("listando fornecedor:");
		        	for (int i=0;i<fornecedores.size();i++) {
		            	System.out.println(fornecedores);
		        	}
		        	System.out.println(" ");
			        break;
			        
				default:
					break;
			}
		System.out.println(Menu.getMenu());
		opcao=input.nextInt();
		
		}
	}
}
