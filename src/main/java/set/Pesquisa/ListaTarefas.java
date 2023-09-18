package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);

        listaTarefas.add(tarefa);
    }

    public void removerTarefa(String descricao) {
        if(!listaTarefas.isEmpty()){
            Tarefa tarefa = new Tarefa(descricao);

            if(listaTarefas.contains(tarefa)) {
                listaTarefas.remove(tarefa);
            } else {
                System.out.println("A lista não contém esta tarefa");
            }
        }else {
            System.out.println("Lista de Tarefas está vazia");
        }
    }

    public void exibirTarefas() {
        if(!listaTarefas.isEmpty()){
            for (Tarefa t : listaTarefas) {
                System.out.println(t);
            }
        }else {
            System.out.println("A lista está vazia");
        }
    }

    public int contarTarefas() {
        return listaTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {

        if(!listaTarefas.isEmpty()) {
            Set<Tarefa> tarefasConcluidas = new HashSet<>();

            for(Tarefa t : listaTarefas) {
                if (t.isConcluida()) {
                    tarefasConcluidas.add(t);
                }
            }

            return tarefasConcluidas;
        }else {
            throw new RuntimeException("Lista de tarefas vazia");
        }
    }

    public Set<Tarefa> obterTarefasPendentes() {

        if(!listaTarefas.isEmpty()) {
            Set<Tarefa> tarefasPendentes = new HashSet<>();

            for(Tarefa t : listaTarefas) {
                if (!t.isConcluida()) {
                    tarefasPendentes.add(t);
                }
            }

            return tarefasPendentes;
        }else {
            throw new RuntimeException("Lista de tarefas vazia");
        }
    }

    public void marcarTarefaConcluida(String descricao) {
        if(!listaTarefas.isEmpty()) {
            for(Tarefa t : listaTarefas) {
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(true);
                    break;
                }
            }
        }else {
            System.out.println("A tarefa não está presente na lista");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for(Tarefa t : listaTarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
            } else {
                System.out.println("A tarefa não está presente na lista");
            }
        }
    }

    public void limparListaTarefas() {
        if(listaTarefas.isEmpty()) {
            System.out.println("A lista já está vazia");
        }else {
            listaTarefas.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas obrigacoes = new ListaTarefas();


        obrigacoes.adicionarTarefa("Estudar");
        obrigacoes.adicionarTarefa("Trabalhar");
        obrigacoes.adicionarTarefa("Exercitar");



        obrigacoes.marcarTarefaConcluida("Estudar");
        obrigacoes.marcarTarefaConcluida("Trabalhar");

        System.out.println("Tarefas pendentes: " + obrigacoes.obterTarefasPendentes());
        System.out.println("Tarefas concluidas: " + obrigacoes.obterTarefasConcluidas());

        obrigacoes.exibirTarefas();
        obrigacoes.limparListaTarefas();

        obrigacoes.exibirTarefas();
    }
}
