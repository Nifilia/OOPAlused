public class Loom {
    private int jalgadeArv = 4;
    private String nimi;

    public Loom(String nimi) {
        this.nimi = nimi;
    }

    public void jalutan(){
        System.out.println("Mina liigun");
    }
    public void haal(){
        System.out.println("Mul on hääl");
    }
    public void soon(){
        System.out.println("Mina söön");
    }
}
