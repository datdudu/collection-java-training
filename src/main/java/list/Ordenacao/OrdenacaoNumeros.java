package main.java.list.Ordenacao;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class OrdenacaoNumeros {
    private List<Integer> numerosLista;

    public OrdenacaoNumeros() {
        this.numerosLista = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosLista.add(numero);
    }

    public List<Integer> ordernarAscendente() {
        List<Integer> listaAscendente = new ArrayList<>(this.numerosLista);

        if(!listaAscendente.isEmpty()) {
            Collections.sort(listaAscendente);
            return listaAscendente;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public List<Integer> ordernarDescendente() {
        List<Integer> listaDescendente = new ArrayList<>(this.numerosLista);

        if(!listaDescendente.isEmpty()) {
            listaDescendente.sort(Collections.reverseOrder());
            return listaDescendente;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "numerosLista=" + numerosLista +
                '}';
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numerosOrdernados = new OrdenacaoNumeros();

        numerosOrdernados.adicionarNumero(1);
        numerosOrdernados.adicionarNumero(5);
        numerosOrdernados.adicionarNumero(4);
        numerosOrdernados.adicionarNumero(3);
        numerosOrdernados.adicionarNumero(2);

        System.out.println(numerosOrdernados);

        System.out.println(numerosOrdernados.ordernarAscendente());

        System.out.println(numerosOrdernados.ordernarDescendente());
    }
}
