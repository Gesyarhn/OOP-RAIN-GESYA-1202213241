package MODUL2_GESYA;

public class TransportasiAir {
    protected int jumlahKursi;
    protected int biaya;

    TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;

    }
    public void informasi(){
        System.out.printf("Transportasi air jenis tidak diketahui dengan kursi berjumlah %d ditetapkan dengan biaya sebesar RP. %d \n", this.jumlahKursi, this.biaya );
    }
    public void berlayar(){
        System.out.printf("Transportasi air dengan jenis yang tidak diketahui sedang berlayar\n");
    }
    public void berlabuh(){
        System.out.printf("Transportasi air dengan jenis yang tidak diketahui berlabuh di pantai\n");
    }


}
