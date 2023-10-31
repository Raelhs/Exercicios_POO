package executa;

import entidade.Numero;

public class Principal {

    public static void main(String[] args) {

        Numero numero = new Numero();
        numero.setValor(5);

        System.out.println("Número: " + numero.getNumero());
        System.out.println("Fatorial: " + numero.calcularFatorial());
        numero.listarDivisores();
        numero.calcularFibonacci();


        Numero outroNumero = new Numero();
        outroNumero.setValor(3);
        Numero resultadoMultiplicacao = numero.multiplicar(outroNumero);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao.getNumero());
    }
}



