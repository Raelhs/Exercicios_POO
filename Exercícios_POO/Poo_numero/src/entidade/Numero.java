package entidade;

public class Numero {

    private int numero;

    public Numero() {
        setNumero(numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número inválido");
        }
        this.numero = numero;
    }

    public void setValor(int valor) {
        if (valor > 0) {
            numero = valor;
        } else {
            System.out.println("Erro: O valor deve ser um inteiro positivo.");
        }
    }


    public Numero multiplicar(Numero outro) {
        Numero resultado = new Numero();
        resultado.setValor(this.numero * outro.numero);
        return resultado;
    }

    public int calcularFatorial() {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            int fatorial = 1;
            for (int i = 2; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }


    public void listarDivisores() {
        System.out.print("Divisores de " + numero + ": ");
        int quantidadeDivisores = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
                quantidadeDivisores++;
            }
        }
        System.out.println("\nQuantidade de divisores: " + quantidadeDivisores);
    }


    public void calcularFibonacci() {
        int a = 0;
        int b = 1;
        System.out.print("Série de Fibonacci com " + numero + " elementos: ");
        for (int i = 0; i < numero; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }
}







