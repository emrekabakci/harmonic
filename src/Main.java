import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variables defined.
        double result=0.0;

        //Scanner created.
        Scanner inp = new Scanner(System.in);

        //Data retrieved from user.
        System.out.print("Please enter a number : ");
        int enteredNum = inp.nextInt();

        //Harmonic series calculated.
        for(int i=1; i <= enteredNum; i++) {
            result+=(1.0/i);
        }

        //Result printed
        System.out.println("Result : "+result);
    }
}