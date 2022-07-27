package StringBuilder;

public class DemoStringBuilder {
    public static void main(String[] args) {
//    1 Phương thức append() của lớp StringBuilder nối thêm tham số vào cuối chuỗi.
//        StringBuilder sb = new StringBuilder("Hello ");
//        sb.append("Java");//đến đây chuỗi ban đầu đã bị thay đổi
//        System.out.println(sb);//in Hello Java

//         System.out.println("--------------------------2--------------------------");
//    2 Phương thức insert() của lớp StringBuilder chèn chuỗi vào chuỗi này từ vị trí quy định.
//        StringBuilder sb1 = new StringBuilder("Hello ");
//        sb1.insert(-1, "Java");//đến đây chuỗi ban đầu đã bị thay đổi
//        System.out.println(sb1);//in -> HJavaello


//        System.out.println("--------------------------3--------------------------");
//    3 Phương thức replace() của lớp StringBuilder thay thế chuỗi bằng chuỗi khác từ vị trị bắt
//    đầu và kết thúc được quy định.
//        StringBuilder sb2 = new StringBuilder("Hello");
//        sb2.replace(1, 3, "Java");
//        System.out.println(sb2);//in -> HJavalo
//
//
//        System.out.println("--------------------------4--------------------------");
//    4 Phương thức replace() của lớp StringBuilder xóa chuỗi từ vị trị bắt đầu và kết thúc được quy định.
//        StringBuilder sb3 = new StringBuilder("Hello");
//        sb3.delete(1, 3);
//        System.out.println(sb3);//in -> Hlo
//
//
//        System.out.println("--------------------------5--------------------------");
//    5 Phương thức reverse() của lớp StringBuilder đảo ngược chuỗi hiện tại.
//        StringBuilder sb4 = new StringBuilder("Hello");
//        sb4.reverse();
//        System.out.println(sb4);//in -> olleH
//
//
//        System.out.println("--------------------------6--------------------------");
//    6. Phương thức capacity() của lớp StringBuilder trả về dung lượng của bộ nhớ đệm.
//    Dung lượng mặc định của bộ nhớ đệm là 16.
//    Nếu số lượng ký tự của chuỗi tăng lên thì dung lượng được tính theo công thức (dung lượng cũ*2)+2
//        StringBuilder sb5 = new StringBuilder();
//        System.out.println("sb5 capa1 " + sb5.capacity());//mặc định là 16
//        sb5.append("asldkfasldkfasdfr");
////        System.out.println(sb5.capacity());//đến đây vẫn là 16
//       // sb5.append("java là ngôn ngữ yêu thích của tôi");
////        sb5.append("java là ngôn ngữ yêu");
//        System.out.println("length sb5: " + sb5.length());
//        System.out.println(sb5.capacity());//đến đây là (16*2)+2=34 i.e (dung lượng cũ*2)+2
////        (34*2) + 2
//        sb5.append("a");
//        System.out.println("a1 "+sb5.capacity());
//
//
//        System.out.println("--------------------------7--------------------------");
//    7. Phương thức ensureCapacity() của lớp StringBuilder đảm bảo rằng dung lượng đã cho là tối
//    thiểu với dung lượng hiện tại.
//    Nếu nó lớn hơn dung lượng hiện tại, dung lượng hiện tại được tăng theo công thức (dung lượng cũ*2)+2
//        StringBuilder sb6 = new StringBuilder();
//        System.out.println(sb6.capacity());//mặc định là 16
//        sb6.append("Hello");
//        System.out.println(sb6.capacity());//đến đây là 16
//        sb6.append("java là ngôn ngữ yêu thích của tôi");
//        System.out.println(sb6.capacity());//đến đây là (16*2)+2=34 i.e (dung lượng cũ*2)+2
//        sb6.ensureCapacity(10);//đến đây không có sự thay đổi
//        System.out.println(sb6.capacity());//đến đây là 34
//        sb6.ensureCapacity(50);//đến đây là (34*2)+2
//        System.out.println(sb6.capacity());//đến đây là 70


    //        System.out.println("--------------------------8--------------------------");
//     8. public char charAt(int index): được sử dụng trả về ký tự tại vị trí quy định. Index bắt đầu từ 0.
//        String name = "hello java";
//        char ch = name.charAt(4);
//        System.out.println(ch);
//
//
//        System.out.println("--------------------------9--------------------------");
//     9. public int length(): được sử dụng trả về chiều dài của chuỗi nghĩa là tổng số ký tự.
//        String txt = "Chào Mừng Bạn Đến Với C0522G1";
//        String txt1="java is my favourite languagehghghg";
//        System.out.println(txt.length());
//        System.out.println(txt1.length());
//
//
//        System.out.println("--------------------------10--------------------------");
//     10. public String substring(int beginIndex):
//     + được sử dụng trả về chuỗi con bắt đầu từ vị trí được chỉ định.
//        String s1="CodeGym";
//        System.out.println(s1.substring(2,4));
//        System.out.println(s1.substring(2));
//
//
//        System.out.println("--------------------------11--------------------------");
//     11. public String substring(int beginIndex, int endIndex):
//     + được sử dụng trả về chuỗi con với vị trí bắt đầu và vị trí kết thúc được chỉ định.
//     + Phương thức này có hai biến thể và trả về một chuỗi mới là chuỗi con của chuỗi này.
//     Chuỗi con bắt đầu bằng ký tự tại index được chỉ định và kéo dài đến cuối chuỗi này
//     hoặc lên đến endIndex - 1, nếu đối số thứ hai được đưa ra.
    String Str = new String("Welcome to CodeGym");
        System.out.print("Giá trị trả lại :" );
        System.out.println(Str.substring(10, 15) );


        System.out.println("--------------------------12--------------------------");
//      12.Phương thức toString ():
//        + là phương thức có sẵn được sử dụng để trả về một chuỗi đại diện cho dữ liệu
//        được chứa bởi Đối tượng StringBuilder
//        + Một đối tượng String mới được tạo và khởi tạo để lấy chuỗi ký tự từ đối tượng
//        StringBuilder này và sau đó String được trả về bởi toString ()
//
//
// Tạo một đối tượng StringBuilder
//        // với một chuỗi làm tham số
//        StringBuilder str = new StringBuilder("GeeksForGeeks");
//        // In và hiển thị chuỗi
//        // using standard toString() method
//        System.out.println("String contains = " + str.toString());

    // Mảng ngẫu nhiên của chuỗi làm đầu vào
    String gfg[] = { "Bạn", "Là", "Học Viên", "CodeGym" };

    // Tạo đối tượng của lớp StringBuilder
    StringBuilder obj = new StringBuilder();

    // Thêm các mảng chuỗi ở trên vào
    // Đối tượng Stringbuilder
        obj.append(gfg[0]);
        obj.append(" " + gfg[1]);
        obj.append(" " + gfg[2]);
        obj.append(" " + gfg[3]);

    // Ta tạo một chuỗi đơn
    String str = obj.toString();

    // In và hiển thị chuỗi trên chứa tất cả các chuỗi dưới dạng một chuỗi duy nhất
    // sử dụng phương thức toString ()
        System.out.println(
                "Chuỗi đơn được tạo bằng phương thức toString () là: " + str);
}
///////////////////////////////////////////////////////////////////////////
//  Các Constructor quan trọng của lớp StringBuilder trong java
// + StringBuilder(): Tạo ra một Builder chuỗi với dung lượng ban đầu là 16.
// + StringBuilder(String str): Tạo ra một Builder chuỗi với chuỗi cụ thể.
// +StringBuilder(int capacity): Tạo ra một Builder chuỗi với dung lượng được chỉ định như độ dài chuỗi.
///////////////////////////////////////////////////////////////////////////
}
