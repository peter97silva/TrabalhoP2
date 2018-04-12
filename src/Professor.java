import java.util.LinkedList;

public class Professor extends Pessoa {

    private GabineteProfessor gabinete;
    private LinkedList<Horario>horarios;

    public Professor(String nome, long numero, GabineteProfessor gabinete) {
        super(nome, numero);
        this.gabinete = gabinete;
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
}

