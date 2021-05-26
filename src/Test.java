import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisesta, mitu korda tuleb äratada: ");

        int mituKorda = sisend.nextInt();
        int kord = 1;

        while (kord <= mituKorda) {
            System.out.println("Tõuse ja sära!");
            kord++;
        }
    }
}