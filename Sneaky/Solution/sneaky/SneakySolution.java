package sneaky;

import creator.HiddenClass;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.VarHandle;

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
public class SneakySolution {
    public static void main(String[] args) throws Throwable {
        MethodHandles.Lookup lookup = HiddenClass.create();
        behavior(lookup);
    }

    public static void behavior(MethodHandles.Lookup lookup) throws Throwable {
        // If you debugged/analyzed the code in HiddenClass#create
        // and the methods invoked from there, you'd notice it only
        // stores the previousLookupClass if a module boundary was
        // crossed, so this line of code ONLY works because we have now
        // put ourselves in a java module, hence the module-info.java!
        // The file structure of this solution may change to make
        // this work in your environment :)
        Class<?> hiddenClass = lookup.previousLookupClass();

        lookup = MethodHandles.privateLookupIn(hiddenClass, MethodHandles.lookup());
        VarHandle able = lookup.findStaticVarHandle(hiddenClass, "able", boolean.class);
        able.set(true);
        MethodHandle canYouCallMe = lookup.findStatic(
            hiddenClass,
            "canYouCallMe",
            MethodType.methodType(void.class)
        );
        canYouCallMe.invoke();
    }
}
