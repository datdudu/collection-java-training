package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        dicionario.remove(palavra);
    }

    public void exibitPalavras(){
        System.out.println(dicionario);
    }

    public String pesquisarPorPalavra(String palavra) {
        if(!dicionario.isEmpty()){
            return dicionario.get(palavra);
        } else {
            return "Não há essa palavra";
        }
    }

    public static void main(String[] args) {
        Dicionario dicionarioTest = new Dicionario();

        dicionarioTest.adicionarPalavra("Mouse", "Acessorio Computador");

        dicionarioTest.adicionarPalavra("Celular", "Aparelho para falar com pessoas");

        dicionarioTest.adicionarPalavra("Teclado", "Input de informações no computador");

        dicionarioTest.exibitPalavras();

        dicionarioTest.removerPalavra("Mouse");

        System.out.println(dicionarioTest.pesquisarPorPalavra("Teclado"));
    }
}
