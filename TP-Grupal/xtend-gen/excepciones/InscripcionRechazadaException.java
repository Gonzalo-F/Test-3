package excepciones;

@SuppressWarnings("all")
public class InscripcionRechazadaException extends RuntimeException {
  public InscripcionRechazadaException(final String mensajeDeError) {
    super(mensajeDeError);
  }
}
