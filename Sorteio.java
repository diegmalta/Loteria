import java.util.Random;
public class Sorteio {
	public static int qtdeSorteados;
	private Random random;
	public Sorteio() {
		random = new Random();
	}
	public int proxNumero() {
		Sorteio.qtdeSorteados++;
		return random.nextInt(201);
	}
}
