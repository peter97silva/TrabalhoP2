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

    public void abrir(Divisao divisao) {
        if(divisao.isAberta()){
            return;
        }
        divisao.abrir();
    }

    public void abrirGabinete(){
        if(gabineteSeguranca.isAberta()){
            return;
        }
        gabineteSeguranca.abrir();
    }


    public void fechar(Divisao divisao) {
        if(divisao.isAberta()){
            divisao.fechar();
        }
    }


}
