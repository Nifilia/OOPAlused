public class Test {
    public static void main(String[] args) {
        Sein seinPohi = new Sein("Põhi sein");
        Sein seinLouna = new Sein("Lõuna sein");
        Sein seinLaane = new Sein("Laane sein");
        Sein seinIda = new Sein("Ida sein");

        Lagi lagi = new Lagi(2.5, "Helesinine");

        Voodi voodi = new Voodi("Kahele", 2, 2, 1, 70);

        Lamp lamp = new Lamp("Klassikaline", false);

        Magamistuba magamistuba = new Magamistuba("Külaliste magamistuba", seinPohi, seinLouna, seinLouna, seinIda, lagi, voodi, lamp);
        magamistuba.valmistaVoodi();
        magamistuba.valmistaLamp();
        System.out.println(magamistuba.getLamp().isSisseLulitatud());
    }
}