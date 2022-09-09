import java.util.Scanner;

public class BasicSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter no 2 : ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The total SUM is : " + c);
    }
}