class Hewan {
    private String hewan;
    private String suara;

    public Hewan(String hewan, String suara) {
        this.hewan = hewan;
        this.suara = suara;
    }

    public void getSuara() {
        System.out.println(hewan + " " + suara + "...");
    }

}

class Program {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan("Kuda", "mengikik");
        Hewan hewan2 = new Hewan("Kucing", "mengeong");
        Hewan hewan3 = new Hewan("Ayam", "berkokok");

        System.out.println("Hewan bersuara :");
        hewan1.getSuara();
        hewan2.getSuara();
        hewan3.getSuara();
    }
}