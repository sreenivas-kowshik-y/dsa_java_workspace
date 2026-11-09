// Demonstrating Interfaces, Multiple Implementation, and Default Methods
public class InterfacesDemo {

    interface Engine {
        void start();
        void stop();
    }

    interface Media {
        void start();
        void stop();
    }

    // Multiple Interface Implementation
    static class Car implements Engine, Media {
        @Override
        public void start() {
            System.out.println("Car engine started.");
        }

        @Override
        public void stop() {
            System.out.println("Car engine stopped.");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.stop();
    }
}
