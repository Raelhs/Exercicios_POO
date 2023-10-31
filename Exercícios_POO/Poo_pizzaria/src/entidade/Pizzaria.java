package entidade;

import java.util.ArrayList;
import java.util.List;

public class Pizzaria {


    private String nomePizzaria;
    private String ingrediente1;
    private String ingrediente2;
    private String ingrediente3;

    private boolean bordaPizza;
    private double diametroPizza;
    private double precoPizza;

    public static List<Pizzaria> listaPizzas = new ArrayList<>();

    public Pizzaria(String nomePizzaria, String ingrediente1, String ingrediente2, String ingrediente3, boolean bordaPizza, double diametroPizza, double precoPizza) {
        setNomePizzaria(nomePizzaria);
        setIngrediente1(ingrediente1);
        setIngrediente2(ingrediente2);
        setIngrediente3(ingrediente3);
        setBordaPizza(bordaPizza);
        setDiametroPizza(diametroPizza);
        setPrecoPizza(precoPizza);
        listaPizzas.add(this);
    }

    public String getNomePizzaria() {
        return nomePizzaria;
    }

    public void setNomePizzaria(String nomePizzaria) {
        if (nomePizzaria.isBlank() || nomePizzaria.isEmpty()) {
            System.out.println("Erro! nome pizzaria inválido");

        } else {
            this.nomePizzaria = nomePizzaria;
        }
    }

    public String getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(String ingrediente1) {

        this.ingrediente1 = ingrediente1;
    }

    public String getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(String ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }

    public String getIngrediente3() {
        return ingrediente3;
    }

    public void setIngrediente3(String ingrediente3) {
        this.ingrediente3 = ingrediente3;
    }

    public boolean isBordaPizza() {
        return bordaPizza;
    }

    public void setBordaPizza(boolean bordaPizza) {
        this.bordaPizza = bordaPizza;
    }

    public double getDiametroPizza() {
        return diametroPizza;
    }

    public void setDiametroPizza(double diametroPizza) {
        if (diametroPizza <= 0) {
            System.out.println("Erro! diâmetro da pizza inválido");
        } else {
            this.diametroPizza = diametroPizza;
        }
    }

    public double getPrecoPizza() {
        return precoPizza;
    }

    public void setPrecoPizza(double precoPizza) {
        if (precoPizza <= 0) {
            System.out.println("Erro! preço inválido");
        } else {
            this.precoPizza = precoPizza;
        }
    }

    public String mudarIngredientes(String novoIngrediente) {
        for (Pizzaria pizza : Pizzaria.listaPizzas) {
            if (pizza.ingrediente1 == null) {
                pizza.setIngrediente1(novoIngrediente);
            }
            if (pizza.ingrediente2 == null) {
                pizza.setIngrediente2(novoIngrediente);
            }
            if (pizza.ingrediente3 == null) {
                pizza.setIngrediente3(novoIngrediente);
            } else {
                pizza.setIngrediente3(novoIngrediente);
            }
        }
        return novoIngrediente = null;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(diametroPizza/ 2, 2);
    }

    @Override
    public String toString() {
        return "Nome da Pizza= " + nomePizzaria +
                "\ningrediente1= " + ingrediente1 +
                "\ningrediente2= " + ingrediente2 +
                "\ningrediente3= " + ingrediente3 +
                "\nbordaPizza= " + bordaPizza +
                "\ndiametroPizza= " + diametroPizza +
                "\nprecoPizza= " + precoPizza;
    }
}