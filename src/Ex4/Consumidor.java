package Ex4;

// Clientes
public class Consumidor extends Thread {
	
	Monitor monitor;
	
	public Consumidor(Monitor m) {
		this.monitor = m;
	}
	
	@Override
	public void run() {
		
		monitor.crm();
	}

}
