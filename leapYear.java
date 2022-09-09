import java.util.*;

public class leapYear{
    public static void main(String[] args){
        /*psuedo_code*/
    //1.input a leap year
    //2.check if dividing leap year by 4 gives the remainder 0 
    //3 if yes then print "its a leap year" if not print "not a leap year"
    int leapYear;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Year : ");
    leapYear = sc.nextInt();
      System.out.println(" ");
    if(leapYear%4==0){
        System.out.println("its a leap year\n");
    }else{
        System.out.println("its not a leap year\n");
    }
    }
}