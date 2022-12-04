public class MainApp {

    public static void main(String[] args) {

        Perangkat perangkat = new Perangkat("Adata", 2, 1.80F);
        perangkat.informasi();
        System.out.println("");

        // Laptop
        Laptop seagate = new Laptop("Seagate", 8, 2.40F, true);
        System.out.println("<<<LAPTOP>>>");

        seagate.informasi();
        seagate.bukaGame("Dota 2");
        seagate.kirimEmail("niceyuk@gmail.com");
        seagate.kirimEmail("aanarji@gmail.com", "rusmangc@gmail.com\n");

        // Handphone
        Handphone handisk = new Handphone("Sandisk", 3, 2.20F, false);
        System.out.println("\n<<<HANDPHONE>>>");

        handisk.informasi();
        handisk.telfon(628122122);
        handisk.kirimSMS(62852112);
        handisk.kirimSMS(628121212, 629292211);
    }
}