public class Kasir {
    private String ulang;
    private String nama;
    private int nomor;
    private int pilihan;
    private int total;
    private int jumlah;
    private int hrgBarang;
    private int cash;
    private int totalHarga;

    public Kasir() {
        this.ulang = ulang;
        this.nama = nama;
        this.nomor = nomor;
        this.pilihan = pilihan;
        this.total = total;
        this.jumlah = jumlah;
        this.hrgBarang = hrgBarang;
        this.cash = cash;
        this.totalHarga = totalHarga;
    }

    public Kasir(String ulang, String nama, int nomor, int pilihan, int total, int jumlah, int hrgBarang, int cash, int totalHarga) {
        this.ulang = ulang;
        this.nama = nama;
        this.nomor = nomor;
        this.pilihan = pilihan;
        this.total = total;
        this.jumlah = jumlah;
        this.hrgBarang = hrgBarang;
        this.cash = cash;
        this.totalHarga = totalHarga;
    }

    public String getUlang() {
        return ulang;
    }

    public void setUlang(String ulang) {
        this.ulang = ulang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public int getPilihan() {
        return pilihan;
    }

    public void setPilihan(int pilihan) {
        this.pilihan = pilihan;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHrgBarang() {
        return hrgBarang;
    }

    public void setHrgBarang(int hrgBarang) {
        this.hrgBarang = hrgBarang;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    public int pastaGigi() {
        total = 15000;
        return total;
    }

    public int sabunMandi() {
        total = 20000;
        return total;
    }

    public int shampoo() {
        total = 30000;
        return total;
    }

    public int tissueWajah() {
        total = 20000;
        return total;
    }

    public int mieInstan() {
        total = 2000;
        return total;
    }

    public int airMineral() {
        total = 1000;
        return total;
    }

    public int cokelat() {
        total = 25000;
        return total;
    }

    public int permen() {
        total = 12000;
        return total;
    }

    public int esKrim() {
        total = 11000;
        return total;
    }

    public int deterjen() {
        total = 36000;
        return total;
    }

    public int jlh() {
        hrgBarang = total * jumlah;
        return hrgBarang;
    }

    public int ttlHarga() {
        totalHarga = hrgBarang;
        return totalHarga;
    }

    public int change(int cash, int totalharga) {
        this.totalHarga = totalharga - cash;
        return this.totalHarga;
    }
}
