public class Escolhas {
    private String texto;
    private Capitulo proximo;

    public Escolhas(String texto, Capitulo proximo) {
        this.texto = texto;
        this.proximo = proximo;
    }

    public String getTexto() {
        return texto;
    }

    public Capitulo getProximo() {
        return proximo;
    }
}
