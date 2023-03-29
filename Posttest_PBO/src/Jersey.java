public class Jersey {
   private String nama;
   private String ukuran;
   private int harga;
   private int no;

   public Jersey(String nama, String ukuran, int harga, int no) {
       this.nama = nama;
       this.ukuran = ukuran;
       this.harga = harga;
       this.no = no;
   }

   public String getNama() {
       return nama;
   }

   public String getUkuran() {
       return ukuran;
   }

   public int getHarga() {
       return harga;
   }

   public int getno(){
      return no;
   }

   public void tampilData() {
       System.out.println("Nama Jersey: " + nama);
       System.out.println("Harga Jersey: Rp " + harga);
   }

    public void orderJersey(String ukuran) {
    System.out.println("Pesanan Anda untuk jersey Arsenal dengan ukuran " + ukuran );
    }

    public void orderJersey(String ukuran, String nama) {
    System.out.println("Pesanan Anda untuk jersey Arsenal dengan ukuran " + ukuran + " dan nama pemain " + nama );
    }

    public void orderJersey(String ukuran, String nama, int number) {
    System.out.println("Pesanan Anda untuk jersey Arsenal dengan ukuran " + ukuran + ", nama pemain " + nama + ", dan nomor pemain " + number);
    }

}

class JerseyHome extends Jersey {
   private String warna;

   public JerseyHome(String nama, String ukuran, int harga, String warna,int no) {
       super(nama, ukuran, harga,no);
       this.warna = warna;
   }

   public String getWarna() {
       return warna;
   }

   public void orderJersey(String ukuran) {
    System.out.println("Pesanan Anda untuk jersey Arsenal dengan ukuran " + ukuran );
    }
   public void tampilData() {
       super.tampilData();
       System.out.println("Warna Jersey: " + warna);
   }
}

class JerseyAway extends Jersey {
   private String warna;

   public JerseyAway(String nama, String ukuran, int harga, String warna,int no) {
       super(nama, ukuran, harga, no);
       this.warna = warna;
   }

   public String getWarna() {
       return warna;
   }
   
   public void orderJersey(String ukuran) {
    System.out.println("Pesanan Anda untuk jersey Arsenal dengan ukuran " + ukuran );
   }
   public void tampilData() {
       super.tampilData();
       System.out.println("Warna Jersey: " + warna);
   }
}