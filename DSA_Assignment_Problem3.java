import java.util.Scanner;

public class DSA_Assignment_Problem3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();

        int arr[][]=new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int arr1[][]=new int[N][M];


        for(int i=0; i<N; i++){
            int k=0;
            for(int j=M-1; j>=0; j--){
                arr1[i][k]=arr[i][j];
                k++;
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

    }
}
