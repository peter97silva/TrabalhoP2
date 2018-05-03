import java.util.LinkedList;

public class Professor extends Pessoa implements Funcionario {

    private GabineteProfessor gabinete;
    private LinkedList<Horario> horariosAtendimento;

    public Professor(String nome, long numero, GabineteProfessor gabinete) {
        super(nome, numero);
        this.gabinete = gabinete;
    }

    public GabineteProfessor getGabinete() {
        return gabinete;
    }

    public LinkedList<Horario> getHorarios() {
        return horariosAtendimento;
    }

    @Override
    public void preencherSumario(Aula aula) {
        if (!aulas.contains(aula)) {
            return;
        }
        aula.adicionarLinhaSumario(aula.getNome());
        aula.adicionarLinhaSumario(String.valueOf(aula.getNumero()));
        aula.adicionarLinhaSumario(nome);
        for (Aluno aluno : aula.getAlunos()) {
            aluno.preencherSumario(aula);
        }
    }


    @Override
    public void abrir(GabineteProfessor gabinete){
        if(gabinete.isAberta()){
            return;
        }
        gabinete.abrir();
    }

    @Override
    public void fechar(GabineteProfessor gabinete) {
        if(gabinete.isAberta()){
            gabinete.fechar();
        }
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

    @Override
    public void adicionar(Horario horario){

    }

    @Override
    public void remover(Horario horario){

    }
}

