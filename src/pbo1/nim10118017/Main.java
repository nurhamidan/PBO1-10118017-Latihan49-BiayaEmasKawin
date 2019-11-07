package pbo1.nim10118017;

import java.util.Calendar;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class main untuk class Emas.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Simulasi tanggal alias tanggal palsu, tanggal diatur pada bulan oktober sesuai studi kasus
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, 10, 15);
        
        
        Emas emas = new Emas();
        emas.setJenis("Emas Kawin");
        emas.setBerat(15.7);
        emas.setHargaPadaBulan("Oktober", 570000);
        System.out.println("Jenis\t\t\t: " + emas.getJenis());
        System.out.println("Berat\t\t\t: " + emas.getBerat());
        System.out.println("Harga Per Gram\t\t: Rp. " + emas.getHargaPadaBulan(emas.getDaftarBulan()[calendar.get(Calendar.MONTH) - 1]));
        System.out.println("Total Harga Emas\t: Rp. " + emas.hitungTotalHarga("Oktober"));
    }
    
}
