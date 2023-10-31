package executa;

import entidade.Carro;

public class Principal {


    public static void main(String[] args) {


        Carro car1 = new Carro(40.0);
        Carro car2 = new Carro(25.0);


        car1.acelerarCarro(20);
        car2.reduzirVelocidade(10);
        System.out.println(car1.toString());
        System.out.println(car2.toString());


    }


}
