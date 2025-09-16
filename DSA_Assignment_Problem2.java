import java.util.Scanner;

public class DSA_Assignment_Problem2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int arr[][]=new int[N][N];

        for(int i=0; i<N; i++ ){
            for(int j=0;j<N; j++ ){
                arr[i][j]=sc.nextInt();
            }
        }

        int Sum1=arr[0][0];
        for(int i=1; i<N; i++){
            Sum1=Sum1+arr[i][i];
        }

        int Sum2=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(i+j==N-1){
                    Sum2=Sum2+arr[i][j];
                }
            }
        }

        System.out.println(Sum1);
        System.out.println(Sum2);

    }
}
