package executa;

import entidade.Camara;

public class Principal {
    public static void main(String[] args) {


        Camara vereador1 = new Camara("José", "TudoPuta", 3, 1, 0.80);
        Camara vereador2 = new Camara("Marcos", "PCD", 6, 5, 1.0);
        Camara vereador3 = new Camara("Pedro", "CV", 11, 8, 1.08);
        Camara vereador4 = new Camara("Jorge", "PCC", 18, 16, 1.22);

        int somaApresentados = 0;
        int somaAprovados = 0;
       double mediaDesempenho = 0;
        Camara vereadorMaisProjetosAprovados = Camara.listaVereadores.get(0);
        Camara vereadorMenorDesempenho = Camara.listaVereadores.get(0);

        for (Camara vereador : Camara.listaVereadores) {
            somaApresentados += vereador.getQuantidadeDeProjetosApresentados();
            somaAprovados += vereador.getQuantidadeDeProjetosAprovados();
            if (vereador.getQuantidadeDeProjetosAprovados() > vereadorMaisProjetosAprovados.getQuantidadeDeProjetosAprovados()) {
                vereadorMaisProjetosAprovados = vereador;
            }
            if (vereador.calcularDesempenho() < vereadorMenorDesempenho.calcularDesempenho()) {
                vereadorMenorDesempenho = vereador;
            }
            mediaDesempenho+= vereador.calcularDesempenho();
        }
        mediaDesempenho /= Camara.listaVereadores.size();

        System.out.println("A quantidade de projetos apresentados foi: " + somaApresentados);
        System.out.println("A quantidade de projetos aprovados foi: " + somaAprovados);

        System.out.println("\n<Vereador com maior desempenho>");
        System.out.println("Nome: " + vereadorMaisProjetosAprovados.getNomeVereador() + "\nPartido: " + vereadorMaisProjetosAprovados.getNomePartido() + "\nÍndice de desempenho: " + vereadorMaisProjetosAprovados.calcularDesempenho());

        System.out.println("\n<Vereador com menor desempenho>");
        System.out.println("Nome: " + vereadorMenorDesempenho.getNomeVereador() + "\nNome do partido: " + vereadorMenorDesempenho.getNomePartido() + "\nDesempenho: " + vereadorMenorDesempenho.calcularDesempenho());

        System.out.println("\n");
        for (Camara vereador : Camara.listaVereadores) {
            if (vereador.calcularDesempenho() > mediaDesempenho) {
                System.out.println("Nome: " + vereador.getNomeVereador() +"|" +"Partido: " +  vereador.getNomePartido() +"|" +"Desempenho" + vereador.calcularDesempenho());
            }

        }

    }
}
