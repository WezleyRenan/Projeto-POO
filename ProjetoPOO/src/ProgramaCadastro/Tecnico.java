package ProgramaCadastro;

public class Tecnico extends Pessoa {
	
        @Override
	public String toString() {
		return super.toString()+" especialidade=" + especialidade + ", numeroConselho=" + numeroConselho + ", cargaHoraria="
				+ cargaHoraria;
	}

		public Tecnico(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

		private String especialidade;
        private int numeroConselho;
        private int cargaHoraria;
        
		public String getEspecialidade() {
			return especialidade;
		}
		
		public void setEspecialidade(String especialidade) {
			this.especialidade = especialidade;
		}
		
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