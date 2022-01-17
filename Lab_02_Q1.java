import java.util.Scanner;

public class Lab_02_Q1 {

    public static final double PI = 3.14159;
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a byte value: ");
        byte byteValue = input.nextByte();


        System.out.println("Enter a short value: ");
        short shortValue = input.nextShort();
  
        
        System.out.println("Enter an int value: ");
        int intValue = input.nextInt();


        System.out.println("Enter a long value: ");
        long longValue = input.nextLong();


        System.out.println("Enter a float value: ");
        float floatValue = input.nextFloat();

        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);

        System.out.println("Area of Circle Program");

        
        System.out.println("Enter a number for radius: ");
        float radiusLength = input.nextFloat();

        double Area = radiusLength * radiusLength * PI;

        System.out.printf("The area for the circle of radius %.2f is : %f\n",radiusLength,Area);

        input.close();


    }
}
