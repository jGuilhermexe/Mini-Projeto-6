public class Personagem {
    private String nome;
    private int coragem;

    public Personagem(String nome, int coragem) {
        this.nome = nome;
        setCoragem(coragem);
    }

    public Personagem(String nome) {
        this(nome, 100);
    }

    public String getNome() {
        return nome;
    }

    public int getCoragem() {
        return coragem;
    }

    private void setCoragem(int coragem) {
        if (coragem >= 0) {
            this.coragem = coragem;
        } else {
            System.out.println("A energia do Personagem atingiu a 0. Fim de jogo. ");
        }
    }

    public void atualizarCoragem(int incremento) {
        if (incremento != 0) {
            setCoragem(this.coragem + incremento);
            System.out.println("Com isso, os pontos de coragem do " + this.nome + " foram para " + this.coragem);
        }
    }

    @Override
    public String toString() {
        return nome + ": Coragem " + coragem;
    }
}
