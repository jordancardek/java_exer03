import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois numeros para a soma: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double soma = num1 + num2;
        scan.close();
        System.out.println("O valor da soma: " + soma);
    }
}
