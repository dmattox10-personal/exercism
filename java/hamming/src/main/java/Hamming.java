public class Hamming
{
    public static int compute(String s1, String s2) {
        validateInputs(s1, s2);

        int hammingDistance = 0;
        int stringLength = s1.length();

        for (int i = 0; i < stringLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                hammingDistance++;
            }
        }
        return hammingDistance;
    }

    private static void validateInputs(String s1, String s2) {
        if (s1.length() != s2.length()) {
            throw new IllegalArgumentException();
        }
    }
}

