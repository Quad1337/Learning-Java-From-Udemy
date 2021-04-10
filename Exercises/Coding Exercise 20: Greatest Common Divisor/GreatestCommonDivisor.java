public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first,int second){
        int a;
        if (first < 10 || second < 10)
        return -1;
        if(first > second)
            a = second;
        else a = first;
        while(a != 1) {
            if (first % a == 0 && second % a == 0)
                return a;
            a--;
        }
        return 1;
    }
}
