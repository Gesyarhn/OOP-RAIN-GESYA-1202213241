import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class

    // TODO Create Method to Insert Menu to Database
   

    
    public int insertMenu(int nomor){
        if (nomor == 1){
            System.out.println("Menu");
            System.out.println("==============================");
            System.out.println("Bakso (Makanan) Rp. 10.000\n2. Es Teh (Minuman) Rp 5.000\n3. Brownies (Dessert) Rp 15.000");
            
            return nomor;
        }else{
            return nomor;
        }
    
        
        
    }

    // TODO Create Method to Show Menu from Database
    public void showMenu(String menu){
        if (menu == "bakso"){
            System.out.println("1. Bakso (Makanan) Rp 10.000");

        }else if(menu == "es teh"){
            System.out.println("2. Es Teh (Minuman) Rp 5.000");
        }else if(menu == "Brownies"){
            System.out.println("3. Brownies (Dessert) Rp 15.000");
        }
    }

    // TODO Create Method to Search Menu from Database


}
