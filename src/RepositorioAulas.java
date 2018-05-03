import java.util.LinkedList;

public interface RepositorioAulas {
    LinkedList<Aula> getAulas();

    void adicionar(Aula aula);

    void remover(Aula aula);
}
