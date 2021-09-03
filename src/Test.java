import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Test {
    public static void main(String[] args) {

        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decoded = decoder.decode("SmF2YSDQvdC1INGC0L7RgNC80L7Qt9C40YIhCg==");
        String s = new String(decoded, StandardCharsets.UTF_8);
        System.out.println(s);
    }
}
