interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {
    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        System.out.println("Putting gorilla food into cage...");
        return timeToEat;
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Lather, rinse, repeat");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Pet at your own risk!");
    }
}

public class Task16 {
    public static void main(String[] args) {
        Gorilla myGorilla = new Gorilla();
        myGorilla.feed(true);
        myGorilla.groom();
        myGorilla.pet();
    }
}