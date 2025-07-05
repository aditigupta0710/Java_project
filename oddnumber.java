
class oddnumber {
   oddnumber() {
   }

   public static void main(String[] var0) {
      System.out.println("the odd numbers are : ");

      for(int var1 = 1; var1 <= 100; ++var1) {
         if (var1 % 2 != 0) {
            System.out.print("" + var1);
         }
      }

   }
}
