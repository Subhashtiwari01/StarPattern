import java.util.Scanner;

public class qu24_Pattern {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("    ");
            }
//            int count=1;
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print(i+"   ");
//                count++;

            }
            System.out.println();


        }

    }
}
