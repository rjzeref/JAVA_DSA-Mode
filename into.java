import java.util.*;
class students 
{
  String s;
  int roll;
  void show()
  {
    System.out.println(s+" "+roll);
  }
}

class into
{
  public static void main(String[] args) 
  {
    students ob = new students();
    ob.s = "Roumo";
    ob.roll = 12345;
    
    ob.show();
  }
}