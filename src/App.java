import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        EntradaUser user = new EntradaUser();

        System.out.print("Nome: ");
        user.nome = sc.nextLine();
        System.out.print("Idade: ");
        user.idade = sc.nextInt();
        boolean verifIdade = user.verificaIdade();

        if (verifIdade == true) {
            System.out.println("Idade permitida! ");
            
            System.out.print("Ingresso: ");
            user.ingresso = sc.nextInt();
            boolean verifIngresso = user.verificaIngresso();

            if (verifIngresso == false) {
                System.out.println("Ingresso cadastrado!");
                user.exibirDetalhes();
            }else {
                System.out.println("Ingresso incorreto!");
            }

        } else {
            System.out.println("Idade não permitida!");
        }

        sc.close();
    }
}
