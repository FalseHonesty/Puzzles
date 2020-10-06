import java.lang.reflect.Field;

/**
 * Can you make the output of this program print
 * 2 + 2 = 5
 * for one or both lines? Be creative with your solution!
 * Good luck!
 */
public final class Solution1 {
    public static void main(String[] args) throws Exception {
        Solution1.behavior();
        int x = 2;
        System.out.println("2 + 2 = 4");
        System.out.println("2 + 2 = " + (x + 2));
    }

    private static void behavior() throws Exception {
		// ALL of your code has to stay in this method.
        String s = "2 + 2 = 4";
        Field value = String.class.getDeclaredField("value");
        value.setAccessible(true);
        char[] ar= (char[]) value.get(s);
        ar[ar.length - 1] = '5';
    }
}