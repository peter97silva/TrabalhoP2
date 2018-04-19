import java.util.LinkedList;

public class GabineteProfessor {
    private String nome;
    private LinkedList<Professor> professores;
    private boolean estadoPorta;

    public GabineteProfessor(String nome, boolean estadoPorta) {
        this.nome = nome;
        this.estadoPorta = estadoPorta;
    }

    public String getNome() {
        return nome;
    }

    public boolean isEstadoPorta() {

        return estadoPorta;
    }

    public void setEstadoPorta(boolean estadoPorta) {
        this.estadoPorta = estadoPorta;
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
        this.estadoPorta=true;

    }

    public void fechar(){
        estadoPorta=false;
    }
}
