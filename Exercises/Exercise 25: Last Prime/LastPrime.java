public class LargestPrime {
	public static int getLargestPrime(int number) {
        int i;

        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
                return i;
            }
        }

        return -1;
    }
}
