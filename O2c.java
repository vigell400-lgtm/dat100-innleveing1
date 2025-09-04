import java.util.Scanner;

public class O2c {

    static char karakter(int p) {
        if (p >= 90) return 'A';
        if (p >= 80) return 'B';
        if (p >= 60) return 'C';
        if (p >= 50) return 'D';
        if (p >= 40) return 'E';
        return 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int poeng;

            // les inn på nytt helt til vi får gyldig heltall i [0,100]
            while (true) {
                System.out.print("Student " + i + " – poeng (0–100): ");

                if (!sc.hasNextInt()) {
                    System.out.println("Ugyldig input – skriv et heltall.");
                    sc.next(); // forkast ugyldig token (tekst, desimal, etc.)
                    continue;
                }

                poeng = sc.nextInt();
                if (poeng < 0 || poeng > 100) {
                    System.out.println("Ugyldig poengsum – må være mellom 0 og 100. Prøv igjen.");
                    continue;
                }
                break; // gyldig poengsum
            }

            System.out.println("Karakter: " + karakter(poeng));
        }
    }
}
