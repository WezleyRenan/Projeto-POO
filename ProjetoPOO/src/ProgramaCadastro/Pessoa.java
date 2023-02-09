package ProgramaCadastro;

public class Pessoa {
	
	@Override
	public String toString() {
		return " {nome= " + nome + ", sexo= " + sexo + ", localNascimento= " + localNascimento + ", dataNascimento= "
				+ dataNascimento+ " salario/bolsa = "+salarioBolsa+"R$"+" decimo Terceiro = "+calcularDecimoTerceiro()+"R$";
	}

	public Pessoa(String nome) {
		this.setNome(nome);
		
	}
	
	private double salarioBolsa;
	private String nome;
	private char sexo;
	private String localNascimento;
	private String dataNascimento;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String getLocalNascimento() {
		return localNascimento;
	}
	
	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public double getSalarioBolsa() {
		return salarioBolsa;
	}

	public void setSalarioBolsa(double salarioBolsa) {
		this.salarioBolsa = salarioBolsa;
	}
	public double calcularDecimoTerceiro() {
		this.salarioBolsa= salarioBolsa/3;
		return this.salarioBolsa;
	}
	
}