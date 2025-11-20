public class HistoricoMedicacao {
    private String observacao;
    private RegistroConsulta registroConsulta;
    private Medicamento medicamento;

    public HistoricoMedicacao(String observacao, RegistroConsulta registroConsulta, Medicamento medicamento) {

        this.observacao = observacao;
        this.registroConsulta = registroConsulta;
        this.medicamento = medicamento;
        registroConsulta.adicionarHistorico(this);
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public RegistroConsulta getRegistroConsulta() {
        return registroConsulta;
    }

    public void setRegistroConsulta(RegistroConsulta registroConsulta) {
        this.registroConsulta = registroConsulta;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    @Override
    public String toString() {
        return "HistoricoMedicacao{" +
                "observacao='" + observacao + '\'' +
                ", registroConsulta=" + registroConsulta +
                ", medicamento=" + medicamento +
                '}';
    }
}
