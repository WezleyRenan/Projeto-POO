package ProgramaCadastro;

public class Estagiario extends Pessoa {
	
	@Override
	public String toString() {
		return super.toString()+" instituicao=" + instituicao + ", periodo=" + periodo + ", curso=" + curso;
	}
	public Estagiario(String nome) {
		super(nome);
	}
	private String instituicao;
	private int periodo;
	private String curso;
	
	public String getInstituicao() {
		return instituicao;
	}
	public int getPeriodo() {
		return periodo;
	}
	public String getCurso() {
		return curso;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

}