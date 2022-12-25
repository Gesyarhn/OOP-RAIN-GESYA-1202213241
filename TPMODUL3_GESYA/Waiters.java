public class Waiters implements Runnable {


    private final int orderQty;
    private final int customerID;
    static int coffeePrice = 25000;

    // constructor waiters
    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    @Override
    public void run() {
        // call getCoffee method and pending it to 5000 ms
        while (true) {
            getCoffee();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // method orderinfo
    public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Numbeer of Coffee: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty * coffeePrice);
        System.out.println("==========================================================");
    }
    
    // method getcoffee
    public void getCoffee() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter: Coffee is ready to deliver");
            Restaurant coffeeMachine = new Restaurant();
            coffeeMachine.setWaitingForPickup(false);

            // memeriksa periksa apakah nilai getCoffeeNumber dari kelas CoffeeMachine sama dengan orderQty, jika sama, panggil metode orderInfo() untuk mencetak info pesanan dan keluar dari program
            
            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }

            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the coffee machine to make another coffee\n");

        }
    }
}

