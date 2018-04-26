import java.util.LinkedList;

public interface RepositorioAulas {

    void adicionar(Aula aula);

    void remover(Aula aula);

    LinkedList<Aula> getAulas();
}
