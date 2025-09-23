import java.util.Scanner;

public class Assignment_03_TheKingsTreasury {
    static  int sum(int n){
        if (n == 0) {
        return 0;
    }
    return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        System.out.print(sum(N));
    }
}
