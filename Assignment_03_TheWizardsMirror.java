import java.util.Scanner;
public class Assignment_03_TheWizardsMirror {

    static void print(String S, int n){
       if(n<=0){
           return;
       }
        System.out.print(S.charAt(n-1));
       print(S,n-1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        print(s,s.length());
    }
}
