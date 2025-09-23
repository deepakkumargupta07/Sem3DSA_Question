import java.util.Scanner;

public class Assignment_03_TheDrumbeatsOfTheFestival {

    static void print(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        print(N);
    }
}
