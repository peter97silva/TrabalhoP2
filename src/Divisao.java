public class Divisao extends Descritor {
    protected String nome;
    protected boolean aberta;

    public Divisao(String nome, boolean aberta) {
        super(nome);
        this.aberta = aberta;
    }

    public String getNome() {
        return nome;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void abrir(){
        aberta = true;
    }

    public void fechar(){
            aberta = false;

    }
}
