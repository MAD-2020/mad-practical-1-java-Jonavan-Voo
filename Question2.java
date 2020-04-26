import java.util.Scanner; 
public class Question2 {
  public static void main(String[] args) {
    //scanner to get user input
    Scanner myObj = new Scanner(System.in);
    //prompt user for height and weight
    System.out.print("Enter height (in m): ");
    float height = myObj.nextFloat(); //store user height
    System.out.print("Enter weight (in kg): "); //store user weight
    float weight = myObj.nextFloat();
    myObj.close(); //close scanner
    //print user's height and weight
    System.out.println("Height: " + height + "m"); 
    System.out.println("Weight: " + weight + "kg"); 
  }
}

