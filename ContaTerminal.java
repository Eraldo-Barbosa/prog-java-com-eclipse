 
import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        String nome;
        int agencia;
        float conta;
        double saldo=23748;
        
        System.out.println("Digite o seu nome: ");
          nome=ler.nextLine();
        System.out.println("Digite o numero de sua agençia: ");
          agencia=ler.nextInt(); 
         System.out.println("Digite o numero da sua conta: ");
              conta=ler.nextFloat();
              
              System.out.println("Olá" +nome);
               System.out.println(" obrigado por criar uma conta em nosso banco");
                System.out.println("Sua agencia e:" +agencia);
                System.out.println("O numero da sua conta e:" +conta);
                System.out.println("O seu saldo:" +saldo+     "Esta disponivel para saque");
                
              
    }
    }

 