public class SLLMain24 {
    public static void main(String[] args) {

        SingleLinkedList24 sll = new SingleLinkedList24();

        Mahasiswa24 mhs1 = new Mahasiswa24("111", "Anton", "TI-1A", 3.5);
        Mahasiswa24 mhs2 = new Mahasiswa24("112", "Budi", "TI-1B", 3.7);
        Mahasiswa24 mhs3 = new Mahasiswa24("113", "Cindy", "TI-1C", 3.8);
        Mahasiswa24 mhs4 = new Mahasiswa24("114", "Dina", "TI-1D", 3.9);

        sll.print();

        sll.addFirst(mhs1);
        sll.print();

        sll.addLast(mhs2);
        sll.print();

        sll.insertAfter("Anton", mhs3);
        sll.print();

        sll.insertAt(2, mhs4);
        sll.print();

        System.out.println("Index Budi : " + sll.indexOf("Budi"));

        System.out.println("Data index 2");
        sll.getDataByIndex(2).tampilInformasi();

        sll.removeFirst();
        sll.print();

        sll.removeLast();
        sll.print();

        sll.remove("Cindy");
        sll.print();
    }
}