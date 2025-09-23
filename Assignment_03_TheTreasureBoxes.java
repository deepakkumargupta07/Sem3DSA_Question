import java.util.Scanner;

public class Assignment_03_TheTreasureBoxes {
    static int sum(int a[],int N){
        if( N<0){
            return 0;
        }
        return a[N]+sum(a,N-1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(sum(arr,n-1));

    }
}
