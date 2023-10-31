package entidade;

import java.util.ArrayList;
import java.util.List;

public class Camara {

    private String nomeVereador;
    private String nomePartido;
    private int quantidadeDeProjetosApresentados;
    private int quantidadeDeProjetosAprovados;
    private double indiceDeTrabalho;

    public static List<Camara> listaVereadores = new ArrayList<>();

    public Camara(String nomeVereador, String nomePartido, int quantidadeDeProjetosApresentados, int quantidadeDeProjetosAprovados, double indiceDeTrabalho) {
        setNomeVereador(nomeVereador);
        setNomePartido(nomePartido);
        setQuantidadeDeProjetosApresentados(quantidadeDeProjetosApresentados);
        setQuantidadeDeProjetosAprovados(quantidadeDeProjetosAprovados);
        setIndiceDeTrabalho(indiceDeTrabalho);
        listaVereadores.add(this);
    }

    public String getNomeVereador() {
        return nomeVereador;
    }

    public void setNomeVereador(String nomeVereador) {
        if (nomeVereador.isBlank() || nomeVereador.isEmpty()) {
            System.out.println("Erro! Nome inválido!");
        } else {
            this.nomeVereador = nomeVereador;
        }
    }

    public String getNomePartido() {
        return nomePartido;
    }

    public void setNomePartido(String nomePartido) {
        if (nomePartido.isEmpty() || nomePartido.isBlank()) {
            System.out.println("Erro! Nome do partido inválido");
        } else {
            this.nomePartido = nomePartido;
        }
    }

    public int getQuantidadeDeProjetosApresentados() {
        return quantidadeDeProjetosApresentados;
    }

    public void setQuantidadeDeProjetosApresentados(int quantidadeDeProjetosApresentados) {
        this.quantidadeDeProjetosApresentados = quantidadeDeProjetosApresentados;
    }

    public int getQuantidadeDeProjetosAprovados() {
        return quantidadeDeProjetosAprovados;
    }

    public void setQuantidadeDeProjetosAprovados(int quantidadeDeProjetosAprovados) {
        this.quantidadeDeProjetosAprovados = quantidadeDeProjetosAprovados;
    }

    public double getIndiceDeTrabalho() {
        return indiceDeTrabalho;
    }

    public void setIndiceDeTrabalho(double indiceDeTrabalho) {
        this.indiceDeTrabalho = indiceDeTrabalho;
    }

    @Override
    public String toString() {
        return "Nome do Vereador: " + nomeVereador + "\nNome do Partido: " + nomePartido
                + "\nQuantidade de Projetos Apresentados: " + quantidadeDeProjetosApresentados
                + "\nQuantidade de Projetos Aprovados: " + quantidadeDeProjetosAprovados;
    }

    public double calcularDesempenho() {
        return (double) quantidadeDeProjetosAprovados / quantidadeDeProjetosApresentados * indiceDeTrabalho;
    }
}