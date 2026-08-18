import java.util.Scanner;

public class EstruturaSequencial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int produto1 = sc.nextInt();
        sc.nextLine();

        int quantidade1 = sc.nextInt();
        sc.nextLine();

        double valor1 = sc.nextDouble();
        sc.nextLine();

        int produto2 = sc.nextInt();
        sc.nextLine();

        int quantidade2 = sc.nextInt();
        sc.nextLine();

        double valor2 = sc.nextDouble();
        sc.nextLine();

        double total = (quantidade1 * valor1) + (quantidade2 * valor2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();

        }
    }