import java.util.*;

public class pattern20 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        // write ur code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||j==n||((i==j||i+j==n+1)&&i>n/2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
        System.out.println();
        }
    }
}