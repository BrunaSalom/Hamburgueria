import java.util.ArrayList;
import java.util.Scanner;

public class Pedidos {

    public static void main(String[] args) {
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
                System.out.print("Nome do produto: ");
                nome = scan.next();
                if (nome.equals("batata") || nome.equals("salada")) {
                    System.out.print("Tamanho do produto: ");
                    tamanho = scan.next();

                    carrinho1.addProduto(tipo, nome, tamanho);
                    System.out.println(carrinho1);
                } else {
                    carrinho1.addProduto(tipo, nome, "único");
                    System.out.println(carrinho1);
                }

                System.out.print("Continuar comprando? ");
                continuarComprando = scan.next();

            } else if (aux.equals("Combo")) {
                System.out.print("Tamanho do produto: ");
                tamanho = scan.next();

                carrinho1.addCombo(tamanho);
                System.out.println(carrinho1);
                System.out.print("Continuar comprando? ");
                continuarComprando = scan.next();
            } else {
                System.out.print("Código indisponível. Continuar comprando? ");
                continuarComprando = scan.next();
            }
        }
        while (continuarComprando.equals("sim"));
    }
}
