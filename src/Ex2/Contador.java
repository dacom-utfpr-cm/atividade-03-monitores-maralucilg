package Ex2;

import java.util.concurrent.atomic.AtomicInteger;

public class Contador {
	
	AtomicInteger count = new AtomicInteger();
	
	public synchronized void increment() {

 		count.incrementAndGet();
 		notifyAll();
 	}
	
	public synchronized int sleepUntil(int time) {

 		int valor = count.intValue();
 		while(valor < time) {
 			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("Destroyers");
			}
 		}

 		notifyAll();
 		return valor;
 	}
 }


