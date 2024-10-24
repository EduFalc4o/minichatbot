import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MiniChatBot bot = new MiniChatBot();

        Scanner sc = new Scanner(System.in);
        System.out.println("oque voce quer ?");

        String resposta;

        boolean conversando = true;

        while (conversando) {
            resposta = sc.nextLine();

            String respostaDoBot = bot.responder(resposta);

            System.out.println(respostaDoBot);
        }
    }
}