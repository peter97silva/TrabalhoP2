import java.util.LinkedList;

public class Seguranca extends Identificador implements Funcionario{
    private GabineteSeguranca gabinete;
    private LinkedList<Horario> horarios;



    public Seguranca(String nome, long numero,GabineteSeguranca gabinete) {
        super(nome,numero);
        this.gabinete = gabinete;
    }


    public GabineteSeguranca getGabinete() {
        return gabinete;
    }

    public LinkedList<Horario> getHorario() {
        return new LinkedList<>(horarios);
    }

    public void adicionar(Horario horario) {
        if(horario != null){
            horarios.add(horario);
        }
    }

    public void remover(Horario horario) {
        if(horarios.contains(horario)){
            horarios.remove(horario);
        }
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
