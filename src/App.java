import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner plano = new Scanner(System.in);
        Personagem Cebolinha = new Personagem("Cebolinha", 0);
        Personagem Cascao = new Personagem("Cascao", 0);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~ AS AVENTURAS DE CEBOLINHA E CASCAO ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Capitulo capitulo1 = new Capitulo("Cebolinha e Cascao estao brincando de pique-assusta! Cebolinha está contando em quanto Cascao se esconde. Onde Cascao deve se esconder?", Cebolinha, Cascao, 0, 0, plano);
        Capitulo final1 = new Capitulo("Cascao se esconde dentro do barril. Mal ele sabia que o Barril, era onde a Mae do Franjinha colocava água. Cascao toma um belo de um banho dagua. Ele sai correndo assustado, Cebolinha cai na risada!! ", Cebolinha, Cascao, +150, -100, plano);
        Capitulo capitulo11 = new Capitulo("Cascão se esconde numa caixa que estava super próxima onde Cebolinha estava contando, o que ele deve fazer?", Cebolinha, Cascao, +50, +70, plano);
        Capitulo final2 = new Capitulo("Cascao observa a movimentação de Cebolinha pelo buraco da caixa. Quando Cebolinha se aproxima, ele dá um grito e pula e joga a caixa pro alto. Cebolinha se assusta. Cascao vence o jogo!", Cebolinha, Cascao, -50, +150, plano);
        Capitulo final11 = new Capitulo("Ele arrasta a caixa na expectativa de assustar Cebolinha, o que ele nao sabia, e que Cebolinha já desconfiava, então Cebolinha se aproxima da caixa, dá um tapao e grita BUU. Cascao se assusta e sai correndo. Cebolinha sai na gargalhada.", Cebolinha, Cascao, +100, -70, plano);

        capitulo1.adicionarEscolha("Esconder no Barril", final1);
        capitulo1.adicionarEscolha("Esconder na Caixa", capitulo11);
        capitulo11.adicionarEscolha("Arrastar a caixa", final11);
        capitulo11.adicionarEscolha("Gritar e pular", final2);

        Capitulo raiz = capitulo1;

        raiz.executar();
    }
}
