package src.main.java;

public class Aritmatika {
    private int angka1;
    private int angka2;
    
    public Aritmatika(int angka1, int angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }
    
    public int tambah() {
        return angka1 + angka2;
    }
    
    public int kurang() {
        return angka1 - angka2;
    }
    
    public int kali() {
        return angka1 * angka2;
    }
    
    public int bagi() {
        if (angka2 != 0) {
            return angka1 / angka2;
        } else {
            System.out.println("Error: Tidak dapat membagi dengan nol!");
            return 0;
        }
