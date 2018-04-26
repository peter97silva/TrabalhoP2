import java.util.LinkedList;

public class GabineteProfessor extends Divisao{
    private LinkedList<Professor> professores;

    public GabineteProfessor(String nome, boolean aberta) {
        super(nome,aberta);
    }

    public boolean isAberta() {

        return aberta;
    }


    public LinkedList<Professor> getProfessors() {
        return professores;
    }

    public void adicionar(Professor professor) {
        if (professor == null || professores.contains(professor)) {
            return;
        }
        professores.add(professor);
    }
    public void remover(Professor professor) {
        if (professor == null) {
            return;
        }
        professores.remove(professor);
       // professor.remover(null);
    }
}
