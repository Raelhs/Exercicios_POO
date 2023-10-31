package entidades;

public class Endereco {

    private  String logradouroEndereco;
    private String complementoEdereco;
    private int numeroEdereco;

    public Endereco(String logradouroEndereco, String complementoEdereco, int numeroEdereco) {
        setLogradouroEndereco(logradouroEndereco);
        setComplementoEdereco(complementoEdereco);
        setNumeroEdereco(numeroEdereco);
    }
    public String getLogradouroEndereco() {
        return logradouroEndereco;
    }

    public void setLogradouroEndereco(String logradouroEndereco) {
        if (logradouroEndereco == null || logradouroEndereco.isEmpty() || logradouroEndereco.isBlank()){
            throw new IllegalArgumentException("Logradouro inválido");
        }

        this.logradouroEndereco = logradouroEndereco;
    }

    public String getComplementoEdereco() {
        return complementoEdereco;
    }

    public void setComplementoEdereco(String complementoEdereco) {
        if (complementoEdereco == null || complementoEdereco.isBlank() || complementoEdereco.isEmpty()){
            throw new IllegalArgumentException("CoProjeto HTMLmplemeto Inválido");
        }

        this.complementoEdereco = complementoEdereco;
    }

    public int getNumeroEdereco() {
        return numeroEdereco;
    }

    public void setNumeroEdereco(int numeroEdereco) {
        if (numeroEdereco <= 0){
            throw new IllegalArgumentException("Número do endereço inválido");
        }

        this.numeroEdereco = numeroEdereco;
    }

    @Override
    public String toString() {
        return  " logradouroEndereco= " + logradouroEndereco +
                " complementoEdereco= " + complementoEdereco +
                " numeroEdereco= " + numeroEdereco;
    }
}