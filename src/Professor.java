import java.util.LinkedList;

public class Professor extends Pessoa {

    private GabineteProfessor gabinete;
    private LinkedList<Horario>horarios;

    public Professor(String nome, long numero, GabineteProfessor gabinete) {
        super(nome, numero);
        this.gabinete = gabinete;
    }

    public GabineteProfessor getGabinete() {
        return gabinete;
    }

    public LinkedList<Horario> getHorarios() {
        return horarios;
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

    public void abrirGabinete() {
    }

    public void fecharGabinete() {
    }

    public void abrir(Sala sala) {
    }

    public void fechar(Sala sala) {

    }

    public void atribuir(GabineteProfessor gabinete){

    }

    public void desassociar(GabineteProfessor gabinete){


    }

    public void adicionar(Horario horario){

    }

    public void remover(Horario horario){

    }
}

