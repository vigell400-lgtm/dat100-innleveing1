import java.util.Scanner;

public class O1{

    // Trinnskatt 2025 – innslagspunkter (kr) og satser
    // Kilde: Skatteetaten (2025)
    static final double T0 = 217_400;   // 0–217 400: 0 %
    static final double T1 = 306_050;   // 217 401–306 050: 1,7 %
    static final double T2 = 697_150;   // 306 051–697 150: 4,0 %
    static final double T3 = 942_400;   // 697 151–942 400: 13,7 %
    static final double T4 = 1_410_750; // 942 401–1 410 750: 16,7 %
    // Fra og med 1 410 751: 17,7 %

    static final double R1 = 0.017;
    static final double R2 = 0.040;
    static final double R3 = 0.137;
    static final double R4 = 0.167;
    static final double R5 = 0.177;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Oppgi bruttoinntekt (i kroner): ");
        double inntekt = sc.nextDouble();
        double skatt = trinnskatt2025(inntekt);

        // Skriv både med øre og avrundet til hele kroner
        long heltKr = Math.round(skatt);
        System.out.printf("Trinnskatt 2025: %.2f kr (%d kr avrundet)%n", skatt, heltKr);
    }

    // Beregn trinnskatt for 2025 ved å summere skatt på hver del over innslagspunkt
    static double trinnskatt2025(double inntekt) {
        double skatt = 0.0;

        // Trinn 1: over 217 400 til og med 306 050
        skatt += sats(inntekt, T0, T1, R1);

        // Trinn 2: over 306 050 til og med 697 150
        skatt += sats(inntekt, T1, T2, R2);

        // Trinn 3: over 697 150 til og med 942 400
        skatt += sats(inntekt, T2, T3, R3);

        // Trinn 4: over 942 400 til og med 1 410 750
        skatt += sats(inntekt, T3, T4, R4);

        // Trinn 5: over 1 410 750
        if (inntekt > T4) {
            skatt += (inntekt - T4) * R5;
        }
        return Math.max(0.0, skatt);
    }

    // Skatt for et trinn: rate på beløpet mellom (lower, upper]
    static double sats(double inntekt, double lower, double upper, double rate) {
        if (inntekt <= lower) return 0.0;
        double grunnlag = Math.min(inntekt, upper) - lower; // >lower, ≤upper
        return Math.max(0.0, grunnlag) * rate;
    }
}

/* ppgavetekst: En trinnskatt er en progressiv skatt på bruttolønn som beregnes når inntekten er høyere enn 217 400 kr.

Se https://www.skatteetaten.no/satser/trinnskatt/?year=2025#rateShowYear for aktuelle satser.

Lag et program som leser inn bruttoinntekt, beregner og skriver ut trinnskatten dvs. det beløpet som personen skal betale i trinnskatt.

 */


