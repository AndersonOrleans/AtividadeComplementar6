public class MedicamentoIndicadoException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public MedicamentoIndicadoException(String message) {
        super(message);
    }

    public MedicamentoIndicadoException(String message, Throwable cause) {
        super(message, cause);
    }
}

