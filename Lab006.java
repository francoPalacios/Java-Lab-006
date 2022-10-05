import java.util.Scanner;

/*
* this class checks to see if two numbers are divisible.
 */

public class Lab006 {
    int n;
    int m;
/*
*here is our constructor
*/
    public Lab006 (int n, int m) {
        this.n = n;
        this.m = m;
    }
/*
*here is our method that checks whether the two numbers are divisible
*/
    public boolean isDivisible() {
             if (n % m == 0) {
                 return true;
             } else {
                 return false;
             }
         }

/*
*this is out main method to get user input integers to divide, and to print out whether it is true or false.
 */

        public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.println("input integer");
        int n = input.nextInt();

        System.out.println("input next integer");
        int m = input.nextInt();

        Lab006 A = new Lab006(n, m);

        System.out.println( A.isDivisible());

    }




}
