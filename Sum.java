import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int i = m ;
        int sum=0;
        while(i>=m & i<=n){
            int k = 0;
            for(int j=1;j<=i & k<=4;j++){
                if(i%j==0 ){
                    k++;
                }
            }
            if(k==4){
                sum = sum + i;
            }
            i=i+1;
        }
        System.out.print(sum);
    }
}
