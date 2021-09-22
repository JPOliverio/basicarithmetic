import java.lang.Math;



public class BasicArithmetic{

  public BasicArithmetic(){
  }

  //**********************Addition*****************************
  //Addition with int
  public static int addInt(int x, int y){ return x+y;}
  //Addition with float
  public static float addFloat(float x, float y){ return x+y;}

  //**********************Subtraction***************************
  //Subtraction with int
  public static int subtractInt(int x, int y){return x-y;}
  //Subtraction with float
  public static float subtractFloat(float x, float y){return x-y;}
 
  //************************Division*****************************
  //Division with int
  public static int divideInt(int x, int y){
    int z=0;
    try{  // The try-catch is to prevent division by zero. It reports the best represntation for infinity
      z=x/y;
    }catch(ArithmeticException e){
      z=Integer.MAX_VALUE; //this will represent the closest number to infinity for an int
    }
    return z;
  }
  //Division with float
  public static float divideFloat(float x, float y){
    float z=0;
    try{  // The try-catch is to prevent division by zero. It reports the best represntation for infinity
      z=x/y;
    }catch(ArithmeticException e){
      z=Float.POSITIVE_INFINITY; //
    }
    return z;
  }
  
  //************************Squareroot*****************************
  //Squareroot for int
  public static int sqrtInt(int x){return (int)Math.sqrt((double)x);}
  //Squareroot for float
  public static float sqrtFloat(float x){return (float)Math.sqrt((double)x);}
  
  //************************Exponent*****************************
  //Exponent with int
  public static int exponentInt(int x, int y){return (int)Math.pow((double)x, (double)y);}
  //Exponent with float
  public static float exponentFloat(float x, float y){return (float)Math.pow((double)x, (double)y);}
  
  //*******************Data Type Conversion************************
  // The below section is for converting between binary, octal, hexadecimal, and integers.  
  //int to binary
  public static String intToBinary(int number){ return Integer.toBinaryString(number);} 
  //int to octal
  public static String intToOctal(int number){ return Integer.toOctalString(number);} 
  //int to hexadecimal
  public static String intToHex(int number){ return Integer.toHexString(number);}   
  //binary to int
  public static int binaryToInt(String binaryString){ return Integer.parseInt(binaryString,2);} 
  //octal to int
  public static int octalToInt(String octalString){ return Integer.parseInt(octalString,8);} 
  //hexadecimal to int
  public static int hexToInt(String hexadecimalString){ return Integer.parseInt(hexadecimalString,16);}
  


  
  
}
