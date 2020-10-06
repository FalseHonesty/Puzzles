/**
 * Can you make the output of this program print
 * 2 + 2 = 5
 * for both lines? Be creative with your solution!
 * If you've managed that, can you make the first line
 * print normally, and make only the second line print
 * 2 + 2 = 5?
 * Good luck!
 */
public final class ThatAddsUp {
    public static void main(String[] args) throws Exception {
        ThatAddsUp.behavior();
        int x = 2;
        System.out.println("2 + 2 = 4");
        System.out.println("2 + 2 = " + (x + 2));
    }

    private static void behavior() throws Exception {
		// ALL of your code has to stay in this method.
    }
}