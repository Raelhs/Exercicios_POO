package entidades;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nomePessoa;
    private String enderecoPessoa;

    public static List<Pessoa> listaPessoas = new ArrayList<>();

    public Pessoa(String nomePessoa, String enderecoPessoa) {
        setNomePessoa(nomePessoa);
        setEnderecoPessoa(enderecoPessoa);
        listaPessoas.add(this);
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        if (nomePessoa == null || nomePessoa.isBlank() || nomePessoa.isEmpty()) {
            throw new IllegalArgumentException("Nome Inválido");
        }
        this.nomePessoa = nomePessoa;
    }

    public String getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public void setEnderecoPessoa(String enderecoPessoa) {
        if (enderecoPessoa == null || enderecoPessoa.isBlank() || enderecoPessoa.isEmpty()) {
            throw new IllegalArgumentException("Endereço inválido");
        }
        this.enderecoPessoa = enderecoPessoa;
    }

    @Override
    public String toString() {
        return
                "nomePessoa= " + nomePessoa +
                " enderecoPessoa= " + enderecoPessoa;
    }
}