public class Main {
    public static void main(String[] args) {
        
        ListaDuplamenteEncadeada listaTarefas = new ListaDuplamenteEncadeada();
        
        listaTarefas.inserirFinal(new NoDuplo("Assistir tv"));
        listaTarefas.inserirFinal(new NoDuplo("Fazer compras"));
        listaTarefas.inserirFinal(new NoDuplo("Estudar"));
        listaTarefas.inserirFinal(new NoDuplo("Fazer pagamentos"));
        
        System.out.println("----Lista de tarefas-----");
        
       System.out.println(listaTarefas.exibirLista());
       
       System.out.println("-------------------------------------------------------------");
       
       System.out.println("----Buscando valor específico na lista-----");
       System.out.println("Tarefa: "+listaTarefas.obterElementoPorPosicao(2).valor);
       
       System.out.println("-------------------------------------------------------------");
       
       System.out.println("----Lista inversa-----");
       
       System.out.println(listaTarefas.exibirListaInversa());
    }
}