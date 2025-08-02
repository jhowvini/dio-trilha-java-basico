import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //TODO: Exibir as mensagens para o usuário
        System.out.println("-- O numero da conta deve ter âpenas 4 digitos Ex:0000 --");
        System.out.println("   Por favor, digite o número da Conta !");
        System.out.print("   Conta: ");
        //TODO: Obter pelo scanner os valores digitados no terminal
        var namber = scanner.nextInt();

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("-- O numero da conta deve possuir 4 digitos o ultimo separado por (-) Ex: 000-X --");
        System.out.println("   Por favor, digite o número da Agência !");
        System.out.print("   Agência: ");
        //TODO: Obter pelo scanner os valores digitados no terminal
        var agencia = scanner.next();

        //TODO: Limpa o ENTER pendente no buffer
        scanner.nextLine();

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("-- Informar âpenas o primeiro nome Ex: Maria Clara --");
        System.out.println("   Por favor, digite o seu nomme !");
        System.out.print("   Nome: ");
        //TODO: Obter pelo scanner os valores digitados no terminal
        var nameClient = scanner.nextLine();

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("-- Informar o saldo dessa conta Ex: R$100,00 --");
        System.out.println("   Por favor, digite o seu saldo !");
        System.out.print("   R$: ");
        //TODO: Obter pelo scanner os valores digitados no terminal
        var saldo = scanner.nextFloat();

        //TODO: Exibir a mensagem conta criada
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("  PARABENS!!!");
        System.out.printf("   Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$%s já está disponível para saque\n", nameClient, agencia, namber, saldo);


    }
}
