import java.text.NumberFormat;

public class Carrinho {

    private Combo[] combos;
    private Produto[] produtos;
    private int itensCombo;
    private int itensProduto;
    private int capacidadeC;
    private int capacidadeP;
    private double preco;

    public Carrinho() {
        capacidadeC = 5;
        capacidadeP = 5;
        combos = new Combo[capacidadeC];
        produtos = new Produto[capacidadeP];
        itensCombo = 0;
        itensProduto = 0;
        preco = 0.0;
    }

//    --------------------------------
//    getter:

    public Combo[] getCombos() {
        return combos;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public double getPreco() {
        return preco;
    }

    //    -----------------------------
//    Aumentar tamanho das Strings em 3:
    private void aumentarProduto(){
        Produto[] aux = new Produto[capacidadeP+3];
        for(int i=0;i<capacidadeP;i++){
            aux[i] = produtos[i];
        }
        produtos = aux;
        aux = null;
        capacidadeP +=3;
    }
    private void aumentarCombo(){
        Combo[] aux = new Combo[capacidadeC+3];
        for(int i=0;i<capacidadeC;i++){
            aux[i] = combos[i];
        }
        combos = aux;
        aux = null;
        capacidadeC +=3;
    }

//    ----------------------------
//    Add novos produtos e combos:
    public void addProduto(String tipo, String nome, String tamanho) {
        Produto aux = new Produto(tipo, nome, tamanho);
        produtos[itensProduto] = aux;
        this.preco += produtos[itensProduto].getPreco();
        itensProduto += 1;
        if (itensProduto == capacidadeP) {
            aumentarProduto();
        }
    }
    public void addCombo(String tamanho) {
        Combo aux = new Combo(tamanho);
        combos[itensCombo] = aux;
        this.preco += combos[itensCombo].getPreco();
        itensCombo += 1;
        if (itensCombo == capacidadeC) {
            aumentarCombo();
        }
    }

//    ------------------------------------
//    Imprimir:
    public String toString(){
        String contents = "\nCarrinho de Compras\n";
        contents += "\t\tTipo \t\t\tNome\t\tTamanho\tPreço\n";

        for (int i=0;i<itensProduto;i++){
            contents += produtos[i].toString() + "\n";
        }
        contents += "\n";
        for (int i =0;i<itensCombo;i++){
            contents += combos[i].toString() + "\n";
        }

        contents += "\nPreço Total: "+ NumberFormat.getCurrencyInstance().format(preco);
        contents += "\n";

        return contents;
    }
}