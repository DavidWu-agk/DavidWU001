import java.util.Scanner;
public class Description {
    public static void main(String[] args) {
        String name;
        int id;
        int height;
        int courses;
        int i=1;
        int credit;
        int score;
        double gpa;
        double a=0;
        double b=0;
        double AverageGpa;
        int up;
        int down;
        Scanner input = new Scanner(System.in);
        name = input.next();
        id = input.nextInt();
        height = input.nextInt();
        down=(height/10)*10;
        up=down+9;
        courses = input.nextInt();
        while (i<=courses) {
            credit = input.nextInt();
            score = input.nextInt();
            i=i+1;
            if (score==100) {
                gpa=4.00;
            }
            else if (90<=score & score<=99) {
                gpa=3.90;
            }
            else if (80<=score & score<=89) {
                gpa=3.80;
            }
            else if (70<=score & score<79) {
                gpa=3.70;
            }
            else if(60<=score & score<69) {
                gpa=3.60;
            }
            else {
                gpa=0;
            }
            a=a+credit*gpa;
            b=b+credit;
        }
        AverageGpa=a/b;
        System.out.printf("%s is a boy,he is in ZHIREN college,his height is in %d-%d.His SID is %d.His average GPA is %.2f.",name,down,up,id,AverageGpa);




    }
}
