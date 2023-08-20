import java.util.Scanner;

public class qu28_Pattern {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<n;i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+"  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }

                System.out.println();
            }




    }
}
