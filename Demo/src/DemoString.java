import java.lang.String;

public class DemoString {
    private static String demo = "ABC";
    private static String demo1 = "abc";
    private static String demo2 = "A";
    private static String demo3 = "69";

    public static void main(String[] args) {
        String input = "Duc Anh";

//        method length()
        System.out.println("method length:");
        System.out.println(input.length());
        System.out.println("-------------------------");
//        method concat()
        System.out.println("method concat: ");
        System.out.println(input.concat(" + " + demo));
        System.out.println("-------------------------");
//        method toLowerCase()
        System.out.println("method toLowerCase: ");
        System.out.println(input.toLowerCase());
        System.out.println("-------------------------");
//        method toUpperCase()
        System.out.println("method toUpperCase: ");
        System.out.println(input.toUpperCase());
        System.out.println("-------------------------");
//        method trim()
        System.out.println("method trim: ");
        System.out.println(input.trim()+" Dz"); // đoạn này sửa example1 cho nó có khoảng cách
        System.out.println("-------------------------");
//        Một số method khác
        System.out.println("Another Method: ");
//        method replace : đổi chuỗi/ký tự sang chuỗi/ký tự mới
        System.out.println(input.replace("c","C"));
        System.out.println(input.replace("Duc Anh","Anh"));
        System.out.println("-------------------------");
//        method isEmpty: kiểm tra xem có rỗng hay ko
        String empty = "";
        System.out.println(input.isEmpty());
        System.out.println(empty.isEmpty());
        System.out.println("-------------------------");

//        đổi chữ sang số
        int value = Integer.parseInt(demo3);
        double value2 = Double.parseDouble(demo3);
    }
}
