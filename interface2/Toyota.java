// Define the Cart interface
interface Cart {
    int speed = 0; 
    void run();
}


interface Car extends Cart {
    void stop();
    void boost();
}


class Toyota implements Car {
    @Override
    public void run() {
        System.out.println("Toyota is running...");
    }

    @Override
    public void stop() {
        System.out.println("Toyota has stopped.");
    }

    @Override
    public void boost() {
        System.out.println("Toyota is boosting speed!");
    }

    public static void main(String[] args) {
        Toyota myCar = new Toyota();
        myCar.run();
        myCar.boost();
        myCar.stop();
        System.out.println("Speed variable : " + Cart.speed);
    }
}

