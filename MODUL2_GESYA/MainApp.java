package MODUL2_GESYA;

public class MainApp {
    public static void main(String[] args) {
        TransportasiAir air = new TransportasiAir(4, 20000);
        air.informasi();
        air.berlayar();
        air.berlabuh();

        Sampan sampan = new Sampan(20, 50000, 2);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(2);

        Kapal perahu = new Kapal(50, 100000, "Diesel");
        perahu.informasi();
        perahu.berlayar();
        perahu.berlayar(20);
        perahu.berlabuh();



    }
}
