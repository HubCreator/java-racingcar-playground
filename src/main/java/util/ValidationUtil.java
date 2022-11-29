package util;

import enums.ConstVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ValidationUtil {

    public static List<String> getCars(String input) {
        StringTokenizer st = new StringTokenizer(input, ",");
        List<String> result = new ArrayList<>();
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            isValidLength(token);
            result.add(token);
        }
        return result;
    }

    private static void isValidLength(String token) {
        if (token.length() > ConstVariable.MAX_LENGTH.getValue()) {
            throw new IllegalArgumentException();
        }
    }
}
