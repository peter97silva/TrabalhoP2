import java.util.LinkedList;

public class GabineteProfessor {
    private String nome;
    private LinkedList<Professor> professores;
    private boolean aberta;

    public GabineteProfessor(String nome, boolean aberta) {
        this.nome = nome;
        this.aberta = aberta;
    }

    public String getNome() {
        return nome;
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
    public void abrir(){
        this.aberta = true;

    }

    public void fechar(){
        this.aberta = false;
    }
}
