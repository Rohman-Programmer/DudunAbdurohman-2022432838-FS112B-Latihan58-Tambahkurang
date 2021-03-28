/**
 * @author
 * NAMA     : Dudun Abdurohman
 * KELAS    : PBO2
 * NIM      : 2022432838
 * Deskripsi Program : Program penjumlahan dan pengurangan menggunakan inheritance,
 * dengan nilai X dan Y ditentukan di konstruktor Bilangan
 *
 */
public class Main {
    public static void main(String[] args) {
        JumlahBilangan jumlahBil = new JumlahBilangan();
        SelisihBilangan selisihBil = new SelisihBilangan();

        jumlahBil.tampilHasilJumlah();
        selisihBil.tampilHasilSelisih();
    }
}
