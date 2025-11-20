import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa implements Agendavel {
    private Endereco endereco;
    private List<Consulta> consultas;

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public Paciente() {
        this.endereco = new Endereco();
        this.consultas = new ArrayList<>();
    }

    public Paciente(String nome, String cpf, String rua, Cidade cidade) {
        super(nome, cpf);
        this.endereco = new Endereco(rua, cidade);
        this.consultas = new ArrayList<>();
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public void exibirInformacoes() {
        StringBuilder sb = new StringBuilder();
        sb.append("=============================== Informações do Paciente ===============================\n\n");
        sb.append("Nome..............: ").append(getNome()).append("\n");
        sb.append("CPF...............: ").append(getCpf()).append("\n");
        sb.append("Endereço..........: ").append(endereco).append("\n\n");

        sb.append("================ Consultas do Paciente ================ \n\n");
        for (Consulta consulta : consultas) {
            sb.append("Data: ").append(consulta.getDataConsulta()).append("\n");
            sb.append("Horário: ").append(consulta.getHorario()).append("\n");
            sb.append("Médico: ").append(consulta.getMedico().getNome()).append("\n");
            sb.append("Prioridade: ").append(consulta.getPrioridade()).append("\n");
            sb.append("Status: ").append(consulta.getStatusConsulta()).append("\n");


            RegistroConsulta rc = consulta.getRegistroConsulta();
            if (rc != null && rc.getHistoricos() != null && !rc.getHistoricos().isEmpty()) {
                sb.append("\n========== Prescrições do medicamento: ==========\n\n");

                for (HistoricoMedicacao h : rc.getHistoricos()) {
                    sb.append(" - Medicamento: ").append(h.getMedicamento().getNome()).append("\n");
                    sb.append("   Observação: ").append(h.getObservacao()).append("\n");
                }
            } else {
                sb.append("Prescrições......: Sem prescrição médica\n");
            }
            sb.append("----------------------------------------\n\n");
        }

        System.out.println(sb.toString());
    }

    public void atualizarEndereco(String rua, Cidade cidade) {
        this.endereco = new Endereco(rua, cidade);
    }

    @Override
    public void agendarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
