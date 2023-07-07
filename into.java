import java.util.Scanner;

class into {
  String name;
  int roll;

  into(String name, int roll) 
  {
    this.name = name;
    this.roll = roll;
  }

  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    into ob[] = new into[3];
    for (int i = 0; i < ob.length; i++) 
    {
      System.out.println("Enter Data ");
      ob[i] = new into(in.next(), in.nextInt());
    }
    
    for (into o : ob) 
    {
      System.out.println(o.name);
    }
  }
}