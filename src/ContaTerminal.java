import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome:");
        String nome = teclado.nextLine();
        System.out.println("Por favor, digite o numero da Agência:");
        String agencia = teclado.nextLine();
        System.out.println("Por favor, digite o numero da conta:");
        int conta = teclado.nextInt();
        System.out.println("Por gentileza, digite seu saldo");
        double saldo = teclado.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já esta disponivel para saque.", nome, agencia, conta, saldo);



    }
}