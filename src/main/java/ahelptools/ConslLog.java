package ahelptools;

/**
 * @version 1.0
 * @author Daniils Loputevs (laiwiense@gmail.com)
 */
public class ConslLog {

    public static void log(String desc, Object object) {
        System.out.println("ConslLog: " + desc + ": " + object);
    }
    public static void log(String desc) {
        System.out.println("ConslLog: " + desc);
    }

}
