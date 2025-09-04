import java.util.Scanner;
import java.math.BigInteger;

public class O3 {

    // Iterativ beregning av n! med BigInteger
    static BigInteger factorial(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // Les til vi får gyldig heltall n > 0
        while (true) {
            System.out.print("Skriv heltall n > 0: ");
            if (!sc.hasNextInt()) {
                System.out.println("Ugyldig input – skriv et heltall.");
                sc.next(); // forkast ugyldig token
                continue;
            }
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Ugyldig verdi – n må være > 0.");
                continue;
            }
            break;
        }

        BigInteger result = factorial(n);
        System.out.println(n + "! = " + result);
    }
}
