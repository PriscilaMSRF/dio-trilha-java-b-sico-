import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner 
        Scanner scanner=new Scanner(System.in).useLocale(Locale.US);
        //Exibir as mensagens para o nosso usuário
        System.out.println("Digite o numero da sua conta");int conta=scanner.nextInt();

        System.out.println("Digite o numero da sua agência");
        String agencia=scanner.next();

        System.out.println("Digite o seu nome");String nome=scanner.next();

        System.out.println("Digite o saldo da sua conta");double saldo=scanner.nextDouble();

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        System.out.println ("Olá,"  + nome +"");
        System.out.println ("Obrigado por criar uma conta em nosso banco, sua Agência é "+agencia+"");
        System.out.println ("Conta "+conta+"");
        System.out.println ("E seu saldo " +saldo+"");
        System.out.println ("Já esta disponivel para saque");
        
    }
}
