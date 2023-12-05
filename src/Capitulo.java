import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    private String texto;
    private Personagem Cebolinha;
    private Personagem Cascao;
    private int incrementoCebolinha;
    private int incrementoCascao;
    private Scanner plano;
    private ArrayList<Escolhas> escolhas;

    public Capitulo(String texto, Personagem Cebolinha, Personagem Cascao, int incrementoCebolinha, int incrementoCascao, Scanner plano) {
        this.texto = texto;
        this.Cebolinha = Cebolinha;
        this.Cascao = Cascao;
        this.incrementoCascao = incrementoCascao;
        this.incrementoCebolinha = incrementoCebolinha;
        this.plano = plano;
        this.escolhas = new ArrayList<>();
    }

    public String getTexto() {
        return texto;
    }

    public Personagem getCebolinha() {
        return Cebolinha;
    }

    public Personagem getCascao() {
        return Cascao;
    }

    private void mostrar() {
        System.out.println(getTexto());
        getCebolinha().atualizarCoragem(incrementoCebolinha);
        getCascao().atualizarCoragem(incrementoCascao);

        System.out.println(getCebolinha());
        System.out.println(getCascao());

        for (int i = 0; i < escolhas.size(); i++) {
            System.out.println("- " + escolhas.get(i).getTexto());
        }

        System.out.println();
        System.out.println(". . .");
        System.out.println();
    }

    private Capitulo escolher() {
        int opcaoEscolhida = 0;
        String escolha;
        boolean escolhaCorreta = false;

        if (escolhas.isEmpty()) {
            System.out.println("OBRIGADO POR PARTICIPAR DAS AVENTURAS DE CASCAO E CEBOLINHA, ESPERO QUE TENHA CHEGADO AO FINAL DESEJADO!!");
            System.exit(0);
        } else {
            while (!escolhaCorreta) {
                escolha = plano.nextLine();
                for (int i = 0; i < escolhas.size(); i++) {
                    if (escolha.equals(escolhas.get(i).getTexto())) {
                        escolhaCorreta = true;
                        opcaoEscolhida = i;
                    }
                }
                if (!escolhaCorreta) {
                    System.out.println("Escolha inválida, Tente novamente!");
                    escolhaCorreta = false;
                    return null;
                }
            }
        }
        return escolhas.get(opcaoEscolhida).getProximo();
    }

    public void executar() {
        mostrar();
        Capitulo proximoCapitulo = escolher();

        if (proximoCapitulo != null) {
            proximoCapitulo.executar();
        } else {
            System.out.println("Obrigado por jogar!");
            System.exit(0);
        }
    }

    public void adicionarEscolha(String texto, Capitulo proximoCapitulo) {
        Escolhas escolha = new Escolhas(texto, proximoCapitulo);
        escolhas.add(escolha);
    }
}
