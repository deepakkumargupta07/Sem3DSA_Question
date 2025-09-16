import java.util.Scanner;

public class DSA_Assignment_Problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int N=sc.nextInt();

        int arr[][]= new int[N][N];
        int temp=1;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(temp>9){
                    temp=1;
                }
                arr[i][j]=temp;
                temp++;
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        if (ch=='X') {
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(i==j || i+j==N-1){
                        sum=sum+arr[i][j];
                    }else{
                        arr[i][j]=0;
                    }
                }
            }
        } else if (ch=='D') {
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(i==0 || j==0 || i==N-1 || j==N-1){
                        sum=sum+arr[i][j];
                    }else{
                        arr[i][j]=0;
                    }
                }
            }
        } else if (ch=='Z') {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == 0 || i == N - 1 || i + j == N - 1) {
                        sum = sum + arr[i][j];
                    } else {
                        arr[i][j] = 0;
                    }
                }
            }
        }
        
        System.out.println();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(sum);
    }
}
