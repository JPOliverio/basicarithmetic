import java.lang.Math;



public class BasicArithmetic{

  public BasicArithmetic(){
  }
  
  addition
    
  subtraction
    
  division
  
  squareRoot
    
  exponent
  
  // The below section is for converting between binary, octal, hexadecimal, and integers.  
  public static String intToBinary(int number){ return Integer.toBinaryString(number);}  //int to binary
  
  public static String intToOctal(int number){ return Integer.toOctalString(number);}  //int to octal

  public static String intToHex(int number){ return Integer.toHexString(number);}    //int to hexadecimal
  
  public static int binaryToInt(String binaryString){ return Integer.parseInt(binaryString,2);} //binary to int
  
  public static int octalToInt(String octalString){ return Integer.parseInt(octalString,8);} //octal to int
    
  public static int haxToInt(String hexadecimalString){ return Integer.parseLong(hexadecimalString,16);} //hexadecimal to int
  


  
  
}
