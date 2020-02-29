
class Manusia {
    protected String nama;
    protected int umur;

    protected void setNama(String nama) {
        this.nama = nama;
    }

    protected void setUmur(int umur) {
        this.umur = umur;
    }
}

class Guru extends Manusia {
    private String id;

    public void print() {
        System.out.println("My name is " + this.nama);
        System.out.println("My age :" + this.umur);
        System.out.println("My Personid :" + this.id);
    }

    public Guru(String nama, int umur, String id) {
        this.setNama(nama);
        this.setUmur(umur);
        this.setId(id);
    }

    public void setId(String id) {
        this.id = id;
    }
}

class Program {

    public static void main(String[] args) {
        Guru agus = new Guru("Agus Wahyuddin", 46, "NIP19750814");
        agus.print();
    }
}