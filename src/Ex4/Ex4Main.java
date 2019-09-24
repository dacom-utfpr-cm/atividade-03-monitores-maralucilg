package Ex4;

/*
 * 4 - Implemente uma solução para o problema do Barbeiro Dorminhoco usando monitores. 
 * Descrição: Considere uma barbearia com um barbeiro, uma cadeira de barbeiro e n cadeiras para eventuais
 *  clientes esperarem a vez. Quando não há clientes, o barbeiro senta-se na cadeira de barbeiro e cai no sono.
 *   Quando chega um cliente, ele precisa acordar o barbeiro. Se outros clientes chegarem enquanto o barbeiro estiver cortando o cabelo de um cliente, eles se sentarão (se houver cadeiras vazias)
 *    ou sairão da barbearia (se todas as cadeiras estiverem ocupadas).
 *  
 *  @maralucilg
 */

public class Ex4Main {

	private static final int NUM_C = 10;

	public static void main(String[] args) {
		Monitor salao_pabllovittar = new Monitor();
		new Produtor(salao_pabllovittar).start();
		
		for(int i = 0; i < NUM_C; i++) {
			
			new Consumidor(salao_pabllovittar).start();
		}

	}

}
