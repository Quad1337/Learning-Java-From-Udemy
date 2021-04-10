public class IntEqualityPrinter {
    public static void printEqual(int par1, int par2, int par3){
              if (par1 <0 || par2 <0 || par3 <0){
            System.out.println("Invalid Value");
        } else if ( par1 == par2 && par2 == par3){
            System.out.println("All numbers are equal");
        } else if ( par1 != par2 && par2 != par3 && par1 != par3){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
