import java.util.ArrayList;
import java.util.List;

public class RegistroConsulta {
    private String descricao;
    private final Consulta consulta; // final reforça composição
    private final List<HistoricoMedicacao> historicos;

    public RegistroConsulta(String descricao, Consulta consulta) {
        this.descricao = descricao;
        this.consulta = consulta;
        this.historicos = new ArrayList<>();
    }

    public void adicionarHistorico(HistoricoMedicacao historico) {

        if (historico == null) {
            throw new MedicamentoIndicadoException("Erro: histórico de medicação não pode ser nulo.");
        }

        if (historico.getMedicamento() == null) {
            throw new MedicamentoIndicadoException("Erro: medicamento não informado na prescrição.");
        }

        if (historico.getObservacao() == null || historico.getObservacao().isBlank()) {
            throw new MedicamentoIndicadoException("Erro: observação da prescrição não pode ser vazia.");
        }

        historicos.add(historico);
    }

    public List<HistoricoMedicacao> getHistoricos() {
        return historicos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    @Override
    public String toString() {
        return "RegistroConsulta{" +
                "descricao='" + descricao + '\'' +
                ", historicos=" + historicos +
                '}';
    }
}
