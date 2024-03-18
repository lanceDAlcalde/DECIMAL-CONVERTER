
import java.util.Scanner;

public class DecimalConverter {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      
      System.out.println("===CONVERTER===");
      System.out.println("===============");
        System.out.print("Input number: "); int decimal = scanner.nextInt();
        System.out.print("BINARY: "); binary(decimal);
        System.out.print("HEXADECIMAL: "); hexadecimal(decimal);
        System.out.print("OCTAL: "); octal(decimal);
    }

  public static void binary(int n) {

   if (n != 0) {
    String binary = Integer.toBinaryString(n);
    System.out.println(binary);
   }

  }  

  public static void hexadecimal(int n) {

    if ( n != 0) {
    String hexadecimal = Integer.toHexString(n);
    System.out.println(hexadecimal);
   }  

}

   public static void octal(int n) {

    if ( n != 0) {
    String octal = Integer.toOctalString(n);
    System.out.println(octal);
   }  
}

}