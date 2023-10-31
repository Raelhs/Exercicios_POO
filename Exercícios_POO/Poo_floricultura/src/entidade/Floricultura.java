package entidade;

import java.util.ArrayList;
import java.util.List;

public class Floricultura {
    private String nomeFlor;
    private double precoFlor;
    private String nomeCliente;
    private boolean presenteOuNao;

    public static List<Floricultura> listaFlores = new ArrayList<>();


    public Floricultura(String nomeFlor, double precoFlor, String nomeCliente, boolean presenteOuNao) {
        setNomeFlor(nomeFlor);
        setPrecoFlor(precoFlor);
        setNomeCliente(nomeCliente);
        setPresenteOuNao(presenteOuNao);
        listaFlores.add(this);

    }

    public String getNomeFlor() {
        return nomeFlor;
    }

    public void setNomeFlor(String nomeFlor) {
        if (nomeFlor.isEmpty() || nomeFlor.isBlank()) {
            System.out.println("ERRO! nome da flor inválido");
        } else {
            this.nomeFlor = nomeFlor;
        }
    }

    public double getPrecoFlor() {
        return precoFlor;
    }

    public void setPrecoFlor(double precoFlor) {
        if (precoFlor <= 0) {
            System.out.println("ERRO! preço da flor inválido");
        } else {

            this.precoFlor = precoFlor;
        }
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente.isBlank() || nomeCliente.isEmpty()) {
            System.out.println("ERRO! nome do cliente inválido");
        } else {


            this.nomeCliente = nomeCliente;
        }
    }

    public boolean isPresenteOuNao() {
        return presenteOuNao;
    }

    public void setPresenteOuNao(boolean presenteOuNao) {

        this.presenteOuNao = presenteOuNao;
    }
}










