import java.util.Scanner;
import java.util.ArrayList;

public class Sequence {
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    System.out.println("Write anticipated non-decreasing sequence");
    System.out.println("If you finish with your row enter word end");
    ArrayList<Integer> seqNumb= new ArrayList<Integer>();
    while (true) {
      if (input.hasNextInt() == false) {
        break;
      }
      seqNumb.add(input.nextInt());    
    }
    for (int numb = 0; numb < seqNumb.size() - 1; numb++) {                 
      if (seqNumb.get(numb + 1) < seqNumb.get(numb)) {
        System.out.println("This is not non-decreasing sequence");
        break;
      } else if (numb == seqNumb.size() - 2) {
        System.out.println("This is non-decreasing sequence");
      }
    }
  }
}
