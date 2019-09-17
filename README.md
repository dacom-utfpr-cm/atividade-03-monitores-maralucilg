# atividade-03-monitores-maralucilg



1. Implemente uma solução com monitor para o problema do Produtor-Consumidor usando um buffer circular.  

2. Escreva uma monitor Counter que possibilita um processo dormir até o contador alcançar um valor. A classe Counter permite duas operações: increment() e sleepUntil(int x).  

3. Escreva um monitor BoundedCounter que possui um valor mı́nimo e máximo. A classe possui dois métodos: increment() e decrement(). Ao alcançar os limites mı́nimo ou máximo, a thread que alcançou deve ser bloqueada.  

4. Implemente uma solução para o problema do Barbeiro Dorminhoco usando monitores. Descrição: Considere uma barbearia com um barbeiro, uma cadeira de barbeiro e n cadeiras para eventuais clientes esperarem a vez. Quando não há clientes, o barbeiro senta-se na cadeira de barbeiro e cai no sono. Quando chega um cliente, ele precisa acordar o barbeiro. Se outros clientes chegarem enquanto o barbeiro estiver cortando o cabelo de um cliente, eles se sentarão (se houver cadeiras vazias) ou sairão da barbearia (se todas as cadeiras estiverem ocupadas).  
