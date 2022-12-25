public class Restaurant implements Runnable {


    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    public static int foodNumber = 1;

    public void run(){
        // isi perulangan while
        while(true){
            makeFood();
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

    // setter getfoodnumber
    public static int getFoodNumber(){
        return foodNumber;
    }

    // setter setwaitingforpickup
    public void setWaitingForPickup(boolean waitingForPickup){
        this.waitingForPickup = waitingForPickup;
    }

    // method makefood
    public void makeFood(){
        synchronized (lock) {
            if(this.waitingForPickup){
                try{
                    System.out.println("Restaurant : Waiting for the waiter to deliver the food ");
                     Restaurant.lock.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }

            waitingForPickup = true;
            System.out.println("Restaurant : Making food number " + foodNumber++);
            lock.notifyAll();
            System.out.println("Restaurant : Telling the waiter to get the food\n");
            }
        }

    // setter getlock
    public static Object getLock(){
        return lock;
    }
}

