import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa implements Agendavel {
    private String especialidade;
    private String crm;

    private List<Consulta> consultas;

    public Medico() {
        consultas = new ArrayList<>();
    }

    public Medico(String nome, String cpf, String especialidade, String crm) {
        super(nome, cpf);
        this.especialidade = especialidade;
        this.crm = crm;
        consultas = new ArrayList<>();
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    @Override
    public void exibirInformacoes() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n\n");
        sb.append("=============================== Informações do Médico: ===============================\n\n");
        sb.append("Nome..............: ").append(getNome()).append("\n");
        sb.append("CPF...............: ").append(getCpf()).append("\n");
        sb.append("Especialidade.....: ").append(especialidade).append("\n");
        sb.append("CRM...............: ").append(crm).append("\n\n");

        sb.append("========== Consultas do Médico ==========\n");

        for (Consulta consulta : consultas) {
            sb.append("\n");
            sb.append("Data: ").append(consulta.getDataConsulta()).append("\n");
            sb.append("Horário: ").append(consulta.getHorario()).append("\n");
            sb.append("Paciente: ").append(consulta.getPaciente().getNome()).append("\n");
            sb.append("Prioridade: ").append(consulta.getPrioridade()).append("\n");
            sb.append("Status: ").append(consulta.getStatusConsulta()).append("\n");
            sb.append("----------------------------------------\n");
        }

        System.out.println(sb.toString());
    }

    public void agendarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", crm='" + crm + '\'' +
                '}';
    }
}


