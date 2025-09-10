import java.util.Scanner;

public class O1Trinnskatt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Oppgi bruttoinntekt (i kroner): ");
        double inntekt = sc.nextDouble();

        double skatt = 0;

      
        if (inntekt > 217400) {
            double grunnlag = Math.min(inntekt, 306050) - 217400;
            skatt += grunnlag * 0.017;
        }

        if (inntekt > 306050) {
            double grunnlag = Math.min(inntekt, 697150) - 306050;
            skatt += grunnlag * 0.04;
        }

        if (inntekt > 697150) {
            double grunnlag = Math.min(inntekt, 942400) - 697150;
            skatt += grunnlag * 0.137;
        }

        if (inntekt > 942400) {
            double grunnlag = Math.min(inntekt, 1410750) - 942400;
            skatt += grunnlag * 0.167;
        }

        if (inntekt > 1410750) {
            skatt += (inntekt - 1410750) * 0.177;
        }

        System.out.println("Trinnskatt 2025: " + skatt + " kr");
    }
}