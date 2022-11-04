import java.util.Scanner;
public class User {

    public static void Pengguna(){
    
    System.out.println("Selamat Datag di Restoran EAD");
    System.out.println("Silahkan Register Terlebih Dahulu");
    System.out.println("==============================");

    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Nama: ");
        String name = input.nextLine();
        System.out.print("No. Handphone: ");
        int noHp = input.nextInt();

        System.out.println("");
        System.out.println("Register Success");
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + noHp);
    }
    }
    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    public static void main(String[] args) {
        
        Pengguna();
    }
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message


}
