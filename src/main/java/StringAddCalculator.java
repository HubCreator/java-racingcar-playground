
public class StringAddCalculator {
    public static int splitAndSum(String input) {
        if (input.isBlank() || input.isEmpty()) return 0;
        int index = 0, sum = 0;
        while (index < input.length()) {
            if (input.charAt(index) == '-') {
                throw new RuntimeException();
            }
            if (Character.isDigit(input.charAt(index))) {
                sum += input.charAt(index) - '0';
            }
            index++;
        }
        return sum;
    }
}
