import java.util.LinkedList;

public class Aula extends Identificador {


    private String sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;
    private Horario horario;

    public Aula(String nome, int numero, Horario horario) {
        this(nome, numero, horario, null, null);
    }

    public Aula(String nome, int numero, Horario horario, Professor professor, LinkedList<Aluno> alunos) {
        super(nome, numero);
        this.professor = professor;
        this.alunos = alunos;
        this.horario = horario;
        sumario = "";
        alunos = new LinkedList<>();
        for (Aluno aluno : alunos){
            this.alunos.add(aluno);
        }
    }


    public void setProfessor(Professor professor) {
        if (this.professor == professor) {
            return;
        }
        if (this.professor != null) {
            this.professor.remover(this);
        }
        this.professor = professor;
        this.professor.adicionar(this);
    }

    public void adicionar(Aluno aluno) {
        if (aluno == null || alunos.contains(aluno)) {
            return;
        }
        alunos.add(aluno);
        aluno.adicionar(this);
    }

    public void remover(Aluno aluno) {
        if (aluno == null) {
            return;
        }
        alunos.remove(aluno);
        aluno.remover(this);
    }

    public String getSumario() {
        return sumario;
    }


    public void desassociarProfessor() {
        if (professor != null) {
            Professor paux = professor;
            professor = null;
            paux.remover(this);
        }
    }

    public void adicionarLinhaSumario(String linha) {
        StringBuilder sb = new StringBuilder(sumario);
        sb.append(linha).append("\n");
        sumario = sb.toString();
    }

    public LinkedList<Aluno> getAlunos() {
        return new LinkedList<>(alunos);
    }

    public Horario getHorario() {
        return horario;
    }
}
