package Pr5.study;

public class secondProgram {
    public static class Program {

        public static void main(String[] args) {

            Person tom = new Person("Tom");
            tom.display();
            Person sam = new Employee("Sam", "Oracle");
            sam.display();
        }
    }

    static class Person {

        private String name;

        public String getName() {
            return name;
        }

        public Person(String name) {

            this.name = name;
        }

        public void display() {

            System.out.printf("Person %s \n", name);
        }
    }

    static class Employee extends Person {

        private String company;

        public Employee(String name, String company) {

            super(name);
            this.company = company;
        }

        @Override
        public void display() {

            System.out.printf("Employee %s works in %s \n", super.getName(), company);
        }
    }
}
