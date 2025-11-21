public class HistoricoMedicacao {
    private String observacao;
    private RegistroConsulta registroConsulta;
    private Medicamento medicamento;

    public HistoricoMedicacao(String observacao, RegistroConsulta registroConsulta, Medicamento medicamento) {

        if (registroConsulta == null) {
            throw new MedicamentoIndicadoException("Erro: registro da consulta não pode ser nulo.");
        }

        if (medicamento == null) {
            throw new MedicamentoIndicadoException("Erro: medicamento não pode ser nulo.");
        }

        if (observacao == null || observacao.isBlank()) {
            throw new MedicamentoIndicadoException("Erro: observação da prescrição não pode ser vazia.");
        }

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
