public class Lab_02_Q3 {
    
    public static void main(String[] args) {
        long totalMillisec = System.currentTimeMillis();
        long totalSec = totalMillisec / 1000;

        long currentSecond = totalSec % 60;
        long totalMinute = (totalSec / 60) + (8 * 60);

        long currentMinute = totalMinute % 60;
        long totalHour = totalMinute / 60;

        long currentHour = totalHour %24;

        System.out.printf("Current time is %s:%s:%s GMT+8",currentHour,currentMinute,currentSecond);
       
       // System.out.println("Current time is " + currentHour + ":" + currentMinute+":"+ currentSecond+" GMT+8");

    }
}
