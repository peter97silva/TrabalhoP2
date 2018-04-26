import java.util.LinkedList;

public class Sala extends Divisao{
    private LinkedList<Aula> aulasLecionadas;

    public Sala(String nome, boolean aberta) {
        super(nome,aberta);
        aulasLecionadas = new LinkedList<>();
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
        this.aberta = true;
    }

    public void fechar(){

    }


}


