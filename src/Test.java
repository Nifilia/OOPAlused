import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Täringute arv: ");

        int taringuteArv = sisend.nextInt();

        while(true){
            int taring = (int)Math.round(Math.random() * 6);
            System.out.println(taring);
            if(taring == taringuteArv){
                break;
            }
        }
    }
}