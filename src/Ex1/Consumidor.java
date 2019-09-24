package Ex1;

public class Consumidor extends Thread {
	
	Monitor monitor;

	public Consumidor(Monitor m) {
		this.monitor = m;
	}

	@Override
	public void run() {
		while(true) {
			System.out.println(monitor.remover());
		}
	}

}
