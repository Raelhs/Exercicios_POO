package executa;

import entidade.OnibusEscolar;

public class Principal {

    public static void main(String[] args) {


        OnibusEscolar onibusEscolar = new OnibusEscolar();


        onibusEscolar.setEstudantes(50);
        onibusEscolar.setProfessores(1);
        System.out.println("O número de alunos é: " + onibusEscolar.getEstudantes());

        onibusEscolar.removerAlunos(10);
        System.out.println("Após remover os alunos: " + onibusEscolar.getEstudantes());

        onibusEscolar.setProfessores(0);
        System.out.println(onibusEscolar.getEstudantes());


    }
}







