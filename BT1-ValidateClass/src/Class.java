import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String CLASS_REGEX = "^[ACP]\\d{4}[GHIKLM]$";

    public Class() {
        pattern = Pattern.compile(CLASS_REGEX);
    }
    public boolean validateClass(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

class testClass{
    private static Class aClass = new Class();
    public static String class1 = "C0522G";
    public static String class2 = "C05222G";
    public static String class3 = "A0522G";
    public static String class4 = "A0522G1";

    public static void main(String[] args) {
        System.out.println(aClass.validateClass(class1));
        System.out.println(aClass.validateClass(class2));
        System.out.println(aClass.validateClass(class3));
        System.out.println(aClass.validateClass(class4));
    }
}
