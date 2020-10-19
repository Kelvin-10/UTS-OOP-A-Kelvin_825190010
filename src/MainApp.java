import java.util.Scanner;
import java.lang.Math;
public class MainApp {
    public static void main(String[] args) {

        Scanner produk = new Scanner(System.in);
        Kasir barang = new Kasir();
        int nilai = 0;

        System.out.println("WELCOME TO JAVAMARKET\n");
        System.out.print("Nama: ");
        barang.setNama(produk.nextLine());
        System.out.print("No. Pembayaran: ");
        barang.setNomor(produk.nextInt());

        System.out.println("\nLIST PRODUK");
        System.out.println("1. Pasta Gigi");
        System.out.println("2. Sabun Mandi");
        System.out.println("3. Shampoo");
        System.out.println("4. Tissue Wajah");
        System.out.println("5. Mie Instan");
        System.out.println("6. Air Mineral");
        System.out.println("7. Cokelat");
        System.out.println("8. Permen");
        System.out.println("9. Es Krim");
        System.out.println("10. Deterjen");
        do {
            System.out.print("\nPilihan: ");
            barang.setPilihan(produk.nextInt());

            if (barang.getPilihan() == 1) {
                System.out.println("Pasta Gigi");
                System.out.print("Harga Satuan: ");
                System.out.println(barang.pastaGigi());
                System.out.print("Jumlah: ");
                barang.setJumlah(produk.nextInt());
                System.out.print("Harga Barang: ");
                System.out.println(barang.jlh());
                nilai += barang.ttlHarga();
            }else if(barang.getPilihan() == 2){
                System.out.println("Sabun Mandi");
                System.out.print("Harga Satuan: ");
                System.out.println(barang.sabunMandi());
                System.out.print("Jumlah: ");
                barang.setJumlah(produk.nextInt());
                System.out.print("Harga Barang: ");
                System.out.println(barang.jlh());
                nilai += barang.ttlHarga();
            }else if (barang.getPilihan() == 3){
                System.out.println("Shampoo");
                System.out.print("Harga Satuan: ");
                System.out.println(barang.shampoo());
                System.out.print("Jumlah: ");
                barang.setJumlah(produk.nextInt());
                System.out.print("Harga Barang: ");
                System.out.println(barang.jlh());
                nilai += barang.ttlHarga();
            }else if(barang.getPilihan() == 4){
                System.out.println("Tissue Wajah");
                System.out.print("Harga Satuan: ");
                System.out.println(barang.tissueWajah());
                System.out.print("Jumlah: ");
                barang.setJumlah(produk.nextInt());
                System.out.print("Harga Barang: ");
                System.out.println(barang.jlh());
                nilai += barang.ttlHarga();
            }else if(barang.getPilihan() == 5){
                System.out.println("Mie Instan");
                System.out.print("Harga Satuan: ");
                System.out.println(barang.mieInstan());
                System.out.print("Jumlah: ");
                barang.setJumlah(produk.nextInt());
                System.out.print("Harga Barang: ");
                System.out.println(barang.jlh());
                nilai += barang.ttlHarga();
            }else if(barang.getPilihan() == 6){
                System.out.println("Air Mineral");
                System.out.print("Harga Satuan: ");
                System.out.println(barang.airMineral());
                System.out.print("Jumlah: ");
                barang.setJumlah(produk.nextInt());
                System.out.print("Harga Barang: ");
                System.out.println(barang.jlh());
                nilai += barang.ttlHarga();
            }else if(barang.getPilihan() == 7){
                System.out.println("Cokelat");
                System.out.print("Harga Satuan: ");
                System.out.println(barang.cokelat());
                System.out.print("Jumlah: ");
                barang.setJumlah(produk.nextInt());
                System.out.print("Harga Barang: ");
                System.out.println(barang.jlh());
                nilai += barang.ttlHarga();
            }else if(barang.getPilihan() == 8){
                System.out.println("Permen");
                System.out.print("Harga Satuan: ");
                System.out.println(barang.permen());
                System.out.print("Jumlah: ");
                barang.setJumlah(produk.nextInt());
                System.out.print("Harga Barang: ");
                System.out.println(barang.jlh());
                nilai += barang.ttlHarga();
            }else if(barang.getPilihan() == 9) {
                System.out.println("Es Krim");
                System.out.print("Harga Satuan: ");
                System.out.println(barang.esKrim());
                System.out.print("Jumlah: ");
                barang.setJumlah(produk.nextInt());
                System.out.print("Harga Barang: ");
                System.out.println(barang.jlh());
                nilai += barang.ttlHarga();
            }else if(barang.getPilihan() == 10){
                System.out.println("Deterjen");
                System.out.print("Harga Satuan: ");
                System.out.println(barang.deterjen());
                System.out.print("Jumlah: ");
                barang.setJumlah(produk.nextInt());
                System.out.print("Harga Barang: ");
                System.out.println(barang.jlh());
                nilai += barang.ttlHarga();
            } else {
                System.out.println("Maaf, pilihan yang anda masukkan tidak sesuai!");
            }
            System.out.println("\nApakah anda ingin membeli barang yang lain ? (Y/N)");
            barang.setUlang(produk.next());

        }
        while ("Y".equals(barang.getUlang()) || "y".equals(barang.getUlang()));

        System.out.print("\nTOTAL HARGA: ");
        System.out.println(nilai);
            System.out.print("Bayar: Rp ");
            barang.setCash(produk.nextInt());
        if (nilai < barang.getCash()) {
            System.out.print("Change: Rp ");
            System.out.println(Math.abs(barang.change(barang.getCash(), nilai)));
            System.out.println("\nTERIMAKASIH TELAH BERBELANJA DI JAVAMARKET");
        } else {
            System.out.println("\nMaaf, uang yang anda miliki tidak mencukupi");
        }
    }
}
