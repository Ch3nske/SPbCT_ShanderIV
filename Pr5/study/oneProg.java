package Pr5.study;

public class oneProg {
    public static class Program{

        public static void main(String[] args) {

            Person tom = new Person();
            Person bob = new Person();

            tom.displayId();    // Id = 105
            bob.displayId();    // Id = 106
        }
    }
    static class Person {

        private int id;
        static int counter;

        static {
            counter = 105;
            System.out.println("Static initializer");
        }

        Person() {
            id = counter++;
            System.out.println("Constructor");
        }

        public void displayId() {

            System.out.printf("Id: %d \n", id);
        }
    }
}