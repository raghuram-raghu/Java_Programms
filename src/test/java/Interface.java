public class Interface {


    interface Vehicle {
        void start();
        void stop();
    }

    class Car implements Vehicle {
        @Override
        public void start() {
            System.out.println("Car is starting...");
        }

        @Override
        public void stop() {
            System.out.println("Car is stopping...");
        }
    }

    public class TestVehicle {
        public static void main(String[] args) {
//            Vehicle myCar = new Car();
//            myCar.start(); // Output: Car is starting...
//            myCar.stop();  // Output: Car is stopping...
        }
    }


// static methods in inetrfaces

    interface MathOperations {
        static int add(int a, int b) {
            return a + b;
        }
    }


    public class StaticMethodExample {
        public static void main(String[] args) {
            int result = MathOperations.add(5, 10);
            System.out.println("Sum: " + result);  // Output: Sum: 15
        }
    }


}
