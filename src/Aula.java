import java.util.LinkedList;

public class Aula extends Identificador {
    private String sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;
    private Horario horario;
    private Sala sala;

    public Aula(String nome, int numero, Horario horario, Sala sala) {
        this(nome, numero, horario, null, null,sala);
    }

    public Aula(String nome, int numero, Horario horario, Professor professor, LinkedList<Aluno> alunos, Sala sala) {
        super(nome, numero);
        this.professor = professor;
        this.alunos = alunos;
        this.horario = horario;
        this.sala=sala;
        sumario = "";
        alunos = new LinkedList<>();
        for (Aluno aluno : alunos){
            this.alunos.add(aluno);
        }
    }

    public void setSala(Sala sala) {
        if (this.sala == sala) {
            return;
        }
        if (this.sala != null) {
            this.sala.remover(this);
        }
        this.sala = sala;
        this.sala.adicionar(this);
    }

    public Professor getProfessor() {
        if(professor!=null){
            return professor;
        }
        return null;
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
        if(alunos != null){
            return new LinkedList<>(alunos);
        }
        return null;
    }

    public Horario getHorario() {
        return horario;
    }

    public void desassociarSala() {
        if (sala != null) {
            Sala saux= sala;
            sala = null;
            saux.remover(this);
        }
    }
    public Sala getSala() {
        return sala;
    }

}
