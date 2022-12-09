package MODUL2_GESYA;

public class Kapal extends TransportasiAir {
    protected String mesin;

    Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;

    }
    public void informasi(){
        System.out.printf("\nTransportasi air jenis kapal dengan kursi berjumlah %d ditetapkan dengan biaya sebesar RP. %d\n", this.jumlahKursi, this.biaya);
    }
    public void berlayar(){
        System.out.printf("Transportasi air jenis kapal sedang berlayar menggunakan mesin %s dengan kecepatan yang tidak stabil\n", this.mesin);
    }
    public void berlayar(int kecepatan){
        System.out.printf("Transportasi air jenis kapal sedang berlayar menggunakan mesin %s dengan kecepatan stabil di kisaran %d knot\n", this.mesin, kecepatan);
    }
    public void berlabuh(){
        System.out.printf("Transportasi air jenis kapal berlabuh di pantai\n");
    }
    
}
