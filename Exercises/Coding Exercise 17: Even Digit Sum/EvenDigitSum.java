public class EvenDigitSum {
     public static int getEvenDigitSum(int number){
        int sum = 0;
        if (number <0){
            return -1;
        } else if (number == 0){
            return 0;
        }else{
            while(number !=0){
                if((number % 10) % 2 == 0)
                    sum = sum +number % 10;
                number = number / 10;
            }
            return sum;
        }
    }
}
