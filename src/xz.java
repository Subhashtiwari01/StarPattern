import java.util.Scanner;

public class xz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println(false);
            return;
        }



        int originlnum=n;
        int revnum=0;

        while (n!=0 &&n>0){
            int digit=n%10;
            revnum=revnum*10+digit;
            n=n/10;
        }

        if(originlnum==revnum){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }


        }

}
