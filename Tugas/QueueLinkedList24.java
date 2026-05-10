package Tugas;
public class QueueLinkedList24 {
    Node24 front, rear;
    int size = 0;
    int max = 10;

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    void enqueue(Mahasiswa24 mhs) {

        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        Node24 baru = new Node24(mhs);

        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }

        size++;

        System.out.println("Mahasiswa berhasil masuk antrian");
    }

    void dequeue() {

        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Mahasiswa dipanggil:");
        front.data.tampil();

        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
    }

    void tampilDepan() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terdepan:");
            front.data.tampil();
        }
    }

    void tampilBelakang() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian paling belakang:");
            rear.data.tampil();
        }
    }

    void tampilSemua() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        Node24 temp = front;

        System.out.println("=== DAFTAR ANTRIAN ===");

        while (temp != null) {
            temp.data.tampil();
            System.out.println("----------------");
            temp = temp.next;
        }
    }

    void jumlahAntrian() {
        System.out.println("Jumlah antrian : " + size);
    }
} 
