import java.util.Scanner;
public class MahasiswaBerprestasi06 {
    Mahasiswa06 [] listMhs;
    int jumlah;
    Scanner input = new Scanner(System.in);

    void tambah() {
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlah = input.nextInt();
        input.nextLine();

        listMhs = new Mahasiswa06[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = input.nextLine();

            System.out.print("Nama  : ");
            String nama = input.nextLine();

            System.out.print("Kelas : ");
            String kelas = input.nextLine();

            System.out.print("IPK   : ");
            double ipk = input.nextDouble();
            input.nextLine();

            listMhs[i] = new Mahasiswa06(nim, nama, kelas, ipk);
        }
    }
    void tampil() {
        for (int i = 0; i < jumlah; i++) {
            listMhs[i].tampilInformasi();
            System.out.println("---------------------------------");
        }
    }
    void bubblesort() {
        for (int i = 0; i < jumlah - 1; i++) {
            for (int j = 1; j < jumlah - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa06 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa06 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa06 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}