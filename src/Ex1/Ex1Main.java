package Ex1;

/*
 * 1. Implemente uma solução com monitor para o problema do Produtor-Consumidor
usando um buffer circular.  
*
 * @maralucilg
 */

public class Ex1Main {

	public static void main(String[] args) {
		
		Monitor monitor = new Monitor(3);
		new Produtor(monitor).start();
		new Consumidor(monitor).start();

	}

}
