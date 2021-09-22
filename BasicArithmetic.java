import java.lang.Math;



public class BasicArithmetic{

  public BasicArithmetic(){
  }
  

  //addition
  public static int addInt(int x, int y){ return x+y;}

  public static float addFloat(float x, float y){ return x+y;}

  //subtraction
  public static int subtractInt(int x, int y){return x-y;}

  public static float subtractFloat(float x, float y){return x-y;}
 
  //division
  public static int divideInt(int x, int y){
    int z=0;
    try{
      z=x/y;
    }catch(ArithmeticException e){
      z=Integer.MAX_VALUE; //this will represent the closest number to infinity for an int
    }
    return z;
  }

  public static float divideFloat(float x, float y){
    float z=0;
    try{
      z=x/y;
    }catch(ArithmeticException e){
      z=Float.POSITIVE_INFINITY; //
    }
    return z;
  }
  
  //squareRoot
  public static int sqrtInt(int x){return (int)Math.sqrt((double)x);}

  public static float sqrtFloat(float x){return (float)Math.sqrt((double)x);}

  //exponent
  public static int exponentInt(int x, int y){return (int)Math.pow((double)x, (double)y);}
  public static float exponentFloat(float x, float y){return (float)Math.pow((double)x, (double)y);}
  
  // The below section is for converting between binary, octal, hexadecimal, and integers.  
  public static String intToBinary(int number){ return Integer.toBinaryString(number);}  //int to binary
  
  public static String intToOctal(int number){ return Integer.toOctalString(number);}  //int to octal

  public static String intToHex(int number){ return Integer.toHexString(number);}    //int to hexadecimal
  
  public static int binaryToInt(String binaryString){ return Integer.parseInt(binaryString,2);} //binary to int
  
  public static int octalToInt(String octalString){ return Integer.parseInt(octalString,8);} //octal to int
    
  public static int hexToInt(String hexadecimalString){ return Integer.parseInt(hexadecimalString,16);} //hexadecimal to int
  


  
  
}
