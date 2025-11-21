import java.util.ArrayList;
import java.util.List;

public class RegistroConsulta {
    private String descricao;
    private final Consulta consulta;
    private final List<HistoricoMedicacao> historicos;

    public RegistroConsulta(String descricao, Consulta consulta) {
        this.descricao = descricao;
        this.consulta = consulta;
        this.historicos = new ArrayList<>();
    }

    public void adicionarHistorico(HistoricoMedicacao historico) {
        // sem validação, apenas adiciona
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
