// Demonstrating Single, Multilevel, and Hierarchical Inheritance with 'super' Keyword
public class InheritanceDemo {

    // Base Class
    static class Box {
        double l, h, w;

        Box() {
            this.l = -1;
            this.h = -1;
            this.w = -1;
        }

        Box(double l, double h, double w) {
            this.l = l;
            this.h = h;
            this.w = w;
        }
    }

    // Single Inheritance
    static class BoxWeight extends Box {
        double weight;

        BoxWeight(double l, double h, double w, double weight) {
            super(l, h, w); // Call parent class constructor
            this.weight = weight;
        }
    }

    // Multilevel Inheritance
    static class BoxPrice extends BoxWeight {
        double cost;

        BoxPrice(double l, double h, double w, double weight, double cost) {
            super(l, h, w, weight);
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        BoxPrice box = new BoxPrice(10, 20, 30, 5.5, 200.0);
        System.out.println("Box Dimensions: " + box.l + "x" + box.h + "x" + box.w);
        System.out.println("Weight: " + box.weight + " kg, Cost: $" + box.cost);
    }
}
