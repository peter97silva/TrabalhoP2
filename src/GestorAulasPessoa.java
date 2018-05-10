import java.util.LinkedList;

public class GestorAulasPessoa extends Identificador {
    protected LinkedList<Aula> aulas;

    public GestorAulasPessoa(String nome, long numero) {
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
