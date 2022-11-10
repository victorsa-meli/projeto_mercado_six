package Main;

import Model.Produto;
import Util.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mercado {

    //private static Scanner read = new Scanner(System.in); // cria um input (leitor)
    private static Scanner input = new Scanner(System.in);

    // Cria uma lista de produtos.
    private static ArrayList<Produto> produtos;

    // Cria o carrinho com 2 parametros produtos e quantidade.
    private static Map<Produto, Integer> carrinho;

    public static void main(String[] args) {
        produtos = new ArrayList<>();
        carrinho = new HashMap<>();
        menu();
    }

    // CRIA INTERFACE MENU

        public static void menu () {

        System.out.println("___________________________________________________");
        System.out.println("           BEM VINDO AO MERCADO SIX                ");
        System.out.println("                                                   ");
        System.out.println("                                                   ");
        System.out.println("     SELECIONE UMA OP QUE DESEJA REALIZAR          ");
        System.out.println("                                                   ");
        System.out.println("      1 - CADASTRAR                                         ");
        System.out.println("      2 - LISTAR                                                    ");
        System.out.println("      5 - EXCLUIR                                   ");
        System.out.println("      6 - ALTERAR                                  ");
        System.out.println("      7 - SAIR                                      ");
        System.out.println("___________________________________________________");

        int option = input.nextInt();

        switch (option) {
            case 1:
                cadastrarProdutos();
                break;
            case 2:
                listarProdutos();
                break;
            case 3:
                comprarProdutos();
                break;
            case 4:
                verCarrinho();
                break;
            case 5:
                excluirProdutos();
                break;
            case 6:
                alterarProdutos();
                break;
            case 7:
                System.out.println(" Obrigado pela preferencia !! ");
                System.exit(0);
            default:
                System.out.println("Opção invalida ! ");
                menu();
                break;
        }
    }


        public static void cadastrarProdutos () {

        System.out.println("Nome do produto: ");
        String nome = input.next();


        System.out.println("Preço do produto: ");
        double preco = input.nextDouble();


        Produto produto = new Produto(nome, preco);
        produtos.add(produto);

        System.out.println(produto.getNome() + "Foi cadastrado com sucesso !");
        menu();


    }

        private static void listarProdutos () {
        if (produtos.size() > 0) {
            System.out.println("Lista de produtos \n");

            for (Produto p : produtos) {

                System.out.println(p);
            }
        } else {
            System.out.println(" Nenhum produto cadastrado!");
        }
        menu();
    }


        private static void comprarProdutos () {

        System.out.println("Funcao descontinuada.");
    }
      /*  if (produtos.size() > 0) {
            System.out.println("Codigo do produto: \n");

            System.out.println("          PRODUTOS DISPONIVEIS              ");
            for (Produto p : produtos) {

                System.out.println(p + "\n");
            }

            int id = Integer.parseInt(input.next());
            boolean isPresent = false;


            for (Produto p : produtos) {
                if (p.getId() == id) {
                    int qtd = 0;
                    try {
                        qtd = carrinho.get(p);
                        // checa se o produto ja esta no carrinho, incrementa a quantidade.
                        carrinho.put(p, qtd + 1);
                    } catch (NullPointerException e) {

                        // se o produto for o primeiro no carrinho
                        carrinho.put(p, 1);
                    }
                    // informa ao usuario que o produto no carrinho foi adicionado.
                    System.out.println(p.getNome() + " Adicionado ao carrinho.");
                    isPresent = true;
                    // pergunta o usuario se deseja adicionar mais produtos ou quer finalizar a compra.
                    if (isPresent) {
                        System.out.println(" Deseja adicionar outro produto ao carrinho ? ");
                        System.out.println(" Digite 1 para sim ou 0 para finalizar a compra.\n");
                        int option = Integer.parseInt(input.next());
                        if (option == 1) {
                            comprarProdutos();

                        } else {
                            finalizarCompra();
                        }
                    }


                } else {
                    System.out.println("Produto nao encontrado.");
                    menu();

                }


            }

        } else {
            System.out.println("Produto nao cadastrado!");
            menu();

        }


    }*/

        // cria um metodo para visualizar produtos no carrinho
        private static void verCarrinho () {

        System.out.println("Funcao Descontinuada");
        menu();
        /*


        System.out.println("          -----------  Produtos no seu carrinho -----------              ");




        if (carrinho.size() > 0) {

            for (Produto p : carrinho.keySet()) {
                System.out.println("Produto: " + p + " \n Quantidade: " + carrinho.get(p));
            }
        } else {
            System.out.println("Carrinho vazio");
        }

        menu();

*/
    }


        private static void excluirProdutos () {

        if (produtos.size() > 0) {
            System.out.println("Codigo do produto: \n");

            System.out.println("          PRODUTOS DISPONIVEIS              ");
            for (Produto p : produtos) {

                System.out.println(p + "\n");
            }


            int id = Integer.parseInt(input.next());
            boolean isPresent = false;


            for (Produto p : produtos) {
                if (p.getId() == id) {
                    produtos.remove(p);
                }
                // informa ao usuário que o produto no carrinho foi adicionado.
                System.out.println(p.getNome() + " Removido.");
                menu();
            }


        } else {
            System.out.println("Produto nao encontrado.");
            menu();

        }

    }

        private static void alterarProdutos () {

        System.out.println("Funcao em desenvolvimento");
        menu();
    }

        private static void finalizarCompra () {



       /*double valorDaCompra = 0.0;


       System.out.println("Seus produtos!");


        for (Produto p : carrinho.keySet()) {

            int qtd = carrinho.get(p);
            valorDaCompra += p.getPreco() * qtd;
            System.out.println(p);
            System.out.println("Quantidade: " + qtd);
            System.out.println("\n");


            System.out.println("O valor da sua compra e: " + Utils.doubleToString(valorDaCompra));
            carrinho.clear();
            System.out.println("Obrigado pela preferencia!!");
            menu();


        }
        */


    }

    }

