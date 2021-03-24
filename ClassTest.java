import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {

        CarClass car1 = new CarClass();
        CarClass car2 = new CarClass();

        Scanner brandGetter = new Scanner(System.in);

        System.out.print("First car's brand: ");
        car1.setBrand(brandGetter.nextLine());
        System.out.print("Second car's brand: ");
        car2.setBrand(brandGetter.nextLine());

        System.out.println("\nGenerating registration plates...");
        System.out.println("Here's your info:\n");

        car1.setRegistrationPlate(car1.getRandomPlate());
        car2.setRegistrationPlate(car2.getRandomPlate());

        System.out.printf("First Car's Brand: %s\n", car1.getBrand());
        System.out.printf("First Car's Plate: %s\n\n", car1.getRegistrationPlate());

        System.out.printf("Second Car's Brand: %s\n", car2.getBrand());
        System.out.printf("Second Car's Plate: %s\n\n", car2.getRegistrationPlate());

        System.out.print("About the First Car: ");
        car1.drive(true, "4");
        System.out.print("About the Second Car: ");
        car2.drive(false, "5");

        brandGetter.close();
        }
    }
