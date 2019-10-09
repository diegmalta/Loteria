
public class Principal {
	public static void main(String[] args) {
		Loteria megasena = new Loteria(1,60,6);
		Loteria quina = new Loteria(1,80,5);
		Loteria lotofacil = new Loteria(1,50,15);
		Loteria loto = new Loteria(30,70,8);
		int[] resultado = loto.proxConcurso();
	}
}
