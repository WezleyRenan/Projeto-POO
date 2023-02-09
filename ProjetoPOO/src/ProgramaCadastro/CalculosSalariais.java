package ProgramaCadastro;

public abstract class CalculosSalariais {
	public static double getCalculosSalariais(double s) {
		if (2000>s) {
			s=s*0.85;
		}
		if (2000<=s) {
			s=s*0.73;
		}
		return s;
		
	}
 }
       