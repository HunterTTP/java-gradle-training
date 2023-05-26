package ClassesPart1;

public class Car {

    //fields (since class level, would be variables in method level)
    private String make = "Tesla";
    private String model = "Model 3";
    private String color = "Grey";
    private int doors = 4;
    private boolean convertible = false;

    public void setMake(String make) {

        if (make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "rivian", "porchse", "tesla" -> this.make = make;
            default -> {this.make = "Unsupported";}
        }
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {

        System.out.printf("%s - %s - %s - %d", make, model, color, doors);
    }

 }
