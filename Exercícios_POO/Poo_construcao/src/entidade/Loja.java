package entidade;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private String nomeMaterial;
    private String descricaoMaterial;
    private double precoMaterial;
    private double pesoMaterial;
    private int estoqueMaterial;

public  static List<Loja> listaMateriais = new ArrayList<>();
    public Loja(String nomeMaterial, String descricaoMaterial, double precoMaterial, double pesoMaterial, int estoqueMaterial) {
        setNomeMaterial(nomeMaterial);
        setDescricaoMaterial(descricaoMaterial);
        setPrecoMaterial(precoMaterial);
        setPesoMaterial(pesoMaterial);
        setEstoqueMaterial(estoqueMaterial);
        listaMateriais.add(this);
    }

    public String getNomeMaterial() {
        return nomeMaterial;
    }

    public void setNomeMaterial(String nomeMaterial) {
        if (nomeMaterial.isBlank() || nomeMaterial.isEmpty()) {
            System.out.println("ERRO! nome do material inválido");
        } else {
            this.nomeMaterial = nomeMaterial;
        }
    }

    public String getDescricaoMaterial() {
        return descricaoMaterial;
    }

    public void setDescricaoMaterial(String descricaoMaterial) {
        if (descricaoMaterial.isBlank() || descricaoMaterial.isEmpty()) {
            System.out.println("ERRO! descrição inválida");
        } else {

            this.descricaoMaterial = descricaoMaterial;
        }
    }

    public double getPrecoMaterial() {
        return precoMaterial;
    }

    public void setPrecoMaterial(double precoMaterial) {
        if (precoMaterial <= 0) {
            System.out.println("ERRO! preço do material inválido");

        } else {

            this.precoMaterial = precoMaterial;
        }
    }

    public double getPesoMaterial() {
        return pesoMaterial;
    }

    public void setPesoMaterial(double pesoMaterial) {
        if (pesoMaterial <= 0) {
            System.out.println("ERRO! peso do material inválido");
        } else {

            this.pesoMaterial = pesoMaterial;
        }
    }
    public int getEstoqueMaterial() {
        return estoqueMaterial;
    }

    public void setEstoqueMaterial(int estoqueMaterial) {
       if (estoqueMaterial < 0 )
           System.out.println("ERRO! estoque inválido");

        this.estoqueMaterial = estoqueMaterial;
    }

    public int adicionarAoEstoque(int adicionar){

        return this.getEstoqueMaterial() + adicionar;
    }
    public int venderEstoque(int numeroVenda){
        if (numeroVenda <= this.getEstoqueMaterial()){

        } return this.getEstoqueMaterial() - numeroVenda;
    }
    public double colocarEmPromocao(double pecentual){

        return this.getPrecoMaterial() * pecentual;

    }

    @Override
    public String toString() {
        return "nomeMaterial = " + nomeMaterial +
                "\ndescricaoMaterial = " + descricaoMaterial +
                "\nprecoMaterial " + precoMaterial +
                "\npesoMaterial = " + pesoMaterial +
                "\nestoqueMaterial = " + estoqueMaterial;
    }
}
