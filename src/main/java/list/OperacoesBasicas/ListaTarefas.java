package main.java.list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> listTarefas;

    public ListaTarefas() {
        this.listTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
       List<Tarefa> tarefaToRemove = new ArrayList<Tarefa>();
       for(Tarefa t : listTarefas) {
           if(t.getDescricao().equalsIgnoreCase(descricao)) {
               tarefaToRemove.add(t);
           }
       }
       listTarefas.removeAll(tarefaToRemove);
    }

    public int obterNumeroTotalTarefas() {
        return listTarefas.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(listTarefas);
    }
}
