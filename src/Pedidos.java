import java.util.ArrayList;
import java.util.Scanner;

public class Pedidos {

    public static void main(String[] args) {

//        Opções de compra:
//        Produto:
//          acompanhamento:
//            batata ou salada - tamanhos pequeno, médio ou grande
//            nome____
//          bebida:
//            nome____ - tamanhos pequeno, médio ou grande
//        Combo:
//          tamanhos pequeno, médio, grande ou família


        ArrayList<Combo> combo = new ArrayList<Combo>();
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        String tipo;
        String nome;
        String tamanho;

        Scanner scan = new Scanner(System.in);

        String continuarComprando = "sim";
        Carrinho carrinho1 = new Carrinho();

        do {
            System.out.print("O que gostaria de adicionar? ");
            String aux = scan.next();

            if (aux.equals("Produto")) {
                System.out.print("Tipo do produto: ");
                tipo = scan.next();
                if (tipo.equals("acompanhamento")) {
                    System.out.print("Nome do produto: ");
                    nome = scan.next();
                    if (nome.equals("batata") || nome.equals("salada")) {
                        System.out.print("Tamanho do produto: ");
                        tamanho = scan.next();

                        carrinho1.addProduto(tipo, nome, tamanho);
                        System.out.println(carrinho1);
                        System.out.print("Continuar comprando? ");
                        continuarComprando = scan.next();

                    } else {
                        carrinho1.addProduto(tipo, nome, "único");
                        System.out.println(carrinho1);
                        System.out.print("Continuar comprando? ");
                        continuarComprando = scan.next();
                    }
                } else if (tipo.equals("bebida")) {
                    System.out.print("Nome do produto: ");
                    nome = scan.next();
                    System.out.print("Tamanho do produto: ");
                    tamanho = scan.next();
                    if (tamanho.equals("grande") || tamanho.equals("médio") || tamanho.equals("pequeno")) {
                        carrinho1.addProduto(tipo, nome, tamanho);
                        System.out.println(carrinho1);
                        System.out.print("Continuar comprando? ");
                        continuarComprando = scan.next();
                    } else {
                        System.out.print("Código indisponível. Continuar comprando? ");
                        continuarComprando = scan.next();
                    }
                } else {
                    System.out.print("Código indisponível. Continuar comprando? ");
                    continuarComprando = scan.next();
                }

            } else if (aux.equals("Combo")) {
                System.out.print("Tamanho do produto: ");
                tamanho = scan.next();
                if (tamanho.equals("grande") || tamanho.equals("médio") || tamanho.equals("pequeno") || tamanho.equals("família")) {
                    carrinho1.addCombo(tamanho);
                    System.out.println(carrinho1);
                    System.out.print("Continuar comprando? ");
                    continuarComprando = scan.next();
                } else {
                    System.out.print("Código indisponível. Continuar comprando? ");
                    continuarComprando = scan.next();
                }
            } else {
                System.out.print("Código indisponível. Continuar comprando? ");
                continuarComprando = scan.next();
            }
        }
        while (continuarComprando.equals("sim"));
    }
}
