import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int a;
        System.out.print("Enter the Number to diplay its Table : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(a + " X " + i + " = " + (a*i));
        }
    }
}
