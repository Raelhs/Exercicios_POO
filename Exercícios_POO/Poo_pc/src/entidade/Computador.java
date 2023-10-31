package entidade;

import java.util.ArrayList;
import java.util.List;

public class Computador {

    private int numeroDeSerie;
    private String modeloProcessador;
    private double clockProcessador;
    private boolean overclock;
    private double armazenamentoHdd;
    private int quantidadeMemoria;
    private double consumoEnergia;
    private int potenciaFonte;

    public static List<Computador> listaComputadores = new ArrayList<>();
    public Computador(int numeroDeSerie, String modeloProcessador, double clockProcessador, double armazenamentoHdd, int quantidadeMemoria, double consumoEnergia, int potenciaFonte) {
        setNumeroDeSerie(numeroDeSerie);
        setModeloProcessador(modeloProcessador);
        setClockProcessador(clockProcessador);
        setArmazenamentoHdd(armazenamentoHdd);
        setQuantidadeMemoria(quantidadeMemoria);
        setConsumoEnergia(consumoEnergia);
        setPotenciaFonte(potenciaFonte);
        listaComputadores.add(this);
    }


    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getModeloProcessador() {
        return modeloProcessador;
    }

    public void setModeloProcessador(String modeloProcessador) {
        this.modeloProcessador = modeloProcessador;
    }

    public double getClockProcessador() {
        return clockProcessador;
    }

    public void setClockProcessador(double clockProcessador) {
        this.clockProcessador = clockProcessador;
    }

    public boolean isOverclock() {
        return overclock;
    }

    public void setOverclock(boolean overclock) {
        this.overclock = overclock;
    }

    public double getArmazenamentoHdd() {
        return armazenamentoHdd;
    }

    public void setArmazenamentoHdd(double armazenamentoHdd) {
        this.armazenamentoHdd = armazenamentoHdd;
    }

    public int getQuantidadeMemoria() {
        return quantidadeMemoria;
    }

    public void setQuantidadeMemoria(int quantidadeMemoria) {
        this.quantidadeMemoria = quantidadeMemoria;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public int getPotenciaFonte() {
        return potenciaFonte;
    }

    public void setPotenciaFonte(int potenciaFonte) {
        this.potenciaFonte = potenciaFonte;
    }
}
