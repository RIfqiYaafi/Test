public class Autocomplete {

    private int angka;
    private String teks;

    public void setAngka(int nilai) {
        angka = nilai;
    }

    public int getAngka() {
        return angka;
    }

    public void setTeks(String nilai) {
        teks = nilai;
    }

    public String getTeks() {
        return teks;
    }

    public void tampilkanNilai() {
        System.out.println("Nilai angka: " + angka);
        System.out.println("Nilai teks: " + teks);
    }

    public static void main(String[] args) {
        Autocomplete contoh = new Autocomplete();
        contoh.setAngka(10);
        contoh.setTeks("Contoh teks");
        contoh.tampilkanNilai();
    }
}
