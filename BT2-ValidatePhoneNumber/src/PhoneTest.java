public class PhoneTest {
    public static void main(String[] args) {
        PhoneNumberExample phone = new PhoneNumberExample();
        String phone1 = "84-0978489648";
        String phone2 = "a4-0978489648";
        String phone3 = "84-09784899648";
        System.out.println(phone.validatePhone(phone1));
        System.out.println(phone.validatePhone(phone2));
        System.out.println(phone.validatePhone(phone3));

    }
}
