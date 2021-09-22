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
    float z=0; //place holder for result
    float x, y = binaryToFloat(binaryStringX), binaryToFloat(binaryStringY);
    z=x+y;
    return floatToBinary(z);}
  //Addition for octal string types
  public static String addOctal(String octalStringX, String octalStringY){
   float z=0; //place holder for result
   float x, y = octalToFloat(octalStringX), octalToFloat(octalStringY);
   z=x+y;
   return floatToOctal(z);}
  //Addition for hexadecimal types
  public static String addHex(String hexadecimalStringX, String hexadecimalStringY){
   float z=0; //place holder for result
   float x, y = hexToFloat(hexadecimalStringX), hexToFloat(hexadecimalStringY);
   z=x+y;
   return floatToHex(z);}
    

  //**********************Subtraction***************************
  //Subtraction with int
  public static int subtractInt(int x, int y){return x-y;}
  //Subtraction with float
  public static float subtractFloat(float x, float y){return x-y;}
  //Subtraction for binary string types
  public static String subtractBinary(String binaryStringX, String binaryStringY){
   float z=0; //place holder for result
   float x, y = binaryToFloat(binaryStringX), binaryToFloat(binaryStringY);
   z=x-y;
   return floatToBinary(z);}
  //Subtraction for octal string types
  public static String subtractOctal(String octalStringX, String octalStringY){
   float z=0; //place holder for result
   float x, y = octalToFloat(octalStringX), octalToFloat(octalStringY);
   z=x-y;
   return floatToOctal(z);}
  //Subtraction for hexadecimal types
  public static String subtractHex(String hexadecimalStringX, String hexadecimalStringY){
   float z=0; //place holder for result
   float x, y = hexToFloat(hexadecimalStringX), hexToFloat(hexadecimalStringY);
   z=x-y;
   return floatToHex(z);}
    
 
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
    float x = binaryToFloat(binaryStringX);
    float y = binaryToFloat(binaryStringY);
    float z = divideFloat(binaryStringX, binaryStringY);
    return floatToBinary(z);}
  //Division with octal string type
  public static String octalBinary(String octalStringX, String octalStringY){
    float x = octalToFloat(octalStringX);
    float y = octalToFloat(octalStringY);
    float z = divideFloat(octalStringX, octalStringY);
    return floatToOctal(z);}
  //Division with hexadecimal 
  public static String hexBinary(String hexadecimalStringX, String hexadecimalStringY){
    float x = hexToFloat(hexadecimalStringX);
    float y = hexToFloat(hexadecimalStringY);
    float z = divideFloat(hexadecimalStringX, hexadecimalStringY);
    return floatToHex(z);}
  
  
  //************************Squareroot****************************
  //Squareroot for int
  public static int sqrtInt(int x){return (int)Math.sqrt((double)x);}
  //Squareroot for float
  public static float sqrtFloat(float x){return (float)Math.sqrt((double)x);}
  
  //************************Exponent*****************************
  //Exponent with int
  public static int exponentInt(int x, int y){return (int)Math.pow((double)x, (double)y);}
  //Exponent with float
  public static float exponentFloat(float x, float y){return (float)Math.pow((double)x, (double)y);}
  
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
  
  // The below section is for Float converting to binary, octal, and hexadecimal data types.
  
  //float to binary
  public static String floatToBinary(float number){ return Float.toBinaryString(number);} 
  //float to octal
  public static String floatToOctal(float number){ return Float.toOctalString(number);} 
  //float to hexadecimal
  public static String floatToHex(float number){ return Float.toHexString(number);}   
  //binary to float
  public static float binaryToFloat(String binaryString){ return Float.parseFloat(binaryString,2);} 
  //octal to float
  public static float octalToFloat(String octalString){ return Float.parseFloat(octalString,8);} 
  //hexadecimal to float
  public static float hexToFloat(String hexadecimalString){ return Float.parseFloat(hexadecimalString,16);}


}
