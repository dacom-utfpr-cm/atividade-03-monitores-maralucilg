package Ex3;

/*
Escreva um monitor BoundedCounter que possui um valor mı́nimo e máximo. 
A classe possui dois métodos: increment() e decrement(). 
Ao alcançar os limites mı́nimo ou máximo, a thread que alcançou deve ser bloqueada.  

* @maralucilg
*/

public class Ex3Main {

	public static void main(String[] args) {
		
		new Thread() {
		Monitor monitor = new Monitor(0, 3, 1);
		
		public void run( ) {
			
			while (true) {
				monitor.incrementar();
				System.out.println(">>" + monitor.getCount());
			}
		}
		
		}.start();
	}

}
