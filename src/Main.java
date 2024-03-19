import java.util.Scanner;
import com.banconosso.service.ContaTerminal;

public class Main {
    public static void main(String[] args) {
        int account;
        double balance;
        String bankbranch;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Banco Nosso!");
        System.out.print("Digite o Nome: ");
        name = sc.nextLine();
        System.out.print("Digite a Agência: ");
        bankbranch = sc.nextLine();
        System.out.print("Digite a Conta: ");
        account = sc.nextInt();
        System.out.print("Deposite o Valor inicial:  ");
        balance = sc.nextDouble();
        ContaTerminal accountPrompt = new ContaTerminal();
        accountPrompt.printbalance(account, balance, bankbranch, name);


    }
}