import java.util.List;

public class MiniChatBot {

    public String responder(String resposta) {

        if (resposta.equalsIgnoreCase("ola") || resposta.equalsIgnoreCase("oi")) {
            return ("Olá, como posso lhe ajudar hoje");
        }
        if (resposta.equalsIgnoreCase("qual seu nome") || resposta.equalsIgnoreCase("como voce se chama")) {
            return ("Prazer me chamo MiniChat Bot");
        }
        if (resposta.equalsIgnoreCase("como voce esta?")) {
            return ("estou bem e funcionando perfeitamenete");
        }
        if (resposta.equalsIgnoreCase("Sair")) {
            return ("ok, até mais");
        }
        return "Não entendi!";
    }
}
