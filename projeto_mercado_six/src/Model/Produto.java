package Model;

import Util.Utils;

public class Produto {

    private static int contador = 1; // Cria um contador para modificar a variavel ID.
    private int id;  // cria id do produto.
    private String nome; // Cria a variavel nome do produto.
    private Double preco; // Cria a variavel preco do produto.

    // CRIA UM CONSTRUTOR DO OBJETO
    public Produto(String nome, Double preco) {
        this.id = contador; // Contador soma mais 1 a variavel
        this.nome = nome;
        this.preco = preco;
        Produto.contador += 1; // Produto modifica a variavel contador para receber o proximo produto.
    }




    // CRIA OS GETTERS AND SETTERS
    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


   public String toString(){
        return "Id: "+ this.getId() +
                "\n Nome: " + this.getNome() +
                "\n Preço: " + Utils.doubleToString(this.getPreco());


   }

}
