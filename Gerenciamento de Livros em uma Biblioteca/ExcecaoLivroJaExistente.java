package biblioteca;

public class ExcecaoLivroJaExistente extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcecaoLivroJaExistente(String mensagem) {
        super(mensagem);
    }
    
}