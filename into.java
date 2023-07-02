class into {
  int a = 0;
  int b = 1, c;

  int fibo(int n) {
    if (n == 1)
      return 0;
    c = a + b;
    a = b;
    b = c;
    return fibo((n - 1));
  }

  public static void main(String args[]) {
    into ob = new into();
    System.out.println(ob.fibo(9));
  }
}