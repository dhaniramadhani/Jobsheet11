package Tugas;
import java.util.Scanner;
public class Main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList24 antrian = new QueueLinkedList24();
        int pilih;
        do {

            System.out.println("\n=== MENU ANTRIAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Tampilkan Depan");
            System.out.println("5. Tampilkan Belakang");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa24 mhs =
                            new Mahasiswa24(nim, nama, kelas);

                    antrian.enqueue(mhs);

                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.tampilSemua();
                    break;

                case 4:
                    antrian.tampilDepan();
                    break;

                case 5:
                    antrian.tampilBelakang();
                    break;

                case 6:
                    antrian.jumlahAntrian();
                    break;

                case 7:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            }

        } while (pilih != 0);
    }
}

