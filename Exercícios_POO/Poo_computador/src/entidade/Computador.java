package entidade;

import java.util.ArrayList;
import java.util.List;

public class Computador {
    private String numeroSerie;
    private String modeloProcessador;
    private double cpuClock;
    private boolean permiteOverclock;
    private int armazenamentoHDD;
    private int memoriaRAM;
    private int consumoEnergia;
    private int potenciaFonte;
public static List<Computador> listaComputadores = new ArrayList<>();
    public Computador(String numeroSerie, String modeloProcessador, double cpuClock, int armazenamentoHDD, int memoriaRAM, int consumoEnergia, int potenciaFonte) {
        this.numeroSerie = numeroSerie;
        this.modeloProcessador = modeloProcessador;
        this.cpuClock = cpuClock;
        this.armazenamentoHDD = armazenamentoHDD;
        this.memoriaRAM = memoriaRAM;
        this.consumoEnergia = consumoEnergia;
        this.potenciaFonte = potenciaFonte;
        this.permiteOverclock = modeloProcessador.endsWith("K") || modeloProcessador.endsWith("KF") || modeloProcessador.endsWith("X");
        listaComputadores.add(this);

    }

    public void fazerOverclock(double incrementoMHz) {
        if (!permiteOverclock) {
            System.out.println("Não é possível fazer overclock neste computador.");
            return;
        }

        double novoClock = cpuClock + incrementoMHz;
        int novoConsumo = consumoEnergia + (int) (incrementoMHz / 100 * 75);

        if (novoConsumo <= 0.95 * potenciaFonte) {
            cpuClock = novoClock;
            consumoEnergia = novoConsumo;
            System.out.println("Overclock realizado com sucesso. Novo clock: " + cpuClock + " GHz");
        } else {
            System.out.println("Não é possível fazer overclock devido ao limite de consumo de energia.");
        }
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public int getArmazenamentoHDD() {
        return armazenamentoHDD;
    }

    public static int calcularArmazenamentoTotal(List<Computador> listaComputadores) {
        int totalArmazenamento = 0;
        for (Computador computador : Computador.listaComputadores) {
            totalArmazenamento += computador.armazenamentoHDD;
        }
        return totalArmazenamento;
    }

    public static int calcularPotenciaMinima(List<Computador> listaComputadores, int numeroSalas) {
        int consumoTotal = 0;
        for (Computador computador : Computador.listaComputadores) {
            consumoTotal += computador.consumoEnergia;
        }
        consumoTotal *= numeroSalas;

        double potenciaMinima = consumoTotal * 1.1;
        return (int) potenciaMinima;
    }

    public static double calcularCustoEnergia(int potenciaMinima, int horasPorDia, int diasPorMes, double precoKWh) {
        double consumoKWh = potenciaMinima / 1000.0;
        double custoMensal = consumoKWh * horasPorDia * diasPorMes * precoKWh;
        return custoMensal;
    }
}