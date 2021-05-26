import java.util.Scanner;

public class Test {
    static int mahlapakkidearv(double ounteKogus) {
        int pakkidArv = (int)Math.round(ounteKogus * 0.4 / 3);
        return pakkidArv;
    }
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisesta õunte kogus kilogrammides: ");

        double ountekogus = sisend.nextDouble();

        System.out.println(mahlapakkidearv(ountekogus));
    }
}