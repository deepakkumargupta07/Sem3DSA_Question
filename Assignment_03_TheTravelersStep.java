import java.util.Scanner;

public class Assignment_03_TheTravelersStep {
    static int countWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }

        return countWays(n - 1) + countWays(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(countWays(n));
    }
}
