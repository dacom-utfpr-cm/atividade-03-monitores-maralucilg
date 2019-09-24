package Ex1;

import java.util.Random;

public class Produtor extends Thread {
	
	Monitor monitor;
	Random consumir = new Random();
	
	public Produtor(Monitor m) {
		
		this.monitor = m;
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				Thread.sleep(10000);
				monitor.inserir(consumir.nextInt());
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("Destroyers");
			}
			
			
		}
		
	}

}
