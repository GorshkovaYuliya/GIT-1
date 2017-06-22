//Owner: Gorshkova Yuliya
public class Counting {
  public static void main(String[] args) {
    System.out.println("Tutti-frutti changing");
    for (int i = 0; i <= 100; i ++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("Tutti-Frutti");
      } else if (i % 3 == 0) {
        System.out.println("Tutti");
      } else if (i % 5 == 0) {
        System.out.println("Frutti");
      } else { 
        System.out.println(i);
      }
    }
  }
}

