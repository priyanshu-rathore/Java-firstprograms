import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        int a;
        int LCM;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        a = sc.nextInt();
        for(int i = 2; i<=a;i++){
          
            if(a%i==0){
             LCM = a/i;
             System.out.print(LCM + ", ");
            }
        }
    }
}
