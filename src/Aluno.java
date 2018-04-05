import java.util.LinkedList;

public class Aluno extends Identificador {
    private String nome;
    private long numero;
    private LinkedList<Aula> aulas;

    public Aluno(String nome, long numero) {
        super.nome = nome;
        super.numero = numero;
        this.aulas = new LinkedList<>();
    }

    public void adicionar(Aula aula) {
        aulas.add(aula);
    }

    public void remover(Aula aula) {
        aulas.remove(aula);
    }

    public LinkedList<Aula> getAulas() {
        return new LinkedList<Aula>(aulas);
    }

    public void preencherSumario(Aula aula) {
        if (aulas.contains(aula)) {
            aula.adicionarLinhaSumario(nome);
        }
    }

    public LinkedList<Aula> getAulas(Horario horario) {

        LinkedList<Aula> aulasHorario = new LinkedList<>();
        for (Aula aula : aulas) {
            if (aula.getHorario().isSobreposto(horario)) {
                aulasHorario.add(aula);
            }
        }
        return aulasHorario;
    }

}
