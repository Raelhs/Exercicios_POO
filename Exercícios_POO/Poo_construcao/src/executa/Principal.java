package executa;

import entidade.Loja;

public class Principal {

    public static void main(String[] args) {

        Loja material1 = new Loja("Cimento", "Cimento 50kg", 100, 50, 10);
        Loja material2 = new Loja("Tijolo", "Tijolo 8 furos", 5, 6, 1000);
        Loja material3 = new Loja("Madeira", "Madeira canela", 80, 10, 40);

        Loja maioValor = Loja.listaMateriais.get(0);
        Loja menorPeso = Loja.listaMateriais.get(0);
        Loja pesoTotal = Loja.listaMateriais.get(0);


        for (Loja material : Loja.listaMateriais) {
            if (material.getPrecoMaterial() > maioValor.getPrecoMaterial()) {
                maioValor = material;
            }
            if (material.getPesoMaterial() < menorPeso.getPesoMaterial()) {
                menorPeso = material;
            }
            if (material.getPesoMaterial() * material.getEstoqueMaterial() > pesoTotal.getPesoMaterial() * pesoTotal.getEstoqueMaterial()) {
                pesoTotal = material;
            }

        }


        System.out.println("Material com maior valor: \n" + maioValor.toString());
        System.out.println("Material com menor peso: " + menorPeso.toString());
        System.out.println(pesoTotal.toString());

    }


}
