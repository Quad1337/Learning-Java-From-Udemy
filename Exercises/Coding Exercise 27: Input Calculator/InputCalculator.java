import java.util.Scanner;
 
public class InputCalculator {
  public static void inputThenPrintSumAndAverage(){
         Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        long average = 0;
        double averageSum = 0;

        while(true){

            boolean number = scanner.hasNextInt();

            if(number){
                int value = scanner.nextInt();
                scanner.nextLine();
                count++;

                if (value == 0 ){
                    count --;
                }

                // calcul suma
                sum += value;

                // calcul average
                averageSum += value;
                average = (long) Math.round(averageSum/count);

            }else{
                System.out.println("SUM = " +sum+ " AVG = " +average);
                break;
            }
        }
        scanner.close();
    }
}
