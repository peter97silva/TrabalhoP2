import java.util.LinkedList;

public class GabineteSeguranca {
    private String nome;
    private boolean estadoPorta;
    private LinkedList<Seguranca> segurancas;


    public GabineteSeguranca(String nome, boolean estadoPorta) {
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

    public LinkedList<Seguranca> getSegurancas() {
        return segurancas;
    }

    public void adicionar(Seguranca seguranca) {
        if (seguranca == null || segurancas.contains(seguranca)) {
            return;
        }
        segurancas.add(seguranca);
        seguranca.adicionar(null);
    }
    public void remover(Seguranca seguranca) {
        if (seguranca == null) {
            return;
        }
        segurancas.remove(seguranca);
        seguranca.remover(null);
    }

    public void abrir(){

    }

    public void fecahr(){

    }

}
