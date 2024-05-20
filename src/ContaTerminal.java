
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        int numeroDaAgencia = scanner.nextInt();

        System.out.println("Por favor, digite a Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente!");
        String nomeDoCliente = scanner.next();

        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nomeDoCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+" conta "+numeroDaAgencia+" e seu saldo "+saldo+" já está disponível para saque");


    }
}
