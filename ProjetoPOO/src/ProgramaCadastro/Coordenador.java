package ProgramaCadastro;

public class Coordenador extends Professor {
	
	@Override
	public String toString() {
		return super.toString()+" curso=" + curso + "}";
	}

	public Coordenador(String nome) {
		super(nome);
	}

	private String curso;
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
