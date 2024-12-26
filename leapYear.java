// 23524202064 => Punam
import java.util.Scanner;

public class leapYear {
   public leapYear() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a year: ");
      int var2 = var1.nextInt();
      if (isLeapYear(var2)) {
         System.out.println("" + var2 + " is a leap year.");
      } else {
         System.out.println("" + var2 + " is not a leap year.");
      }

      var1.close();
   }

   public static boolean isLeapYear(int var0) {
      if (var0 % 4 == 0) {
         if (var0 % 100 == 0) {
            return var0 % 400 == 0;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }
}
