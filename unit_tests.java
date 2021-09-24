

public class unit_tests{
    public static void main(String args[]){

        //***********Unit Tests for Addition*************
        System.out.println("***********Unit Tests for Addition*************");
        // addition test for int 10+5=15
        System.out.println(BasicArithmetic.addInt(10, 5));
        //addition test for float 10+5=15.0
        System.out.println(BasicArithmetic.addFloat(10, 5));
        //addition test for binary 1010+0101=1111
        System.out.println(BasicArithmetic.addBinary("1010", "0101"));
        //addition test for octal 12+5=17
        System.out.println(BasicArithmetic.addOctal("12", "5"));
        //addition test for hexidecimal 5+A=f
        System.out.println(BasicArithmetic.addHex("A", "5"));

       //***********Unit Tests for Subtraction*************
       System.out.println("***********Unit Tests for Subtraction*************");
       //Subtraction test for int 10-5=5
       System.out.println(BasicArithmetic.subtractInt(10, 5));
       //Subtraction test for float 10-5=5.0
       System.out.println(BasicArithmetic.subtractFloat(10, 5));
       //Subtraction test for binary 1010-0101=0101
       System.out.println(BasicArithmetic.subtractBinary("1010", "0101"));
       //Subtraction test for octal 12-5=5
       System.out.println(BasicArithmetic.subtractOctal("12", "5"));
       //Subtraction test for hexidecimal 5-A=5
       System.out.println(BasicArithmetic.subtractHex("A", "5"));

       //***********Unit Tests for Division*************
       System.out.println("***********Unit Tests for Division*************");
       //Division test for int 10/5=2
       System.out.println(BasicArithmetic.divideInt(10, 5));
       //Division test for float 10/5=2.0
       System.out.println(BasicArithmetic.divideFloat(10, 5));
       //Division test for binary 1010/0101=0010
       System.out.println(BasicArithmetic.divideBinary("1010", "0101"));
       //Division test for octal 12/5=2
       System.out.println(BasicArithmetic.divideOctal("12", "5"));
       //Division test for hexidecimal 5/A=2
       System.out.println(BasicArithmetic.divideHex("A", "5"));

       //***********Unit Tests for Multiplication*************
       System.out.println("***********Unit Tests for Multiplication*************");
       //Multiplication test for int 10*5=50
       System.out.println(BasicArithmetic.multiplicationInt(10, 5));
       //Multiplication test for float 10*5=50.0
       System.out.println(BasicArithmetic.multiplicationFloat(10, 5));
       //Multiplication test for binary 1010*0101=110010
       System.out.println(BasicArithmetic.multiplicationBinary("1010", "0101"));
       //Multiplication test for octal 12*5=62
       System.out.println(BasicArithmetic.multiplictionOctal("12", "5"));
       //Multiplication test for hexidecimal 5*A=32
       System.out.println(BasicArithmetic.multiplicationHex("A", "5"));

       //***********Unit Tests for Exponent*************
       System.out.println("***********Unit Tests for Exponent*************");
       //Exponent test for int 10^5=100000
       System.out.println(BasicArithmetic.exponentInt(10, 5));
       //Exponent test for float 10^5=100000.0
       System.out.println(BasicArithmetic.exponentFloat(10, 5));
       //Exponent test for binary 1010^0101=11000011010100000
       System.out.println(BasicArithmetic.exponentBinary("1010", "0101"));
       //Exponent test for octal 12^5=303240
       System.out.println(BasicArithmetic.exponentOctal("12", "5"));
       //Exponent test for hexidecimal 5^A=186a0
       System.out.println(BasicArithmetic.exponentHex("A", "5"));

       //***********Unit Tests for Squareroot*************
       System.out.println("***********Unit Tests for Squareroot*************");
       //sqr test for int 10^1/2=3
       System.out.println(BasicArithmetic.sqrtInt(10));
       //sqr test for float 10^1/2=3.16
       System.out.println(BasicArithmetic.sqrtFloat(10));
       //sqr test for binary 1010^10=11
       System.out.println(BasicArithmetic.sqrtBinary("1010"));
       //sqr test for octal 12^2=3
       System.out.println(BasicArithmetic.sqrtOctal("12"));
       //sqr test for hexidecimal A^2=3
       System.out.println(BasicArithmetic.sqrtHex("A"));

       //***********Unit Tests for Data Type Conversion*************
       System.out.println("//***********Unit Tests for Data Type Conversion*************");
         //int to binary 10 to 1010
         System.out.println(BasicArithmetic.intToBinary(10));
         //int to octal 10 to 12
         System.out.println(BasicArithmetic.intToOctal(10));
         //int to hexadecimal 10 to A
         System.out.println(BasicArithmetic.intToHex(10));
         //binary to int 1010 to 10
         System.out.println(BasicArithmetic.binaryToInt("1010"));
         //octal to int A to 10
         System.out.println(BasicArithmetic.octalToInt("12"));
         //hexadecimal to int A to 10
         System.out.println(BasicArithmetic.hexToInt("A"));



    }
}




