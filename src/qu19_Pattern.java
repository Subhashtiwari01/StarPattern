import java.util.Scanner;

public class qu19_Pattern {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a=n;
        int b=n;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==2||i==(a-1)||i==a){
                    System.out.print("*"+" ");
                }
                else if (j==1||j==2||j==(a-1)||j==a){
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();



        }

    }
}
