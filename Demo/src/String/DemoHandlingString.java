package String;

public class DemoHandlingString {
    private static String example1 = "DucAnh";

    public static void main(String[] args) {
        String demo1 = "DucAnh";
        String demo2 = demo1.toLowerCase(); //ducanh
        System.out.println(example1.length());

//        method equals()
        System.out.println("Method equals :");
        System.out.println(example1.equals(demo1));
        System.out.println(example1.equals(demo2));
        System.out.println("----------------------------");
//        method equalsIgnoreCase()
        System.out.println("Method equalsIgnoreCase :");
        System.out.println(example1.equalsIgnoreCase(demo1));
        System.out.println(example1.equalsIgnoreCase(demo2));
        System.out.println("----------------------------");
//        method compareTo()
        System.out.println("Method compareTo :");
        System.out.println(example1.compareTo(demo1));
        System.out.println(example1.compareTo(demo2));
        System.out.println("----------------------------");
//        method compareToIgnoreCase()
        System.out.println("Method compareToIgnoreCase :");
        System.out.println(example1.compareToIgnoreCase(demo1));
        System.out.println(example1.compareToIgnoreCase(demo2));
        System.out.println("----------------------------");
//        method startWith()
        System.out.println("Method startWith :");
        System.out.println(example1.startsWith("D"));
        System.out.println(example1.startsWith("d"));
        System.out.println(example1.startsWith("A"));
//        System.out.println(example1.startsWith(" "));
        System.out.println(example1.startsWith("!"));
        System.out.println("----------------------------");
//        method endWith()
        System.out.println("Method endWith :");
        System.out.println(example1.endsWith("h"));
        System.out.println(example1.endsWith("H"));
        System.out.println(example1.endsWith("Dz!"));
        System.out.println("----------------------------");
//        method contains()
        System.out.println("Method contains :");
        System.out.println(example1.contains("c"));
        System.out.println(example1.contains("C"));
        System.out.println(example1.contains("Duc"));
    }
}
