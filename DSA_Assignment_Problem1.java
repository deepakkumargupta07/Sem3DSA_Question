import java.util.Scanner;

public class DSA_Assignment_Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of rows (N) : ");
        int N = sc.nextInt();
//        System.out.print("Enter the number of columns (M) : ");
        int M = sc.nextInt();
        int arr[][]=new int[N][M];
        int arr1[]=new int[N];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<N;i++){
            int sum=arr[i][0];
            for(int j=1; j<M; j++){
                sum=sum+arr[i][j];
            }
            arr1[i]=sum;
        }
        int index=0;
        int max=arr1[0];
        for(int i=1; i<N;i++){
            if(max<arr1[i]){
                max=arr1[i];
                index=i;
            }else if(max==arr1[i]){
                index=i-1;
                continue;

            }else{
                continue;
            }
        }
        System.out.println(index);

    }
}
