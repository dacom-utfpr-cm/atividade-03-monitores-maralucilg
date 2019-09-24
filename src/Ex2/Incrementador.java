package Ex2;

public class Incrementador extends Thread {
	
	Contador monitor;
	
	public Incrementador(Contador monitor ) {
		this.monitor = monitor;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(10000);
				monitor.increment();
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("Destroyers");
			}
			
		}
		
	}

}
