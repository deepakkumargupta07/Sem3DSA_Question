import java.util.Scanner;

public class Assignment_03_TheEchoInTheCave {

    static void print(int n){
        System.out.print(n+" ");
        if(n==1){
            return;
        }
        print(n-1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        print(N);
    }
}
