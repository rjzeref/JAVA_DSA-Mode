import java.util.Arrays;

public class q3 {
    int sum(int n[])
    {
        return Arrays.stream(n).sum();
    }
    public static void main(String args[]) {
        q3  ob = new q3 ();
        int x = ob.sum(new int[] { 3, 4, 5, 6 });
        System.out.println(x);
    }

}
