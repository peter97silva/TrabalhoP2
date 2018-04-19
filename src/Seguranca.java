public class Seguranca extends Identificador {
    private GabineteSeguranca gabineteSeguranca;
    private Horario horario;



    public Seguranca(String nome, long numero,GabineteSeguranca gabineteSeguranca) {
        super(nome,numero);
        this.gabineteSeguranca = gabineteSeguranca;
    }


    public GabineteSeguranca getGabineteSeguranca() {
        return gabineteSeguranca;
    }

    public Horario getHorario() {
        return horario;
    }

    public void adicionar(Horario horario) {

    }

    public void remover(Horario horario) {

    }

    public void atribuir(GabineteSeguranca gabineteSeguranca){

    }

    public void desassociar(GabineteSeguranca gabineteSeguranca){

    }

    public void abrir(Sala sala){

    }

    public void fechar(Sala sala){

    }

    public void abrir(GabineteProfessor gabinete){

    }

    public void fechar(GabineteProfessor gabinete){

    }

    public void abrir(GabineteSeguranca gabinete){

    }

    public void fechar(GabineteSeguranca gabinete){

    }


    public void abrirGabinete() {

    }
    public void fechar(){

    }
}
