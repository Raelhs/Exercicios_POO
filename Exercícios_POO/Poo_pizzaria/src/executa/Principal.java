package executa;

import entidade.Pizzaria;

public class Principal {

    public static void main(String[] args) {

        Pizzaria pizza1 = new Pizzaria("Pizza calabresa acebolada", "Calabresa", "Cebola", "Queijo", true, 20, 50);
        Pizzaria pizza2 = new Pizzaria("Pizza 3 queijos", "Queijo muçarela", "Queijo parmesão", "Queijo Bolonhesa", false, 30, 70);
        Pizzaria pizza3 = new Pizzaria("Pizza Alho e óleo", "Alho", "Óleo", "Molho de tomate", true, 45, 100);
        Pizzaria pizza4 = new Pizzaria("Bacon", "Bacon", "Catupiry", "Milho", true, 55, 115);
        Pizzaria pizza5 = new Pizzaria("Pizza Chester ", "Frango", "Lombinho", "Batata palha", true, 70, 130);

        Pizzaria menorPreco = Pizzaria.listaPizzas.get(0);
        for (Pizzaria pizz : Pizzaria.listaPizzas) {
            if (pizz.getPrecoPizza() / pizz.calcularArea() < menorPreco.getPrecoPizza() / menorPreco.calcularArea()) {
                menorPreco = pizz;

            }
            pizz.mudarIngredientes("Banana");

        }
        System.out.println(menorPreco.toString());


    }


}