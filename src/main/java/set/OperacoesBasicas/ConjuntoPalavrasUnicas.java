package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if(!palavrasSet.isEmpty()){
            if(palavrasSet.contains(palavra)){
                palavrasSet.remove(palavra);
            } else {
                System.out.println(palavra + " não está no conjunto");
            }
        } else {
            System.out.println("Lista de palavras vazia");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasSet);
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavrasSet=" + palavrasSet +
                '}';
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasConjunto = new ConjuntoPalavrasUnicas();

        palavrasConjunto.adicionarPalavra("cachorro");
        palavrasConjunto.adicionarPalavra("gato");
        palavrasConjunto.adicionarPalavra("peixe");
        palavrasConjunto.adicionarPalavra("baleia");
        palavrasConjunto.adicionarPalavra("ave");

        palavrasConjunto.exibirPalavrasUnicas();


        System.out.println("É " +  palavrasConjunto.verificarPalavra("ave") + " que a palavra ave está no conjunto");

        palavrasConjunto.removerPalavra("ave");
        palavrasConjunto.exibirPalavrasUnicas();

        System.out.println("É " +  palavrasConjunto.verificarPalavra("ave") + " que a palavra ave está no conjunto");


    }
}
