import java.text.NumberFormat;

public class Produto {
    private String tipo;
    private String nome;
    private String tamanho;
    private double preco;

    public Produto(String tipo, String nome, String tamanho) {
        setTipo(tipo);
        setNome(nome);
        setTamanho(tamanho);
        setPreco();
    }

//    -------------------------

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

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
            } else if (getTipo().equals("salada")) {
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

    public void alterarNome(String nome) {
        setNome(nome);
    }

    public String toString() {
        return (getTipo() + "\t\t" + getNome() + "\t\t" + getTamanho() + "\t\t" + NumberFormat.getCurrencyInstance().format(getPreco()));
    }
}
