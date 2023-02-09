package ProgramaCadastro;

public class Professor extends Pessoa {
	
	@Override
	public String toString() {
		return super.toString()+"formacao=" + formacao + " Salario Liquido: "+ CalculosSalariais.getCalculosSalariais(getSalarioBolsa()) ;
	}

	public Professor(String nome) {
		super(nome);
	}

	private String formacao;

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public double calcularDecimoTerceiro() {
		return this.getSalarioBolsa();
	}
	
}