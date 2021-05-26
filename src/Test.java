import java.util.Scanner;

public class Test {
    static String banner(String reklaamlause) {
        String reklaamlauseSuurteTahtedega = reklaamlause.toUpperCase();
        return reklaamlauseSuurteTahtedega;
    }
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Mitu korda kuvada reklaamlauset: ");

        int kordamine = sisend.nextInt();

        sisend = new Scanner(System.in);
        System.out.println("Sisesta reklaamlause: ");
        String lause = sisend.nextLine();

        int kord = 1;
        while(kord <= kordamine) {
            System.out.println(banner(lause));
            kord++;
        }
    }
}