import java.lang.String;

public class DemoString {
    private static String demo = "ABC";
    private static String demo1 = "abc";
    private static String demo2 = "A";
    private static String demo3 = "69";

    public static void main(String[] args) {
        String input = "Duc Anh";

//        method length()
        System.out.println(input.length());
//        method concat()
        System.out.println(input.concat(" + " + demo));
//        method toLowerCase()
        System.out.println(input.toLowerCase());
//        method toUpperCase()
        System.out.println(input.toUpperCase());
//        method trim()
        System.out.println(input.trim()+" Dz");
//        Một số method khác
//        method replace : đổi chuỗi/ký tự sang chuỗi/ký tự mới
        System.out.println(input.replace("c","C"));
        System.out.println(input.replace("Duc","Anh"));

    }
}
