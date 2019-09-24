package Ex3;

public class Monitor {
	
	int count;
	int max;
	int min;
	boolean isExecuting;
	
	public Monitor(int c, int max, int min) {
		this.count = c;
		this.max = max;
		this.min = min;
	}

	public synchronized void incrementar() {
		
		if(count < max) {
			
			count = count+1;
		}
		
		isExecuting = (count == max);
		
		while(isExecuting) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("Destroyers");
			}
		}

	}

	public synchronized void decrementar() {
		
		if(count > min) {
			
			count = count-1;
		}
		
		isExecuting = (count == min);
		
		while(isExecuting) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("Destroyers");
			}
		}
		
		
	}
	
	public synchronized int getCount() {
		return count;
	}

}
