import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String PHONE = "^\\d{2}-\\d{10}$";

    public PhoneNumberExample() {
        pattern = Pattern.compile(PHONE);
    }

    public boolean validatePhone(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
