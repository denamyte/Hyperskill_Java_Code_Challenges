import java.util.List;

class Pizza {

    //Fix this method
    public static void cookVeganPizza() throws InterruptedException {
        for (Thread step : List.of(new Base(), new Tomatoes(), new Tofu(), new Bake())) {
            step.start();
            step.join();
        }
    }

    //Don't change the code below
    static class Base extends Thread {
        @Override
        public void run() {
            System.out.println("cook base");
        }
    }

    static class Tomatoes extends Thread {
        @Override
        public void run() {
            for (int i = 3; i >= 1; i--) {
                System.out.println("slice tomatoes " + i);
            }
        }
    }

    static class Tofu extends Thread {
        @Override
        public void run() {
            System.out.println("fry tofu");
        }
    }

    static class Bake extends Thread {
        @Override
        public void run() {
            for (int i = 4; i >= 0; i--) {
                if (i == 0) {
                    System.out.println("Your pizza is ready!");
                    break;
                }
                System.out.println("to bake..." + i + " min");

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        cookVeganPizza();
    }
}