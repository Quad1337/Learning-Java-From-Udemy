public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if ((a > 9 && a < 1001) && (b > 9 && b < 1001) && (c > 9 && c < 1001)) {
            a = a % 10;
            b = b % 10;
            c = c % 10;
            if ((a == b) || (b == c) || (c == a) || (a == b && b == c && a == c)) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }
    public static boolean isValid(int num){
        if(num>9&&num<1001){
            return true;
        }
        return false;
    }
}
