package entidade;

import java.util.ArrayList;
import java.util.List;

public class Carro {

    private double velocidadeCarro;

    public static List<Carro> listaCarros = new ArrayList<>();

    public Carro(double velocidadeCarro) {
        setVelocidadeCarro(velocidadeCarro);
        listaCarros.add(this);
    }

    public double getVelocidadeCarro() {
        return velocidadeCarro;
    }

    public void setVelocidadeCarro(double velocidadeCarro) {
        if (velocidadeCarro <= 0) {
            System.out.println("O carro não está em movimento");
        } else {
            this.velocidadeCarro = velocidadeCarro;
        }
    }

    public void acelerarCarro(double acelerar) {
        if (this.getVelocidadeCarro() >= 0 && this.getVelocidadeCarro() < 20) {
            setVelocidadeCarro(acelerar);
        } else {
            System.out.println("Não foi possível acelerar");
            this.velocidadeCarro = velocidadeCarro;
        }
    }

    public void reduzirVelocidade(double reduzir) {
        if (this.getVelocidadeCarro() > 0 && this.getVelocidadeCarro() < 30) {
            setVelocidadeCarro(reduzir);
        } else {
            System.out.println("Não foi possível reduzir");
            this.velocidadeCarro = velocidadeCarro;
        }
    }

    @Override
    public String toString() {
        return "velocidadeCarro = " + velocidadeCarro + "\n";
    }
}
