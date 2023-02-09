package ProgramaCadastro;

public class Pesquisador extends Pessoa {
	
	@Override
	public String toString() {
		return super.toString()+" codigoPesquisa=" + codigoPesquisa + ", grupoPesquisa=" + grupoPesquisa
				+ ", instituicaoVinculada=" + instituicaoVinculada;
	}
	public Pesquisador(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	private int codigoPesquisa;
	private String grupoPesquisa;
	private String instituicaoVinculada;
	
	public int getCodigoPesquisa() {
		return codigoPesquisa;
	}
	public void setCodigoPesquisa(int codigoPesquisa) {
		this.codigoPesquisa = codigoPesquisa;
	}
	public String getGrupoPesquisa() {
		return grupoPesquisa;
	}
	public void setGrupoPesquisa(String grupoPesquisa) {
		this.grupoPesquisa = grupoPesquisa;
	}
	public String getInstituicaoVinculada() {
		return instituicaoVinculada;
	}
	public void setInstituicaoVinculada(String instituicaoVinculada) {
		this.instituicaoVinculada = instituicaoVinculada;
	}
	

}