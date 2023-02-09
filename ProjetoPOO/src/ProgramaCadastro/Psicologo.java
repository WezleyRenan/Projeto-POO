package ProgramaCadastro;

public class Psicologo extends Pessoa{
        
        @Override
	public String toString() {
		return super.toString()+" numeroConselho=" + numeroConselho + ", cargaHoraria=" + cargaHoraria;
	}
		public Psicologo(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
		private int numeroConselho;
        private int cargaHoraria;
        
		public int getNumeroConselho() {
			return numeroConselho;
		}
		public void setNumeroConselho(int numeroConselho) {
			this.numeroConselho = numeroConselho;
		}
		public int getCargaHoraria() {
			return cargaHoraria;
		}
		public void setCargaHoraria(int cargaHoraria) {
			this.cargaHoraria = cargaHoraria;
		}

 }
