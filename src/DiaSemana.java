import com.sun.java.browser.plugin2.DOM;

public enum DiaSemana {
    DOMINGO(0),
    SEGUNDA_FEIRA(1),
    TERCA_FEIRA(2),
    QUARTA_FEIRA(3),
    QUINTA_FEIRA(4),
    SEXTA_FEIRA(5),
    SABADO(6);

    private int i;

    DiaSemana(int i) {
        this.i = i;
    }

    boolean isDiaUtil(int i) {
        return i > DOMINGO.i && i < SABADO.i;
    }


}
