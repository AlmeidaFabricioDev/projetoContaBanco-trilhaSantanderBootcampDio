import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do(a) Cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da Conta: ");
        int numero = sc.nextInt();
        System.out.println("Por favor, digite o saldo da Conta: ");
        float saldo = sc.nextFloat();

        System.out.println("Nome do cliente é: " + nomeCliente);
        System.out.println("Agência é: " + agencia);
        System.out.println("Conta é: " + numero);
        System.out.println("Saldo é: " + saldo);

        sc.close();
        
    }
}
