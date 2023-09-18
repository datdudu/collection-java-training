package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome,preco,quantidade);
        carrinhoDeCompras.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        if(!carrinhoDeCompras.isEmpty()) {
            for (Item item : carrinhoDeCompras) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(item);
                }
            }

            carrinhoDeCompras.removeAll(itensParaRemover);
        } else {
            System.out.println("Carrinho de compras sem itens para remover");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;

        if(!carrinhoDeCompras.isEmpty()) {
            for (Item item : carrinhoDeCompras) {
                valorTotal += item.getPrice() * item.getQuantidade();
            }

            return valorTotal;
        } else {
            throw new RuntimeException("Lista Vazia");
        }
    }

    public void exibitItens() {
        System.out.println(carrinhoDeCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras compras = new CarrinhoDeCompras();

        compras.adicionarItem("Carro", 10d, 4);
        compras.adicionarItem("Mouse", 20d, 10);

        System.out.println("Valor total dos itens é " + compras.calcularValorTotal());

        compras.exibitItens();

        compras.removerItem("Carro");
        System.out.println("Valor total dos itens é " + compras.calcularValorTotal());

        compras.exibitItens();
    }
}
