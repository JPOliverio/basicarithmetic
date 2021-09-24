import java.lang.Math;



public class BasicArithmetic{

  public BasicArithmetic(){
  }

  //**********************Addition*****************************
  //Addition with int types
  public static int addInt(int x, int y){ return x+y;}

  //Addition with float types
  public static float addFloat(float x, float y){ return x+y;}

  //Addition for binary string types
  public static String addBinary(String binaryStringX, String binaryStringY){
    int z=0; //place holder for result
    int x = binaryToInt(binaryStringX);
    int y = binaryToInt(binaryStringY);
    z=x+y;
    return intToBinary(z);}

  //Addition for octal string types
  public static String addOctal(String octalStringX, String octalStringY){
   int z=0; //place holder for result
   int x = octalToInt(octalStringX);
   int y = octalToInt(octalStringY);
   z=x+y;
   return intToOctal(z);}

  //Addition for hexadecimal types
  public static String addHex(String hexadecimalStringX, String hexadecimalStringY){
   int z=0; //place holder for result
   int x = hexToInt(hexadecimalStringX);
   int y = hexToInt(hexadecimalStringY);
   z=x+y;
   return intToHex(z);}
    

  //**********************Subtraction***************************
  //Subtraction with int
  public static int subtractInt(int x, int y){return x-y;}

  //Subtraction with float
  public static float subtractFloat(float x, float y){return x-y;}

  //Subtraction for binary string types
  public static String subtractBinary(String binaryStringX, String binaryStringY){
   int z=0; //place holder for result
   int x=binaryToInt(binaryStringX);
   int y=binaryToInt(binaryStringY);
   z=x-y;
   return intToBinary(z);}

  //Subtraction for octal string types
  public static String subtractOctal(String octalStringX, String octalStringY){
   int z=0; //place holder for result
   int x=octalToInt(octalStringX);
   int y=octalToInt(octalStringY);
   z=x-y;
   return intToOctal(z);}

  //Subtraction for hexadecimal types
  public static String subtractHex(String hexadecimalStringX, String hexadecimalStringY){
   int z=0; //place holder for result
   int x=hexToInt(hexadecimalStringX);
   int y=hexToInt(hexadecimalStringY);
   z=x-y;
   return intToHex(z);}

  //**********************Multiplication***************************
  //Multiplication with int
  public static int multiplicationInt(int x, int y){return x*y;}

  //Multiplication with float
  public static float multiplicationFloat(float x, float y){return x*y;}

  //Multiplication for binary string types
  public static String multiplicationBinary(String binaryStringX, String binaryStringY){
   int z=0; //place holder for result
   int x=binaryToInt(binaryStringX);
   int y=binaryToInt(binaryStringY);
   z=x*y;
   return intToBinary(z);}

  //Multiplication for octal string types
  public static String multiplictionOctal(String octalStringX, String octalStringY){
   int z=0; //place holder for result
   int x=octalToInt(octalStringX);
   int y=octalToInt(octalStringY);
   z=x*y;
   return intToOctal(z);}

  //Multiplication for hexadecimal types
  public static String multiplicationHex(String hexadecimalStringX, String hexadecimalStringY){
   int z=0; //place holder for result
   int x=hexToInt(hexadecimalStringX);
   int y=hexToInt(hexadecimalStringY);
   z=x*y;
   return intToHex(z);}
    
 
  //************************Division*****************************
  //Division with int
  public static int divideInt(int x, int y){
    int z=0;
    try{  // The try-catch is to prevent division by zero. It reports the best represntation for infinity
      z=x/y;
    }catch(ArithmeticException e){
      z=Integer.MAX_VALUE; //this will represent the closest number to infinity for an int
    }
    return z;}

  //Division with float
  public static float divideFloat(float x, float y){
    float z=0;
    try{  // The try-catch is to prevent division by zero. It reports the best represntation for infinity
      z=x/y;
    }catch(ArithmeticException e){
      z=Float.POSITIVE_INFINITY; 
    }
    return z;}

  //Division with binary string type
  public static String divideBinary(String binaryStringX, String binaryStringY){
    int x = binaryToInt(binaryStringX);
    int y = binaryToInt(binaryStringY);
    int z = divideInt(x,y);
    return intToBinary(z);}

  //Division with octal string type
  public static String divideOctal(String octalStringX, String octalStringY){
    int x = octalToInt(octalStringX);
    int y = octalToInt(octalStringY);
    int z = divideInt(x,y);
    return intToOctal(z);}

  //Division with hexadecimal 
  public static String divideHex(String hexadecimalStringX, String hexadecimalStringY){
    int x = hexToInt(hexadecimalStringX);
    int y = hexToInt(hexadecimalStringY);
    int z = divideInt(x,y);
    return intToHex(z);}
  
  
  //************************Squareroot****************************
  //Squareroot for int
  public static int sqrtInt(int x){return (int)Math.sqrt((double)x);}

  //Squareroot for float
  public static float sqrtFloat(float x){return (float)Math.sqrt((double)x);}

  //Squareroot for binary
  public static String sqrtBinary(String binaryString){ 
    int x = binaryToInt(binaryString);
    int z = (int)Math.sqrt(x);
    return intToBinary(z);}

  //Squareroot for octal
  public static String sqrtOctal(String octalString){ 
    int x = octalToInt(octalString);
    int z = (int)Math.sqrt(x);
    return intToOctal(z);}

  //Squareroot for hexadecimal 
  public static String sqrtHex(String hexadecimalString){ 
    int x = hexToInt(hexadecimalString);
    int z = (int)Math.sqrt(x);
    return intToHex(z);}
  
  //************************Exponent*****************************
  //Exponent with int
  public static int exponentInt(int x, int y){return (int)Math.pow((double)x, (double)y);}

  //Exponent with float
  public static float exponentFloat(float x, float y){return (float)Math.pow((double)x, (double)y);}

  //Exponent for binary
  public static String exponentBinary(String binaryStringX, String binaryStringY){ 
    int x = binaryToInt(binaryStringX);
    int y = binaryToInt(binaryStringY);
    int z = (int)Math.pow(x,y);
    return intToBinary(z);}

  //Exponent for octal
  public static String exponentOctal(String octalStringX, String octalStringY){ 
    int x = octalToInt(octalStringX);
    int y = octalToInt(octalStringY);
    int z = (int)Math.pow(x,y);
    return intToOctal(z);}

  //Exponent for hexadecimal 
  public static String exponentHex(String hexadecimalStringX, String hexadecimalStringY){ 
    int x = hexToInt(hexadecimalStringX);
    int y = hexToInt(hexadecimalStringY);
    int z = (int)Math.pow(x,y);
    return intToHex(z);}
  
  
  //*******************Data Type Conversion***********************
  // The below section is for Int converting to binary, octal, and hexadecimal data types.
  
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
