import java.text.NumberFormat;

public class Produto {
    private String tipo;
    private String nome;
    private String tamanho;
    private double preco;

    public Produto(String tipo, String nome, String tamanho) {
        this.tipo = tipo;
        this.nome = nome;
        this.tamanho = tamanho;
        setPreco();
    }

//    -------------------------
//    Getters:
    public String getTipo() { return tipo; }

    public String getNome() {
        return nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public double getPreco() {
        return preco;
    }

//    -------------------------
//    Setter:
    public void setPreco() {
        double precoAux = 0.0;
        if (getTipo().equals("acompanhamento")) {
            if (getNome().equals("batata")) {
                if (getTamanho().equals("grande")) {
                    precoAux = 10.0;
                } else if (getTamanho().equals("médio")) {
                    precoAux = 8.0;
                } else if (getTamanho().equals("pequeno")) {
                    precoAux = 6.0;
                } else {
                    System.out.println("Tamanho indisponível");
                }
            } else if (getNome().equals("salada")) {
                if (getTamanho().equals("grande")) {
                    precoAux = 9.0;
                } else if (getTamanho().equals("médio")) {
                    precoAux = 7.0;
                } else if (getTamanho().equals("pequeno")) {
                    precoAux = 5.0;
                } else {
                    System.out.println("Tamanho indisponível");
                }
            } else {
                precoAux = 1.0;
            }
        } else if (getTipo().equals("bebida")) {
            if (getTamanho().equals("grande")) {
                precoAux = 10.5;
            } else if (getTamanho().equals("médio")) {
                precoAux = 8.5;
            } else if (getTamanho().equals("pequeno")) {
                precoAux = 6.5;
            } else {
                System.out.println("Tamanho indisponível");
            }
        } else if (getTipo().equals("sanduiche")) {
            precoAux = 7.3;
        } else {
            System.out.println("Produto indisponível");
        }
        this.preco = precoAux;
    }

//    ------------------------------
//    Como vai imprimir:
    public String toString() {
//        return (getTipo() + "\t\t" + getNome() + "\t\t" + getTamanho() + "\t\t" + NumberFormat.getCurrencyInstance().format(getPreco()));
        return String.format("%15s %15s %10s \tR$ %.2f", getTipo(), getNome(), getTamanho(), getPreco());
    }
}
