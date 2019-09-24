package Ex4;

import java.util.Random;

public class Monitor {
	
	int cadeiras = 3 + 1 + 1;
	int sentados = 0;
	boolean cadeira = false;
	boolean maquiagem = false;
	boolean barbeiro = true;
	
	public synchronized void  crm() {
		
		System.out.println("Cliente chegou...[Salão Pabllo Vittar]");
		
		if (cadeiras == sentados) {
			
			System.out.println("Cadeiras de espera ocupadas. Ir embora.");
			return;
		}
		
		sentados++;
		
		while(cadeira || maquiagem) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if (barbeiro) {
			
			System.out.println("Acorda!");
			barbeiro = false;
			notifyAll();
			
		}
		
	}
	
	public synchronized void atendimento() {
		
		while(sentados == 0) {
			
			System.out.println("Zzzz");
			barbeiro = true;
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		sentados--;
		cadeira = true;
		maquiagem = true;
		
		try {
			Thread.sleep(new Random().nextInt(3000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Cortou ou maquiou <o>");
		cadeira = false;
		notifyAll();
	}

}
