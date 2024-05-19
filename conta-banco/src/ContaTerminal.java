import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {0
        Scanner scanner = new Scanner(System.in);
        
        // definindo o locale para o Brasil inves de US
        scanner.useLocale(Locale.forLanguageTag("pt-BR"));
        
        System.out.println("Por favor, digite o número da sua Agência:");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o número do seu usuário:");
        int usuario = scanner.nextInt();
        
        System.out.println("Por favor, digite o nome do cliente:");
        scanner.nextLine(); // limpa o buffer do scanner
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo inicial da conta:");
        double saldo = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco.\n" +
                           "Sua agência é " + agencia + ", conta " + usuario + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}
