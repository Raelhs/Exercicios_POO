package executa;

import entidade.Empregado;

public class Principal {
    public static void main(String[] args) {

        Empregado empregado1 = new Empregado("12AB","Emanuel","Bohrer", 2000);
        Empregado empregado2 = new Empregado("34CD","Felipe","Lopes", 1500);
        Empregado empregado3 = new Empregado("12EF","Danel","Steil", 5000);
        Empregado empregado4 = new Empregado("12GH","Jota","Walter", 8000);

             Empregado.listaEmpregados.get(0).modificarSalario(1.05);
             Empregado maiorSalario = Empregado.listaEmpregados.get(0);

            for (Empregado  empregado : Empregado.listaEmpregados){
                if (empregado.getSalarioEmpregado() > maiorSalario.getSalarioEmpregado()){
                    maiorSalario = empregado;

                }
            }System.out.println("O funcionário com maior aumento foi: " + maiorSalario.toString()
                + "\ncom o salário ajustado de: " +maiorSalario.modificarSalario(1.05));
    }

}

