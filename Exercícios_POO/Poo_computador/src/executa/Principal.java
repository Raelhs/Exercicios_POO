package executa;

import entidade.Computador;


public class Principal {
    public static void main(String[] args) {

            Computador pc1 = new Computador("SN001","Intel Core i7-13700KF", 5.4, 512, 16, 500,850);

        Computador.listaComputadores.get(0).fazerOverclock(0.7);


        int totalArmazenamento = Computador.calcularArmazenamentoTotal(Computador.listaComputadores);
        System.out.print("Armazenamento total do laboratório: " + totalArmazenamento + " GB");


        int numeroSalas = 3;
        int potenciaMinima = Computador.calcularPotenciaMinima(Computador.listaComputadores, numeroSalas);
        System.out.println("Potência mínima necessária para " + numeroSalas + " salas: " + potenciaMinima + " W");

        int horasPorDia = 12;
        int diasPorMes = 30;
        double precoKWh = 0.71;
        double custoEnergia = Computador.calcularCustoEnergia(potenciaMinima, horasPorDia, diasPorMes, precoKWh);
        System.out.printf("Custo mensal de energia para " + numeroSalas + " salas: R$%.2f " , custoEnergia);
    }
}
