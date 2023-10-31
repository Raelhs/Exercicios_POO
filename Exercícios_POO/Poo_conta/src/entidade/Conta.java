package entidade;

import java.util.ArrayList;
import java.util.List;

public class Conta {

    private String nomeConta;
    private Double saldoConta;
    public static List<Conta> listaContas = new ArrayList<>();

    public Conta(String nomeConta, Double saldoConta) {
        this.nomeConta = nomeConta;
        this.saldoConta = saldoConta;
        listaContas.add(this);
    }


    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        if (nomeConta.isEmpty() || nomeConta.isBlank()) {
            System.out.println("Erro! nome da conta inválido");
        } else {

            this.nomeConta = nomeConta;
        }
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Double saldoConta) {
        if (saldoConta < 0) {
            System.out.println("Saldo negativo!");
        }
        if (saldoConta == 0) {
            System.out.println("Sem saldo");
        } else {


            this.saldoConta = saldoConta;
        }
    }


    public void sacarDinheiro(double valorSaque) {
        if (valorSaque <= this.getSaldoConta())
            saldoConta -= valorSaque;
        else {
            System.out.println("Saldo insuficiente!");
        }

    }

    public void depositarDinheiro(double valorDeposito) {
        if (valorDeposito > 0) {
            saldoConta += valorDeposito;
        } else {
            System.out.println("Valor do depósito inválido");
        }


    }

    public void transferirDinheiro(Conta destino , double valorTransferencia) {
        if (valorTransferencia <= saldoConta){
            saldoConta -= valorTransferencia;
            destino.depositarDinheiro(valorTransferencia);
        }else{
            System.out.println("Não foi possível realizar a transferência");
        }
    }
    
    @Override
    public String toString() {
        return "\nConta: " +
                "\nnomeConta = " + nomeConta +
                "\nsaldoConta = " + saldoConta +
                "\n--------------------------------";
    }
}
