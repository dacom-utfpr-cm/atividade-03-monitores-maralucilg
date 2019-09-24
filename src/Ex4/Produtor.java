package Ex4;

// Barbeiro
public class Produtor extends Thread {
	
	Monitor monitor;
	
	public Produtor(Monitor m) {
		
		this.monitor = m;
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			monitor.atendimento();
		}
		
	}

}
