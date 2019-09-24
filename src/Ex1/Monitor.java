package Ex1;

public class Monitor {
	
	Sentinela buffer;
	
	public Monitor(int tam) {
		
		buffer = new Sentinela(tam);
	}
	
	// se está cheio espera se está vazio insere e notifica todo mundo
	public synchronized void inserir(int elemento) {
		while(buffer.cheio()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("Destroyers");
			}
		}
		
		buffer.inserir(elemento);
		notifyAll();
		
	}
// se está vazio espera, senão consome
	public synchronized int remover() {
		while(buffer.vazio()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("Destroyers");
			}
		}
		// invertido
		notifyAll();
		return buffer.remover();
		
	}



}
