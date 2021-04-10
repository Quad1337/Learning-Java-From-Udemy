public class NumberPalindrome {
        public static boolean isPalindrome(int number){
        
        int reverse = 0;
        int aux = number;
        while (aux != 0){
            reverse = reverse * 10 +aux % 10;
            aux = aux /10;
        }
        if (reverse == number)
            return true;
        else return false;
    }
}
