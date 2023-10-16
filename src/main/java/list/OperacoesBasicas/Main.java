package main.java.list.OperacoesBasicas;
public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Lavar a louça.");
        listaTarefas.adicionarTarefa("Passear com a Malu.");
        System.out.println("Número de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();
    }
}