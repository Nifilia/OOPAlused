import java.util.ArrayList;

public class Opilane {
    ArrayList<String> teadmised = new ArrayList<>();
    private String nimi;

    public Opilane(String nimi){
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public void opib(String teema){
        teadmised.add(teema);
    }

    public ArrayList<String> getTeadmised(){
        return teadmised;
    }

    public void unusta(String teema){
        teadmised.remove(teema);
    }
}
