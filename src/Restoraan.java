public class Restoraan {
    private static String restoNimi;
    private String sook;

    Restoraan(String restoNimi, String sook){
        this.restoNimi = restoNimi;
        this.sook = sook;
    }
    static void avaResto(){
        System.out.println(restoNimi + " on avatud");
    }
    public static void main(String[] args){
        avaResto();
    }
}