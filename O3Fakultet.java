import java.util.Scanner;
import java.math.BigInteger;

public class O3Fakultet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Skriv et heltall n > 0: ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.print("Ugyldig verdi. Prøv igjen: ");
            n = sc.nextInt();
        }

        BigInteger fakultet = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            fakultet = fakultet.multiply(BigInteger.valueOf(i));
        }

        System.out.println(n + "! = " + fakultet);
    }
}
