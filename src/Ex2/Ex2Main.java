package Ex2;
/*
 * 2. Escreva uma monitor Counter que possibilita um processo 
 dormir até o contador alcançar um valor. 
 A classe Counter permite duas operações: increment() e sleepUntil(int x).
*
* @maralucilg
 */

public class Ex2Main {

	public static void main(String[] args) {
		
		Contador monitor = new Contador();
		new Incrementador(monitor).start();
		new Dormir(monitor, 100).start();

	}

}
