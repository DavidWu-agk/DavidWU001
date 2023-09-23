import java.util.Scanner;
public class PrintRectangle {
    public static void main(String[] args) {
        int n;
        int i=1;
        int m=1;
        Scanner input = new Scanner(System.in);
        n= input.nextInt();
        while(i<=n) {
            i=i+1;
            int j=1;
            int k=1;
            while(j<=n){
                j=j+1;
                System.out.print("+-");
            }
            System.out.println("+");
            while (k<=n){
                k=k+1;
                System.out.print("|*");
            }
            System.out.println("|");
        }
        while (m<=n){
            m=m+1;
            System.out.print("+-");
        }
        System.out.print("+");

    }
}
