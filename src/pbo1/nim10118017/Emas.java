package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Melakukan perhitungan harga total untuk emas dengan berat
 *                        yang ditentukan.
 * 
 */
public class Emas {
    private String jenis;
    private double berat;
    private String[] daftarBulan = new String[]{"JANUARI", "FEBRUARI", "MARET", "APRIL", "MEI", "JUNI", "JULI", "AGUSTUS", "SEPTEMBER", "OKTOBER", "NOVEMBER", "DESEMBER"};
    private float[] daftarHarga = new float[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public String[] getDaftarBulan() {
        return daftarBulan;
    }

    public void setDaftarBulan(String[] daftarBulan) {
        this.daftarBulan = daftarBulan;
    }

    public float[] getDaftarHarga() {
        return daftarHarga;
    }

    public void setDaftarHarga(float[] daftarHarga) {
        this.daftarHarga = daftarHarga;
    }
    
    //Menempatkan / mengatur harga pada array
    public void setHargaPadaBulan(String bulan, float harga) {
        for (int i = 0; i < daftarBulan.length; i++) {
            if (bulan.toUpperCase().equals(daftarBulan[i])) {
                daftarHarga[i] = harga;
            }
        }
    }
    
    //Mendapatkan harga per bulannya
    public float getHargaPadaBulan(String bulan) {
        float harga = 0;
        for (int i = 0; i < daftarBulan.length; i++) {
            if (bulan.toUpperCase().equals(daftarBulan[i])) {
                harga = daftarHarga[i];
            }
        }
        return harga;
    }
    
    //Menghitung seluruh harga
    public float hitungTotalHarga(String bulan) {
        float harga = 0;
        for (int i = 0; i < daftarBulan.length; i++) {
            if (bulan.toUpperCase().equals(daftarBulan[i])) {
                harga = daftarHarga[i];
            }
        }
        return (float) berat * harga;
    }
}
