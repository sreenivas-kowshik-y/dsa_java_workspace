// Demonstrating Compile-time (Overloading) and Runtime (Overriding) Polymorphism
public class PolymorphismDemo {

    // Compile-time Polymorphism (Method Overloading)
    static class Calculator {
        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }
    }

    // Runtime Polymorphism (Method Overriding)
    static class Shapes {
        void area() {
            System.out.println("I am in shapes");
        }
    }

    static class Circle extends Shapes {
        @Override
        void area() {
            System.out.println("Area is pi * r * r");
        }
    }

    static class Square extends Shapes {
        @Override
        void area() {
            System.out.println("Area is side * side");
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Overloaded Sum (int): " + calc.add(5, 10));
        System.out.println("Overloaded Sum (double): " + calc.add(5.5, 4.5));

        Shapes shape1 = new Circle(); // Dynamic Method Dispatch
        Shapes shape2 = new Square();
        shape1.area();
        shape2.area();
    }
}
