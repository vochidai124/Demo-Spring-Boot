package Hello.com;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Test {
    public static void main(String[] args) {
        String encodedString = "QCAgVv4gSGVsbG8J V29ybGQ=";
        String decodedString = decodeString(encodedString);
        System.out.println("Decoded string: " + decodedString);
    }

    private static String decodeString(String encodedString) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        return new String(decodedBytes, StandardCharsets.UTF_8);
    }
}





