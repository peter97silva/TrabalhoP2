import java.util.LinkedList;

public class gestorAulasSala extends Divisao {
    protected LinkedList<Aula> aulas;

    public gestorAulasSala(String nome, boolean aberta) {
        super(nome, aberta);
        aulas = new LinkedList<>();
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
