import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double result=0.0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int inp=scan.nextInt();

        for(int i=1; i<=inp; i++) {
            result+=(1.0/i);
        }

        System.out.println("Result : "+result);
        scan.close();
    }
}