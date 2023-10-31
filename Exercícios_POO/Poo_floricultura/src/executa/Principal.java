package executa;

import entidade.Floricultura;

public class Principal {
    public static void main(String[] args) {


        Floricultura flor1 = new Floricultura("Rosa", 13.60, "Emanuel", true);
        Floricultura flor2 = new Floricultura("Orquídea", 20.35, "Danel", false);
        Floricultura flor3 = new Floricultura("Petúnia", 8.20, "Felipe", false);
        Floricultura flor4 = new Floricultura("Margarida", 18.90, "Victor", true);
        Floricultura flor5 = new Floricultura("Bromélia", 30.45, "Jota", true);
        Floricultura flor6 = new Floricultura("Hibisco", 5.65, "Naudo", true);


        Floricultura maiorValor = Floricultura.listaFlores.get(0);

        for (Floricultura flor : Floricultura.listaFlores) {
            if (flor.getPrecoFlor() > maiorValor.getPrecoFlor()) {
                maiorValor = flor;
            }
        }
        System.out.println("O cliente " + maiorValor.getNomeCliente() + " Comprou a flor mais cara");
        System.out.println("O nome da flor mais cara é: " + maiorValor.getNomeFlor());

    }
}
