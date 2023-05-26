package ClassesPart1;

public class Main {

    public static void main(String[] args) {

        Car rivian = new Car();

        rivian.setMake("Rivian");
        rivian.setModel("R1T");
        rivian.setDoors(4);
        rivian.setConvertible(false);
        rivian.setColor("Green");

        Car tesla = new Car();

        tesla.setMake("Tesla");
        tesla.setModel("Model 3");
        tesla.setDoors(4);
        tesla.setConvertible(false);
        tesla.setColor("Grey");

        rivian.describeCar();
        System.out.printf("\nIs this car convertible? %s\n", rivian.isConvertible());

        tesla.describeCar();
        System.out.printf("\nIs this car convertible? %s\n", tesla.isConvertible());




    }
}
