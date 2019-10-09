
public class Loteria {
	int min, max, qsrtd, sorteado;
	int[] resultado;
	Sorteio sorteio;
	public Loteria(int min,int max,int qsrtd) {
		this.min=min;
		this.max=max;
		this.qsrtd=qsrtd;
		resultado = new int[qsrtd];
		sorteio = new Sorteio();
		}
	public int[] proxConcurso() {
		for(int i=0;i<qsrtd;i++) {
			while(true) {
				sorteado = sorteio.proxNumero();
				System.out.println(sorteado);
				try {
					if(sorteado<min||sorteado>max) {
						throw new RuntimeException("fora do intervalo");
					}
					for(int j=0;j<qsrtd;j++) {
					if(sorteado==resultado[j])
					throw new RuntimeException("ja tem esse");
					}
					break;
				}
				catch(RuntimeException e) {}
				resultado[i]=sorteado;
			}
		}
		return resultado;
	}
}
