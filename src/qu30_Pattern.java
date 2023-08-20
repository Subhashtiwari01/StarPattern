import java.util.Scanner;

public class qu30_Pattern {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int count=n;
            for(int j=0;j<n;j++){
                System.out.print(count+" ");
                count--;
            }
            System.out.println();


        }

    }
}
