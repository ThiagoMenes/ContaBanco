import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        //Criando o Objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja Bem-vindo ao Banco S.A.");
        System.out.println("Agora iremos criar a sua Conta :) ");

        System.out.println("Por Favor, Digite o seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Obrigado, Agora digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Perfeito, poderia digitar o número da sua Conta?: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Maravilha, e quanto gostaria de depositar inicialmente?:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque" );


    }
}
