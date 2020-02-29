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
        Handphone HP = new Handphone();

        HP.setMerek("Samsung");
        HP.setTipe("J7 PRO");
        HP.setWarna("Black");
        HP.setHarga(3700000);

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