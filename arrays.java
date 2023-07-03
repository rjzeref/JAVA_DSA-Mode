import java.util.*;
public class arrays 
{
    public static void main(String args[]) 
    {
        int r[] = new int[4];
        int r1[] = new int[4];
        int t[] = { 2, 8, -1, 0 };

        Arrays.fill(r, 1);
        r1 = Arrays.copyOf(r, 4);
        int d = Arrays.compare(r, r1);
        boolean d1 = Arrays.equals(r, r1);
        Arrays.sort(t);
        String s = Arrays.toString(t);

        
    }
}
