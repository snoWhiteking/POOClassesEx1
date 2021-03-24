import java.util.Random;

public class CarClassWConstructor {
    private String brand;
    private String registrationPlate;

    public CarClassWConstructor (String brand, String registrationPlate) {
        this.brand = brand;
        this.registrationPlate = registrationPlate;
    }

    public String getBrand() {
        return this.brand;
    }
    public String getRegistrationPlate() {
        return this.registrationPlate;
    }

    public void drive(boolean isTurnedOn, String currentGear) {
        if (isTurnedOn) {
            String carSpeed = " ";

            switch (currentGear) {
                case "0":
                    carSpeed = "at some speed...";
                    break;
                case "1":
                    carSpeed = "at the lowest speed.";
                    break;
                case "2":
                    carSpeed = "at low speed.";
                    break;
                case "3":
                    carSpeed = "at medium speed.";
                    break;
                case "4":
                    carSpeed = "at high speed!";
                    break;
                case "5":
                    carSpeed = "at the highest speed!!!";
                    break;
                case "R":
                    carSpeed = "backwards.";
                    break;
            }

            System.out.printf("The car is being driven %s\n", carSpeed);
        }
        else
            System.out.println("The car can't be driven.\n");
    }

    public String getRandomPlate() {
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g',
                                     'h', 'i', 'j', 'k', 'l', 'm', 'n',
                                     'o', 'p', 'q', 'r', 's', 't', 'u',
                                     'v', 'w', 'x', 'y', 'z'};
        Random plateGetter = new Random();
        String newPlate = "";

        for (int i = 0; i < 7; i++) {

            if (i < 3)
                newPlate += alphabet[plateGetter.nextInt(26)];
            else {
                if (i == 3)
                    newPlate += "-";
                newPlate += Integer.toString(plateGetter.nextInt(10));
            }
        }

        return newPlate.toUpperCase();
    }
}
