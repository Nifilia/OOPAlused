import java.util.HashMap;
import java.util.Scanner;

public class hash {
    public static void main(String[] args){
        HashMap<String, String> grupp = new HashMap<String, String>();
        grupp.put("matti", "mage");
        grupp.put("mikael", "mixu");
        grupp.put("arto", "arppa");
        for (String nimi: grupp.keySet()){
            System.out.println(nimi + " - " + grupp.get(nimi));
        }

        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisesta nimi: ");
        String nimi = sisend.nextLine();
        System.out.println(nimi + " - " + grupp.get(nimi));
    }
}