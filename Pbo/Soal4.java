import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Handphone {

    public String merek;
    public String tipe;
    public String warna;
    public int harga;

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getMerek() {
        return this.merek;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getTipe() {
        return this.tipe;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return this.warna;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return this.harga;
    }

}

class Program {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Handphone HP = new Handphone();

        try {
            System.out.println("Masukkan Merek HP");
            String merek = br.readLine();
            System.out.println("Masukkan Tipe HP");
            String tipe = br.readLine();
            System.out.println("Masukkan Warna HP");
            String warna = br.readLine();
            System.out.println("Masukkan Harga HP");
            Integer harga = Integer.parseInt(br.readLine());
            HP.setMerek(merek);
            HP.setTipe(tipe);
            HP.setWarna(warna);
            HP.setHarga(harga);
        } catch (IOException e) {
            System.out.println("Masukkan Data dengan benar : " + e);
        }

        int discountPersentage = 10;

        System.out.println("======================================");
        System.out.println("DAFTAR HARGA PONSEL DAN SPESIFIKASINYA");
        System.out.println("======================================");
        System.out.println("Merek HP = " + HP.getMerek());
        System.out.println("Tipe HP = " + HP.getTipe());
        System.out.println("Warna HP = " + HP.getWarna());
        System.out.println("Harga HP Sebelum diskon = RP" + HP.getHarga());

        int discount = HP.getHarga() * discountPersentage / 100;

        System.out.println("Harga HP Setelah diskon (" + discountPersentage + "%) = RP" + (HP.getHarga() - discount));
    }
}