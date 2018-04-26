public class Divisao {
    protected String nome;
    protected boolean aberta;

    public Divisao(String nome, boolean aberta) {
        this.nome = nome;
        this.aberta = aberta;
    }

    public String getNome() {
        return nome;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void abrir(){
        if(aberta){
            return;
        }
        aberta = true;
    }

    public void fechar(){
        if(aberta){
            aberta = false;
        }
    }
}
