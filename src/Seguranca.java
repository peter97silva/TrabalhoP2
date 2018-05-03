public class Seguranca extends Identificador implements Funcionario{
    private GabineteSeguranca gabinete;
    private Horario horario;



    public Seguranca(String nome, long numero,GabineteSeguranca gabinete) {
        super(nome,numero);
        this.gabinete = gabinete;
    }


    public GabineteSeguranca getGabinete() {
        return gabinete;
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

    @Override
    public void abrir(GabineteProfessor gabinete) {

    }

    @Override
    public void fechar(GabineteProfessor gabinete) {

    }

    public void abrir(Divisao divisao) {
        if(divisao.isAberta()){
            return;
        }
        divisao.abrir();
    }

    public void abrir(GabineteSeguranca gabinete){
        if(gabinete.isAberta()){
            return;
        }
        gabinete.abrir();
    }

    public void fechar(GabineteSeguranca gabinete){
        if(gabinete.isAberta())
        {
            gabinete.fechar();
        }
    }


    public void fechar(Divisao divisao) {
        if(divisao.isAberta()){
            divisao.fechar();
        }
    }


}
