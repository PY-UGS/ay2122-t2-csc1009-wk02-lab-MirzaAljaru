import java.util.Scanner;

public class Lab_02_Q2 {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");

        float[]num = new float[3];
        float sum = 0;
        for(int i =0;i < 3 ; i++){
            num[i] = input.nextFloat();
            sum += num[i];
        }
        float average = (sum)/3;

        System.out.printf("The area of %.2f %.2f %.2f is %.2f\n",num[0],num[1],num[2],average);

        input.close();


    }
}
