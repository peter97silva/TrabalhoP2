import com.sun.management.DiagnosticCommandMBean;

import java.util.LinkedList;

public class GabineteSeguranca extends Divisao {
    private String nome;
    private LinkedList<Seguranca> segurancas;


    public GabineteSeguranca(String nome, boolean estadoPorta) {
        super(nome, estadoPorta);
    }

    public String getNome() {
        return nome;
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


}
