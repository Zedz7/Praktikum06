public class MahasiswaDemo06 {
    public static void main(String[] args) {
        MahasiswaBerprestasi06 data = new MahasiswaBerprestasi06();
        data.tambah();

        System.out.println("\nData mahasiswa sebelum sorting: ");
        data.tampil();
        data.bubblesort();
        System.out.println("\nData mahasiswa setelah sorting: ");
        data.tampil();
    }
}