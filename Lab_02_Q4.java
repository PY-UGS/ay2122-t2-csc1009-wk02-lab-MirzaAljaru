import java.util.Scanner;

public class Lab_02_Q4 {
    
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        String Zodiac = "_";

        switch(year % 12){
            case 0:
                Zodiac = "monkey";
                break;
            case 1:
                Zodiac = "rooster";
                break;
            case 2:
                Zodiac = "dog";
                break;
            case 3:
                Zodiac = "pig";
                break;
            case 4:
                Zodiac = "rat";
                break;
            case 5:
                Zodiac = "ox";
                break;
            case 6:
                Zodiac = "tiger";
                break;
            case 7:
                Zodiac = "rabbit";
                break;
            case 8:
                Zodiac = "dragon";
                break;
            case 9:
                Zodiac = "snake";
                break;
            case 10:
                Zodiac = "horse";
                break;
            case 11:
                Zodiac = "sheep";
                break;
        }
        System.out.println(Zodiac);
        input.close();





    }

}
