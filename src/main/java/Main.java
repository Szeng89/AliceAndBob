import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
public class Main {

    public static void main(String[] args ){
        // create a new object of class Main
        Main main = new Main();

        // call the compute() method on that new object
        main.compute();
    }

    public void compute() {
        // Get input string of name from user
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Whats your name");
        name = scanner.nextLine();
        // Create conditional to check name against Alice and Bob
        if(name.equals("Alice") || name.equals("Bob")){
            System.out.println("Hello, " + name + "!");

        }else{
            System.out.println("You are neither Alice nor bob");

        }
        // Print greeting to screen if Alice or Bob are true
        
        // Print "You are neither Alice nor Bob." otherwise

    }
}
