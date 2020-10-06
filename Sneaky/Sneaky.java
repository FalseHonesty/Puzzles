package sneaky;

import creator.HiddenClass;

import java.lang.invoke.MethodHandles;

/**
 * In this challenge, you'll have to figure out the goal by
 * investigating the two jar files provided in this same folder.
 * It will be obvious enough once you've found it (you'll need to make
 * something print!).
 * You'll also need to make sure the provided jar files are added as
 * libraries in your IDE in order to make this project executable,
 * as well as JDK 15 (preview enabled).
 * Note, you cannot modify any code from the files PROVIDED ;), excluding 
 * the behavior method below of course.
 * Also, as an added challenge, no usage of java.lang.reflect!
 */
public class Sneaky {
    public static void main(String[] args) throws Throwable {
        MethodHandles.Lookup lookup = HiddenClass.create();
        behavior(lookup);
    }

    public static void behavior(MethodHandles.Lookup lookup) throws Throwable {
        // Change code here!
    }
}
