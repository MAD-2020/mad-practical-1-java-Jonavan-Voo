import java.util.Scanner; 
import java.util.ArrayList;
public class Question5 {
  public static void main(String[] args) {
    //create list
    ArrayList<Integer> lst = new ArrayList<>(); 
    //scanner to get user input
    Scanner myObj = new Scanner(System.in);
    //prompt user for number of integers
    System.out.print("Enter number of integers to input: ");
    int numbers = myObj.nextInt(); //store input
    //get inputs from user and add to list
    for (int i = 0; i < numbers; i++) {
      System.out.print("Enter number: ");
      lst.add(myObj.nextInt());
    } 
    myObj.close(); //close scanner
    //initialise mode number and number of occurances
    int modenumber = 0;
    int modecount = 0;
    //check occurances for each number in list
    for (int i = 0; i < lst.size(); i++) {
      int count = 0;
      for (int x = 0; x < lst.size(); x++) {
        if (lst.get(x) == lst.get(i)) {
          count++;
        }
      }
      //replace mode number and number of occurances 
      //if count more than modecount
      if (count > modecount) {
        modecount = count;
        modenumber = lst.get(i);
      }
    }
    //print mode
    System.out.println("Mode: " + modenumber);
  }
}
