package main.java.list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        if(!numeros.isEmpty()) {
            int somaTotal = 0;
            for(Integer numero : numeros){
                somaTotal+= numero;
            }
            return somaTotal;
        } else {
            throw new RuntimeException("Não há numeros na lista");
        }
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "numeros=" + numeros +
                '}';
    }

    public void exibirNumeros() {
        if(!numeros.isEmpty()) {
            System.out.println(numeros);
        } else {
            System.out.println("Lista vazia");
        }
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeros.isEmpty()){
            for(int numero : numeros) {
                if(maiorNumero < numero){
                    maiorNumero = numero;
                }
            }
            return maiorNumero;

        }else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for(int numero : numeros) {
                if(menorNumero > numero){
                    menorNumero = numero;
                }
            }
            return menorNumero;

        }else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.exibirNumeros();


        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(1);

        System.out.println("Maior numero é " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor numero é " + somaNumeros.encontrarMenorNumero());
        System.out.println("Soma dos numeros é "+ somaNumeros.calcularSoma());
        somaNumeros.exibirNumeros();
    }
}
