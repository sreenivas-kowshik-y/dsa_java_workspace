// Demonstrating Custom ArrayList using Generics
import java.util.Arrays;

public class GenericsDemo {

    static class CustomArrayList<T> {
        private Object[] data;
        private static int DEFAULT_SIZE = 10;
        private int size = 0;

        public CustomArrayList() {
            this.data = new Object[DEFAULT_SIZE];
        }

        public void add(T value) {
            if (isFull()) {
                resize();
            }
            data[size++] = value;
        }

        private boolean isFull() {
            return size == data.length;
        }

        private void resize() {
            Object[] temp = new Object[data.length * 2];
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }

        @SuppressWarnings("unchecked")
        public T get(int index) {
            return (T) data[index];
        }

        public int size() {
            return size;
        }

        @Override
        public String toString() {
            return Arrays.toString(Arrays.copyOf(data, size));
        }
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Custom Generic List: " + list);
        System.out.println("Element at index 1: " + list.get(1));
    }
}
