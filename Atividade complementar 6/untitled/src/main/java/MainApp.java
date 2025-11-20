import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        Cidade cidade1 = new Cidade("Florianópolis", "SC");
        Cidade cidade2 = new Cidade("São José", "SC");
        Cidade cidade3 = new Cidade("Palhoça", "SC");

        Paciente paciente1 = new Paciente("Anderson", "079-017-778-48", "Rua das Pedras", cidade1);
        Paciente paciente2 = new Paciente("Maria Eduarda", "071-015-775-49", "Rua dos Irmãos", cidade2);
        Paciente paciente3 = new Paciente("José de Assis", "072-018-154-58", "Rua dos Estudantes", cidade3);

        Medico medico1 = new Medico("Dra. Ari", "018-014-013-716-15", "Cardiologia", "CRM-5522");
        Medico medico2 = new Medico("Dr. Gilson", "019-013-018-46", "Clínico Geral", "CRM-5221");
        Medico medico3 = new Medico("Dra. Helena", "022-017-994-12", "Pediatria", "CRM-5544");

        Consulta consulta1 = new Consulta(
                "07/11/2025", "10:00",
                medico1, paciente1,
                Prioridade.BAIXA, StatusConsulta.AGENDADA,
                "Consulta marcada"
        );

        Consulta consulta2 = new Consulta(
                "02/10/2025", "16:00",
                medico1, paciente2,
                Prioridade.MEDIA, StatusConsulta.REALIZADA,
                "Consulta realizada com sucesso"
        );

        Consulta consulta3 = new Consulta(
                "15/09/2025", "09:30",
                medico3, paciente3,
                Prioridade.ALTA, StatusConsulta.AGENDADA,
                "Consulta agendada para avaliação"
        );


        Medicamento med1 = new Medicamento("Ibuprofeno", "EMS");
        Medicamento med2 = new Medicamento("Amoxicilina", "Aché");
        Medicamento med3 = new Medicamento("Dipirona", "Neo Química");


        RegistroConsulta rc1 = consulta1.getRegistroConsulta();
        RegistroConsulta rc2 = consulta2.getRegistroConsulta();
        RegistroConsulta rc3 = consulta3.getRegistroConsulta();
        
        try {
            new HistoricoMedicacao("1 comprimido a cada 8h", rc1, med1);
            new HistoricoMedicacao("Tomar após o almoço", rc1, med3);
            new HistoricoMedicacao("Uso oral por 7 dias", rc2, med2);
            new HistoricoMedicacao("Tomar se houver febre", rc3, med3);

        } catch (MedicamentoIndicadoException e) {
            System.out.println("Aconteceu um erro ao adicionar a medicação: " + e.getMessage());
        }

        List<Pessoa> pessoas = List.of(medico1, medico2, medico3, paciente1, paciente2, paciente3);

        apresentarPessoas(pessoas);
    }

    public static void apresentarPessoas(List<Pessoa> pessoas) {
        for (Pessoa p : pessoas) {
            p.exibirInformacoes();
        }
    }

}



