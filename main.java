// Class Toko untuk mengelola inventaris produk
class Toko {
    private Produk[] inventaris;
    private int jumlahProduk;

    // Konstruktor untuk menginisialisasi objek Toko
    public Toko() {
        inventaris = new Produk[100];
        jumlahProduk = 0;
    }

    // Metode untuk menambahkan produk ke inventaris toko
    public void tambahProduk(Produk produk) {
        if (jumlahProduk < inventaris.length) {
            inventaris[jumlahProduk] = produk;
            jumlahProduk++;
            System.out.println("Produk berhasil ditambahkan ke inventaris toko.");
        } else {
            System.out.println("Inventaris toko sudah penuh.");
        }
    }

    // Metode untuk mencetak informasi semua produk dalam inventaris toko
    public void cetakInventaris() {
        System.out.println("Inventaris Toko:");
        for (int i = 0; i < jumlahProduk; i++) {
            System.out.println("Nama: " + inventaris[i].getNama());
            System.out.println("Harga: $" + inventaris[i].getHarga());
            System.out.println("Stok: " + inventaris[i].getStok());
            System.out.println("-----------------------------");
        }
    }
}

// Class utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek toko
        Toko toko = new Toko();

        // Membuat beberapa objek produk
        Produk produk1 = new Produk("TV LED", 500.0, 10);
        Produk produk2 = new Produk("Laptop", 1000.0, 5);
        Produk produk3 = new Produk("Smartphone", 800.0, 8);

        // Menambahkan produk ke inventaris toko
        toko.tambahProduk(produk1);
        toko.tambahProduk(produk2);
        toko.tambahProduk(produk3);

        // Mencetak informasi semua produk dalam inventaris toko
        toko.cetakInventaris();
    }
}