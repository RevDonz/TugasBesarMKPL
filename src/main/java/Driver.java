import src.main.java.Counter;

public class Driver {
    public static void main(String[] args) {
        Aritmatika aritmatika = new Aritmatika(10, 5);
        
        int hasilTambah = aritmatika.tambah();
        System.out.println("Hasil Penjumlahan: " + hasilTambah);
        
        int hasilKurang = aritmatika.kurang();
        System.out.println("Hasil Pengurangan: " + hasilKurang);
        
        int hasilKali = aritmatika.kali();
        System.out.println("Hasil Perkalian: " + hasilKali);
        
        int hasilBagi = aritmatika.bagi();
        System.out.println("Hasil Pembagian: " + hasilBagi);
    }
}
