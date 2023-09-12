package DIO_Trilha_java_basico;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicita ao usuário que insira o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        String numero = scanner.nextLine();

        // Solicita ao usuário que insira o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicita ao usuário que insira o saldo
        System.out.print("Por favor, digite o saldo: ");
        String saldoString = scanner.nextLine();
        double saldo = Double.parseDouble(saldoString.replace(",", "."));


        // Fecha o objeto Scanner
        scanner.close();

        // Exibe a mensagem com os dados da conta
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);

        System.out.println(mensagem);
    }
}
