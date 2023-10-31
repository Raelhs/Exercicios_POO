package executa;

import entidades.Endereco;
import entidades.Pessoa;

public class Principal {
    public static void main(String[] args) {

        Endereco end1 = new Endereco("Rua","Casa", 246);
        Endereco end2 = new Endereco("Avenida","Apartamento", 566);
        Endereco end3 = new Endereco("Rua","Kitnet", 2343);
        Endereco end4 = new Endereco("Avenida","Casa", 344);
        Endereco end5 = new Endereco("Rua","Casa", 677);

        Pessoa pes1 = new Pessoa("Emanuel","Rua César Silveira" + end1);
        Pessoa pes2 = new Pessoa("Felipe","Rua Bahia" + end2);
        Pessoa pes3 = new Pessoa("Danel","Rua Veira"+ end3);
        Pessoa pes4 = new Pessoa("Naudo","Rua São Paulo" + end4);
        Pessoa pes5 = new Pessoa("Victor","Rua Osvaldo Cruz" + end5);


        for (Pessoa pessoas : Pessoa.listaPessoas){
            System.out.println(pessoas.toString());
        }


    }

}
