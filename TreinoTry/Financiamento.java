package TreinoTry;

public class Financiamento {

	public double ValorTotal;
	public double Entrada;
	public Integer Parcelas;

	public Financiamento(double ValorTotal, double entrada, Integer parcelas) {
		if (entrada < ValorTotal * 0.2) {
			throw new RuntimeException("A entrada deve ser pelo menos 20% do valor total");
		} else if (parcelas < 6) {
			throw new RuntimeException("O numero minimo de parcelas deve ser 6");
		}

		this.ValorTotal = ValorTotal;
		this.Parcelas = parcelas;
		this.Entrada = entrada;
	}

	public double prestacao() {
		return (ValorTotal - Entrada) / Parcelas;
	}

}
