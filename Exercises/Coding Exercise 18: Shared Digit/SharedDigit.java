public class SharedDigit {
  public static boolean hasSharedDigit(int first,int second){
   if((first >=10 && first <=99) && (second >=10 && second <=99 )){
            int firsts = first % 10;
            int seconds = second % 10;
            first /= 10;
            second /= 10;
            int ffirsts = first;
            int fseconds = second;
            return ((ffirsts == fseconds) || (ffirsts == seconds) || (firsts == fseconds) || (firsts == seconds));
        } else return false;

    }
}
