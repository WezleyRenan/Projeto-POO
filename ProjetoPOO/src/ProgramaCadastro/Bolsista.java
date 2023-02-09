package ProgramaCadastro;

public class Bolsista extends Pessoa{

	public Bolsista(String nome) {
		super(nome);
		
	}
	private double valorBolsa;
	private String orientador;
	
	public double getValorBolsa() {
		return valorBolsa;
	}
	public String getOrientador() {
		return orientador;
	}
	@Override
	public String toString() {
		return super.toString()+" valorBolsa=" + valorBolsa + ", orientador=" + orientador + "}";
	}
	public void setValorBolsa(double valorBolsa) {
		this.valorBolsa = valorBolsa;
	}
	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}

}