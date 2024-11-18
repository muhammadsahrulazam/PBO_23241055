public class GajiKaryawan {
    // Deklarasi atribut private
    private int gajiPokok;
    private int tunjangan;
    private double pajak; // dalam persen

    // Setter untuk gaji pokok
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Getter untuk gaji pokok
    public int getGajiPokok() {
        return gajiPokok;
    }

    // Setter untuk tunjangan
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Getter untuk tunjangan
    public int getTunjangan() {
        return tunjangan;
    }

    // Setter untuk pajak (dalam persen)
    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    // Getter untuk pajak (dalam rupiah)
    public double getPajak() {
        return (gajiPokok + tunjangan) * (pajak / 100);
    }

    // Metode untuk mencetak gaji bersih
    public void cetakGajiBersih() {
        double totalPajak = getPajak();
        double gajiBersih = (gajiPokok + tunjangan) - totalPajak;
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Tunjangan: Rp " + tunjangan);
        System.out.println("Pajak (dalam rupiah): Rp " + totalPajak);
        System.out.println("Gaji Bersih: Rp " + gajiBersih);
    }

    public static void main(String[] args) {
        // Membuat objek GajiKaryawan
        GajiKaryawan karyawan = new GajiKaryawan();

        // Mengatur nilai gaji pokok, tunjangan, dan pajak
        karyawan.setGajiPokok(7000000); // Gaji pokok Rp 7.000.000
        karyawan.setTunjangan(1000000); // Tunjangan Rp 1.000.000
        karyawan.setPajak(10);          // Pajak 10%

        // Mencetak gaji bersih
        karyawan.cetakGajiBersih();
    }
}
