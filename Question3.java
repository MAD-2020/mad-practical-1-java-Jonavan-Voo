import java.util.Scanner; 
public class Question3 {
  public static void main(String[] args) {
    //scanner to get user input
    Scanner myObj = new Scanner(System.in);
    //prompt user for integer
    System.out.print("Enter a number: ");
    int number = myObj.nextInt(); //store integer input
    myObj.close(); //close scanner
    int result = number * number; //multiply integer by itself
    //print result
    System.out.println("Result: " + result);  
  }
}

