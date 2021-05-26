import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        ArrayList<String> opilased = new ArrayList<>();
        File fail = new File("C:\\Users\\Andero\\IdeaProjects\\oop_alused\\OOPAlused\\src\\nimekiri.txt");
        Scanner sisendFailist = null;
        try {
            sisendFailist = new Scanner(fail);
        } catch (Exception e){
            System.out.println("Faili pole - " + e.getMessage());
        }

        while (sisendFailist.hasNextLine()){
            String rida = sisendFailist.nextLine();
            opilased.add(rida);
        }
        sisendFailist.close();

        LocalDateTime tananeKuupaev = LocalDateTime.now();
        System.out.println("Tänane kuupäev ilma vormistuseta on: " + tananeKuupaev);
        DateTimeFormatter kuupaevaVormindus = DateTimeFormatter.ofPattern("dd/MM/yyy HH:MM:ss");
        String tananeKuupaevVormistatud = tananeKuupaev.format(kuupaevaVormindus);
        System.out.println("tänane vormistatud kuupäev on: " + tananeKuupaevVormistatud);

        int indeks = Integer.parseInt(tananeKuupaevVormistatud);
        System.out.println(opilased.get(indeks - 1));
        /*
        for (int i = 0; i < opilased.size(); i++){
            System.out.println(i + " " + opilased.get(i));
        }

         */
    }
}