import java.util.Scanner;

public class O2Karakterskala {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Student " + i + " – poeng (0–100): ");
            int poeng = sc.nextInt();

           while (poeng < 0 || poeng > 100) {
                System.out.print("Ugyldig poengsum. Prøv igjen: ");
                poeng = sc.nextInt();
            }

            char karakter;
            if (poeng >= 90) karakter = 'A';
            else if (poeng >= 80) karakter = 'B';
            else if (poeng >= 60) karakter = 'C';
            else if (poeng >= 50) karakter = 'D';
            else if (poeng >= 40) karakter = 'E';
            else karakter = 'F';

            System.out.println("Karakter: " + karakter);
        }
    }
}
