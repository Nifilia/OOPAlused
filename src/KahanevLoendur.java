public class KahanevLoendur {
    private int vaartus;   // objekti muutuja (atribuut), mis hoiab meeles loenduri väärtust

    public KahanevLoendur(int vaartusAlguses) {
        this.vaartus = vaartusAlguses;
    }

    public void valjastaVaartus() {
        System.out.println("väärtus: " + this.vaartus);
    }

    public void kahane() {
        vaartus = vaartus - 1;
    }

    // ja siia ülejäänud vajalikud meetodid
}