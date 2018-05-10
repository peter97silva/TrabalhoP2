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

    @Override
    public void associar(Gabinete gabinete) {

    }

    @Override
    public void desassociar(Gabinete gabinete) {

    }



    @Override
    public void abrir() {
        if(this.gabinete.isAberta()){
            return;
        }
        gabinete.abrir();
    }

    @Override
    public void fechar() {
        if(this.gabinete.isAberta()){
            return;
        }
        gabinete.fechar();
    }

    @Override
    public void abrir(Divisao divisao) {
        if(divisao.isAberta()){
            return;
        }
        divisao.abrir();
    }

    @Override
    public void fechar(Divisao divisao) {
        if(divisao.isAberta()){
            divisao.fechar();
        }
    }


}
