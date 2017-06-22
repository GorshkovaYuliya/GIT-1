//Gorshkova Yuliya
public class Counting {
  public static void main(String[] args) {
    System.out.println("This program shows numbers from 0 till 100");
    for (int i = 0; i <= 100; i ++) {
      int n = i / 3;
      if (i % 3 == 0) {
        System.out.println("3*" + n);
      } else {
        System.out.println(i);
      }
    }
  }
}
  


