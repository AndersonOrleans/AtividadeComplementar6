public class Consulta {
    private String dataConsulta;
    private String horario;

    private Medico medico;
    private Paciente paciente;

    private Prioridade prioridade = Prioridade.BAIXA;
    private StatusConsulta statusConsulta;

    private RegistroConsulta registroConsulta; // COMPOSIÇÃO


    public Consulta() {
    }

    public Consulta(String dataConsulta, String horario, Medico medico, Paciente paciente, Prioridade prioridade, StatusConsulta statusConsulta, String descricaoRegistro) {
        this.dataConsulta = dataConsulta;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
        this.prioridade = prioridade;
        this.statusConsulta = statusConsulta;
        this.registroConsulta = new RegistroConsulta(descricaoRegistro, this);
        this.medico.agendarConsulta(this);
        this.paciente.agendarConsulta(this);
    }


    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public StatusConsulta getStatusConsulta() {
        return statusConsulta;
    }

    public void setStatusConsulta(StatusConsulta statusConsulta) {
        this.statusConsulta = statusConsulta;
    }

    public RegistroConsulta getRegistroConsulta() {
        return registroConsulta;
    }

    public void exibirInformacoes() {
        StringBuilder sb = new StringBuilder();

        sb.append("Consulta:\n");
        sb.append("Data: ").append(dataConsulta).append("\n");
        sb.append("Horário: ").append(horario).append("\n");
        sb.append("Paciente: ").append(paciente.getNome()).append("\n");
        sb.append("Médico: ").append(medico.getNome()).append("\n");
        sb.append("Prioridade: ").append(prioridade).append("\n");
        sb.append("Status: ").append(statusConsulta).append("\n");
        sb.append("Registro: ").append(registroConsulta.getDescricao()).append("\n");

        System.out.println(sb.toString());
    }
}
