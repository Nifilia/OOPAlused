public class Opetaja {
    private String nimi;

    public Opetaja(String nimi){
        this.nimi = nimi;
    }

    public void opetab(Opilane opilane, String teema){
        opilane.opib(teema);
    }
}
