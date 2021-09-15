import java.text.NumberFormat;

public class Combo {
    private String nome;
    private Produto[] produtos;
    private double preco;
    private int elementos;

    public Combo(String texto) {
        double price = 0;
        Produto[] produtos = new Produto[0];
        if (texto.equals("familia")) {
            this.setNome("Combo " + texto);
            elementos = 16;
            Produto[] aux = new Produto[16];
            aux[0] = new Produto("sanduiche", "BigMac", "grande");
            aux[1] = new Produto("acompanhamento", "batata", "grande");
            aux[2] = new Produto("acompanhamento", "salada", "grande");
            aux[3] = new Produto("bebida", "Coca", "grande");
            aux[4] = new Produto("sanduiche", "BigMac", "grande");
            aux[5] = new Produto("acompanhamento", "batata", "grande");
            aux[6] = new Produto("acompanhamento", "salada", "grande");
            aux[7] = new Produto("bebida", "Coca", "grande");
            aux[8] = new Produto("sanduiche", "McCheedar", "médio");
            aux[9] = new Produto("acompanhamento", "batata", "médio");
            aux[10] = new Produto("acompanhamento", "salada", "médio");
            aux[11] = new Produto("bebida", "Sprite", "médio");
            aux[12] = new Produto("sanduiche", "McCheedar", "médio");
            aux[13] = new Produto("acompanhamento", "batata", "médio");
            aux[14] = new Produto("acompanhamento", "salada", "médio");
            aux[15] = new Produto("bebida", "Sprite", "médio");
        for (int i = 0; i < 16; i++) {
            price += aux[i].getPreco();
            this.produtos = aux;
        }
    } else

    {
        this.setNome("Combo " + texto);
        elementos = 4;
        Produto[] aux = new Produto[4];
        aux[0] = new Produto("sanduiche", "BigMac", "único");
        aux[1] = new Produto("acompanhamento", "batata", texto);
        aux[2] = new Produto("acompanhamento", "salada", texto);
        aux[3] = new Produto("bebida", "Coca", texto);
        for (int i = 0; i < 4; i++) {
            price += aux[i].getPreco();
            this.produtos = aux;
        }
    }
        this.

    setPreco(price *0.95);

}


//    -------------------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

//    ----------------------------

    public String toString() {
        String toString = "";
        for (int i = 0; i < elementos; i++) {
            toString += produtos[i].toString() + "\n";
        }
        return toString;
    }
}

