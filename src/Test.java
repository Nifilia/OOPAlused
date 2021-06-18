import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList<String> teemad = new ArrayList<>();
        teemad.add("OOP");
        teemad.add("Pärilus");
        teemad.add("Kapseldus");
        teemad.add("Kompositsioon");
        Opetaja opetaja = new Opetaja("Anna");

        ArrayList<Opilane> ita20 = new ArrayList<>();
        Opilane henri = new Opilane("Henri");
        Opilane karl = new Opilane("Karl");
        ita20.add(henri);
        ita20.add(karl);

        oppetoo(teemad, ita20, opetaja);

        teadmisteKontroll(ita20);
        henri.unusta("Kapseldus");
        teadmisteKontroll(ita20);
        henri.opib("Kapseldus");
        teadmisteKontroll(ita20);
    }

    public static void teadmisteKontroll(ArrayList<Opilane> grupp){
        for (Opilane opilane : grupp){
            System.out.println("Opilane " + opilane.getNimi() + " teadmised: ");
            for (String teadmine : opilane.getTeadmised()){
                System.out.println(teadmine);
            }
            System.out.println();
        }
    }

    public static void oppetoo(ArrayList<String> teemad, ArrayList<Opilane> grupp, Opetaja opetaja){
        for (String teema : teemad){
            for (Opilane opilane : grupp){
                opetaja.opetab(opilane, teema);
            }
        }
    }
}