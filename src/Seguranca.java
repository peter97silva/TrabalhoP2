public class Seguranca extends Identificador {
    private GabineteSeguranca gabineteSeguranca;
    private Horario horario;


    public Seguranca(String nome, long numero,GabineteSeguranca gabineteSeguranca) {
        super(nome,numero);
        this.gabineteSeguranca = gabineteSeguranca;
    }

    public void adicionar(Object o) {

    }

    public void remover(Object o) {

    }
}
