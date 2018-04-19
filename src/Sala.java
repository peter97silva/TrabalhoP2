import java.util.LinkedList;

public class Sala {
    private String nome;
    private LinkedList<Aula> aulasLecionadas;
    private boolean estado;

    public Sala(String nome, boolean estado) {
        this.nome = nome;
        this.estado = estado;
        aulasLecionadas = new LinkedList<>();
    }

    public String getNome() {
        return nome;
    }

    public LinkedList<Aula> getAulasLecionadas() {
        return aulasLecionadas;
    }

    public LinkedList<Aula> getAulas(Horario horario) {
        LinkedList<Aula> aulasHorario = new LinkedList<>();
        for (Aula aula : aulasLecionadas) {
            if (aula.getHorario().isSobreposto(horario)) {
                aulasHorario.add(aula);
            }
        }
        return aulasHorario;
    }

    public void setAulasLecionadas(LinkedList<Aula> aulasLecionadas) {
        this.aulasLecionadas = aulasLecionadas;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void adicionar(Aula aula) {
        if (aula == null || aulasLecionadas.contains(aula)) {
            return;
        }
        aulasLecionadas.add(aula);
    }

    public void remover(Aula aula) {
        if (aulasLecionadas.contains(aula)) {
            aulasLecionadas.remove(aula);
            aula.desassociarProfessor();
        }
    }
    public void abrir(){

    }

    public void fechar(){

    }


}


