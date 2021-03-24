import java.util.Scanner;

public class ClassTestWConstructor {
    public static void main(String[] args) {

        CarClassWConstructor car1 = new CarClassWConstructor("Fiat", "DAG-6475");
        CarClassWConstructor car2 = new CarClassWConstructor("Chevrolet", "XDE-2309");

        Scanner brandGetter = new Scanner(System.in);

        System.out.println("Here's your info:\n");

        System.out.printf("First Car's Brand: %s\n", car1.getBrand());
        System.out.printf("First Car's Plate: %s\n\n", car1.getRegistrationPlate());

        System.out.printf("Second Car's Brand: %s\n", car2.getBrand());
        System.out.printf("Second Car's Plate: %s\n\n", car2.getRegistrationPlate());

        System.out.print("About the First Car: ");
        car1.drive(true, "R");
        System.out.print("About the Second Car: ");
        car2.drive(false, "5");

        brandGetter.close();
        }
    }
