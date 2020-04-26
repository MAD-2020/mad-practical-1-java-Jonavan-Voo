import java.util.Scanner; 
public class Question4 {
  public static void main(String[] args) {
    //scanner to get user input
    Scanner myObj = new Scanner(System.in);
    //prompt user for base of triangle
    System.out.print("Enter base of triangle: ");
    int base = myObj.nextInt(); //store input
    myObj.close(); //close scanner
    //print triangle
    for (int i = base; i > 0; i--) {
      for (int x = i; x > 0; x--) {
      System.out.print("*");
      } 
      System.out.println();
    } 
  }
}

