package Ex1;

public class Sentinela {
	
	private int[] buffer;
	boolean vazio = true;
	boolean cheio = false;
	int pos = 0;
	int qtd = 0;

	public Sentinela(int tam) {
		buffer = new int[tam];
	}
	

	public boolean cheio() {

		return cheio;
	}

	public boolean vazio() {

		return vazio;
	}
	
	public void inserir(int elemento) {
		
		if(cheio) {
			
			System.out.println("Buffer cheio, não pode inserir");
		}
		
		vazio = false;
		buffer[pos] = elemento;
		
		pos = (pos+1)%buffer.length;
		if(pos==qtd) {
			cheio = true;
		}
		
	}
	
	public int remover() {
		
		if(vazio) {
			System.out.println("Buffer vazio, não pode consumir");
		}
		cheio = false;
		int removido = buffer[qtd];
		
		qtd = (qtd+1)%buffer.length;
		if(pos==qtd) {
			vazio = true;
		}
		return removido;
		
		
	}


}
