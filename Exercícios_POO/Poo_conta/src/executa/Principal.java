package executa;

import entidade.Conta;

public class Principal {

    public static void main(String[] args) {

        Conta conta1 = new Conta("Emanuel", 12000.00);
        Conta conta2 = new Conta("Naudo", 5000.00);


        conta1.depositarDinheiro(3000.00);

        System.out.println("Valores após o depósito: " + Conta.listaContas.toString());


        conta2.sacarDinheiro(2000.00);

        System.out.println("Valores após o saque: " + Conta.listaContas.toString());

        conta1.transferirDinheiro(conta2, 3000.00);

        System.out.println("Valor após Transferência: "  + Conta.listaContas.toString());

    }


}


