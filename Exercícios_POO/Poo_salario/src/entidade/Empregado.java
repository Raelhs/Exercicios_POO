package entidade;

import java.util.ArrayList;
import java.util.List;

public class Empregado {

    private String identificacaoEmpregado;
    private String nomeEmpregado;
    private String sobrenomeEmpregado;
    private double salarioEmpregado;

    public static List<Empregado> listaEmpregados = new ArrayList<>();

    public Empregado(String indentificacaoEmpregado, String nomeEmpregado, String sobrenomeEmpregado, double salarioEmpregado) {
        setIndentificacaoEmpregado(indentificacaoEmpregado);
        setNomeEmpregado(nomeEmpregado);
        setSobrenomeEmpregado(sobrenomeEmpregado);
        setSalarioEmpregado(salarioEmpregado);
        listaEmpregados.add(this);
    }

    public String getIndentificacaoEmpregado() {
        return identificacaoEmpregado;
    }

    public void setIndentificacaoEmpregado(String indentificacaoEmpregado) {
        if (indentificacaoEmpregado.isEmpty()) {
            System.out.println("ERRO! identificação do empregado incorreta");
        } else {

            this.identificacaoEmpregado = indentificacaoEmpregado;
        }
    }

    public String getNomeEmpregado() {
        return nomeEmpregado;
    }

    public void setNomeEmpregado(String nomeEmpregado) {
        if (nomeEmpregado.isBlank() || nomeEmpregado.isEmpty()) {
            System.out.println("ERRO! nome do empregado inválido");
        } else {

            this.nomeEmpregado = nomeEmpregado;
        }
    }

    public String getSobrenomeEmpregado() {
        return sobrenomeEmpregado;
    }

    public void setSobrenomeEmpregado(String sobrenomeEmpregado) {
        if (sobrenomeEmpregado.isEmpty() || sobrenomeEmpregado.isBlank()) {
            System.out.println("ERRO! sobrenome do empregado inválido");
        } else {

            this.sobrenomeEmpregado = sobrenomeEmpregado;
        }
    }

    public double getSalarioEmpregado() {
        return salarioEmpregado;
    }

    public void setSalarioEmpregado(double salarioEmpregado) {
        if (salarioEmpregado == 0) {
            System.out.println("Não empregado!");
        } else if (salarioEmpregado < 0) {
            System.out.println("ERRO! salário inválido");
        } else {
            this.salarioEmpregado = salarioEmpregado;
        }
    }

    public double calcularSalarioAnual(){

        return this.getSalarioEmpregado() * 12;
    }

    public String pegarNomeEmpregado(){

        return this.getNomeEmpregado();
    }

        public  double modificarSalario(double percentualAumento) {
            return this.getSalarioEmpregado() * percentualAumento;
        }

    @Override
    public String toString() {
        return "\nidentificacaoEmpregado = " + identificacaoEmpregado +
                "\nnomeEmpregado= " + nomeEmpregado +
                "\nsobrenomeEmpregado = " + sobrenomeEmpregado +
                "\nsalarioEmpregado=" + salarioEmpregado
                ;
    }
}
