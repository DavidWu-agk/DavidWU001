import java.util.Scanner;
public class GameCharacterMovement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int x1;
        int x2;
        int y1;
        int y2;
        int x;
        int y;
        n = input.nextInt();
        x1 = input.nextInt();
        x2 = input.nextInt();
        y1 = input.nextInt();
        y2 = input.nextInt();
        x = input.nextInt();
        y = input.nextInt();
        input.nextLine();
        String orders = input.nextLine();
        if ((orders.length()+1)/2==n) {
          for (int i = 0; i <orders.length();i=i+1) {
            char order = orders.charAt(i);
            if (order == 'w') {
                y = Math.min(y + 1, y2);
            } else if (order == 's') {
                y = Math.max(y - 1, y1);
            } else if (order == 'd') {
                x = Math.min(x + 1, x2);
            } else if (order == 'a') {
                x = Math.max(x - 1, x1);
            } else if (order == 'q') {
                if (x-1>x1 & y+1<y2){
                    x=x-1;
                    y=y+1;}
            } else if (order == 'e') {
                if(x+1<x2 & y+1<y2){
                    x=x+1;
                    y=y+1;
                }
            } else if (order == 'z') {
                if(x-1>x1 & y-1>y1){
                    x=x-1;
                    y=y-1;
                }
            } else if (order == 'c') {
                if (x+1<x2 & y-1>y1){
                    x=x+1;
                    y=y-1;
                }
            }
        }
        System.out.printf("(%d,%d)", x, y);}


    }
}





