// import java.util.Scanner;

public class Main {
  static int fib(int n) {
    int a = 0, b = 1, c;
    if (n == 0)
      return a;
    for (int i = 2; i <= n; i++) {
      c = a + b;
      a = b;
      b = c;
    }
    return b;
  }

  public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);
    //
    // System.out.print("n = ");
    // int n = input.nextInt();

    for (int i = 0; i <= 20; i++) {
      System.out.println(fib(i));
    }

    // input.close();
  }
}
