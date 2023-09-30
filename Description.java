import java.util.Scanner;
public class Description {
    public static void main(String[] args) {
        String name;
        String sex;
        String sex1;
        String sex2;
        String BG;
        String shuyuan;
        int id;
        int height;
        int courses;
        int i=1;
        int credit;
        int score;
        double gpa;
        double a=0;
        int b=0;
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
        int e=(id/100)%100;
        int f=id%100;

         if(f<50){
             sex="he";
             sex1="his";
             sex2="His";
             BG="boy";
         } else  {
             sex="she";
             sex1="her";
             sex2="Her";
             BG="girl";
         }

        if (1<=e & e<=5){
             shuyuan="ZHIXIN";
        } else if (6<=e&e<=10) {
             shuyuan="SHULI";
        } else if (11<=e&e<=15) {
            shuyuan="ZHICHENG";
        } else if (16<=e&e<=20) {
            shuyuan="SHUDE";
        } else if (21<=e&e<=25) {
            shuyuan="ZHIREN";
        } else  {
            shuyuan="SHUREN";
        }
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
            else if (70<=score & score<=79) {
                gpa=3.70;
            }
            else if(60<=score & score<=69) {
                gpa=3.60;
            }
            else {
                gpa=0.00;
            }
            a=a+(double)credit*gpa;
            b=b+credit;
        }
        AverageGpa=a/(double)b;
        System.out.printf("%s is a %s, %s is in %s college, %s height is in %d-%d. %s SID is %d. %s average GPA is %.2f.",name,BG,sex,shuyuan,sex1,down,up,sex2,id,sex2,AverageGpa);




    }
}
