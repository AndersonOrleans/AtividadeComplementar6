public class Endereco {
    private String rua;
    private String complemento;
    private Cidade cidade;

    public Endereco() {
    }

    public Endereco(String rua, Cidade cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        String texto = rua;

        if (complemento != null && !complemento.isBlank()) {
            texto += ", " + complemento;
        }

        if (cidade != null) {
            texto += ", " + cidade.getNome() + " - " + cidade.getUf();
        }

        return texto;
    }
}
