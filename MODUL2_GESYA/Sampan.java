package MODUL2_GESYA;

public class Sampan extends TransportasiAir {
    protected int layar;

    Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;

    }

    public void informasi(){
        System.out.printf("\nTransportasi air jenis sampan dengan kursi berjumlah %d ditetapkan dengan biaya sebesar RP. %d\n", this.jumlahKursi, this.biaya);
    }
    public void berlayar(){
        System.out.printf("Transportasi air jenis sampan sedang berlayar menggunakan %d layar\n", this.layar);
    }
    public void berlabuh(){
        System.out.printf("Transportasi air jenis sampan berlabuh di pantai tanpa jangkar\n");
    }
    public void berlabuh(int jangkar){
        System.out.printf("Transportasi air jenis sampan berlabuh di pantai menggunakan %d jangkar\n", jangkar);

    }

}
