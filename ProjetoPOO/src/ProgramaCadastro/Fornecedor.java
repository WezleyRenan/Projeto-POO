package ProgramaCadastro;

public class Fornecedor {
	private String razaoSocial;
	private String cnpj;
	private String cidade;
	
	
	@Override
	public String toString() {
		return "{ razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", cidade=" + cidade + "}";
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public String getCidade() {
		return cidade;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
