// Class Produk sebagai representasi objek produk elektronik
class Produk {
    private String nama;
    private double harga;
    private int stok;

    // Konstruktor untuk menginisialisasi objek Produk
    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Metode untuk mendapatkan informasi nama produk
    public String getNama() {
        return nama;
    }

    // Metode untuk mendapatkan informasi harga produk
    public double getHarga() {
        return harga;
    }

    // Metode untuk mendapatkan informasi stok produk
    public int getStok() {
        return stok;
    }

    // Metode untuk mengurangi stok produk
    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
            System.out.println("Stok produk berhasil dikurangi.");
        } else {
            System.out.println("Stok produk tidak mencukupi.");
        }
    }
}