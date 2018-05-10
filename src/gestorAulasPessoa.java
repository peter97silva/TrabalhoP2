import java.util.LinkedList;

public class gestorAulasPessoa extends Identificador {
    protected LinkedList<Aula> aulas;

    public gestorAulasPessoa(String nome, long numero) {
        super(nome, numero);
        this.aulas = new LinkedList<>();
    }

    public void adicionar(Aula aula) {
        if (aula == null || aulas.contains(aula)) {
            return;
        }
        aulas.add(aula);
    }

    public void remover(Aula aula) {
        if (aulas.contains(aula)) {
            aulas.remove(aula);
            aula.desassociarProfessor();
        }
    }
}
