public class FormPesanan{
    private String Nama;
    private String NoPesanan;
    private String NoTelp;
    private int NoAntrian;
    private String Alamat;

    FormPesanan(String Nama, String NoPesanan, String NoTelp, int nomor_antrian,String Alamat){
        this.Nama = Nama;
        this.NoPesanan = NoPesanan;
        this.NoTelp = NoTelp;
        this.NoAntrian = nomor_antrian;
        this.Alamat = Alamat;
    }
    
    public void setNoTelp(String NoTelp){
        this.NoTelp = NoTelp;
    }

    public String getNoPesanan(){ return NoPesanan;}

    public void setNoPesanan(String NoPesanan){
        this.NoPesanan = NoPesanan;
    }

    public String getNama(){ return Nama;}

    public void setNama(String Nama){ this.Nama = Nama;}
    
    public int getNoAntrian(){ return NoAntrian;}

    public void setNoAntrian(int NoAntrian){
        this.NoAntrian = NoAntrian;
    }
    
    public String getAlamat(){ return Alamat;}

    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    @Override public String toString(){

        return "ListPesanan("+"No Antrian = "+ NoAntrian + "nama = " + Nama + ", No Pesanan = " + NoPesanan + ", No Telpon = " + NoTelp  +", Alamat =" + Alamat +"}";
    }

    public String getNo_telp(){
        return this.NoTelp;
    }

    public int getNo_Antrian(){
        return this.NoAntrian;
    }
    
}
