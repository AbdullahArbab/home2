
import java.util.Scanner;

public class WeekDays {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        while (true){
        System.out.println("Choose One number (1-7)");
        int n = input.nextInt();
        String day, type = null;
        
        if (n == 1) {
            day = "saturday";
            type = "even";
        } else if (n == 2) {
            day = "sunday";
            type = "odd";
        } else if (n == 3) {
            day = "monday";
            type = "even";
        } else if (n == 4) {
            day = "tuesday";
            type = "odd";
        } else if (n == 5) {
            day = "wednesday";
            type = "even";
        } else if (n == 6) {
            day = "thursday";
            type = "odd";
        } else if (n == 7) {
            day = "friday";
            type = "";
        } else {
            day = "";
        }
        if (n < 7) {
            System.out.format("the #%dth day in a week is %s.It is an %s day\n", n, day, type);
        } else if (n == 7) {
            System.out.format("the #%dth day in a week is %s.",n,day);
        } else if (n > 7) {
            System.out.println("the number is invalid");
        }
        }  
    }

}
