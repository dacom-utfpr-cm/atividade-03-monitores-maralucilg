package Ex2;

public class Dormir extends Thread {
	
	Contador monitor;
	int tempo;
	
	public Dormir(Contador monitor, int tempo) {
		
		this.monitor = monitor;
		this.tempo = tempo;
	}
	
	@Override
	public void run() {
		
		int hora = monitor.sleepUntil(tempo);
		System.out.println("bom dia" + hora);
	}

}
