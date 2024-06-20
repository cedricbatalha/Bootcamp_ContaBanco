import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args) {

            Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

            //comentário
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Seu nome é " + nome);

            //To Do: conhecer e importar a classe Scanner
            //Exibir as mensagens para o nosso usuário
            //Obter pela scanner os valores digitados no terminal
            //Exibir a mensagem conta criada


        }
    }