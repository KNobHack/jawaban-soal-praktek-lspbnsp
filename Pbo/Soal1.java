class Anggota {

    // Mengikuti instruksi soal
    private int KdAnggota;
    private int JmlMobil;
    // 2 Atribut ini tidak dibutuhkan karena sudah ada di class Mobil
    // protected String KodeMobil;
    // protected String MerekMobil;

    public Anggota(int KdAnggota, int JmlMobil) {
        this.KdAnggota = KdAnggota;
        this.JmlMobil = JmlMobil;
    }

    public int getKdAnggota() {
        return this.KdAnggota;
    }

    public void setKdAnggota(int newKdAnggota) {
        this.KdAnggota = newKdAnggota;
    }

    // 2 Method ini tidak dibutuhkan karena sudah ada di class Mobil
    // public String setKodeMobil(){

    // }

    // public String setMerekMobil(){

    // }

    public int getJmlMobil() {
        return this.JmlMobil;
    }

    public void daftarMobil() {
        Mobil mobil1 = new Mobil("YG", "E 1201");
        Mobil mobil2 = new Mobil("G", "Toyota Rush");

        System.out.println("Daftar Mobil Yang DiPinjam :");
        System.out.println(mobil1.getMerekMobil() + " " + mobil1.getKdMobil());
        System.out.println(mobil2.getMerekMobil() + " " + mobil2.getKdMobil());
    }
}

class Mobil {
    private String KdMobil;
    private String MerekMobil;

    public Mobil(String KdMobil, String MerekMobil) {
        setKdMobil(KdMobil);
        setMerekMobil(MerekMobil);
    }

    public String getKdMobil() {
        return this.KdMobil;
    }

    public void setKdMobil(String newKdMobil) {
        this.KdMobil = newKdMobil;
    }

    public String getMerekMobil() {
        return this.MerekMobil;
    }

    public void setMerekMobil(String newMerekMobil) {
        this.MerekMobil = newMerekMobil;
    }

}

class Program {
    public static void main(String[] args) {
        Anggota anggota = new Anggota(1001, 2);

        System.out.println("Kode Anggota " + anggota.getKdAnggota());
        anggota.daftarMobil();
    }
}