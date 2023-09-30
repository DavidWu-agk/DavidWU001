import java.util.Arrays;
import java.util.Scanner;
public class CalculatetheArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double a;
        double b;
        double c;
        double d;
        double s;
        double p;
        n = input.nextInt();
        if (n==2)   {
            System.out.println("0.00");
        }
        else if(n==3) {
            a=input.nextDouble();
            b= input.nextDouble();
            c= input.nextDouble();
            p=(a+b+c)*0.5;
            s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.printf("%.2f",s);
        }
        else if(n==4){
            a=input.nextDouble();
            b= input.nextDouble();
            c= input.nextDouble();
            d= input.nextDouble();
            double [] sides = {a,b,c,d};
            Arrays.sort(sides);
            s=sides[0]*sides[2];
            System.out.printf("%.2f",s);







        }

    }
}
