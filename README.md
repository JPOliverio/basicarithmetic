# BasicArithmetic

This is a reusable library of basic arithmetic functions including addition, Subtraction, Multiplication, Division, Exponents, and Data Type Conversion. The library supports arithmetic on the following data types: int, float, binary, octal, and hexadecimal.

The data types for binary, octal, and hexadecimal are in the forms of strings.

To use this library simply call the class name followed by the method name. For example if you want to add two hexadecimal numbers together you would call it from the BasicArithmetic class as: BasicArithmetic.addHex(number1, number2). Notes the values for hexidecimal numbers are strings.

The Divison methods where built so that any time a value is divide by zero it will return the largest number possible to represent infinity. float data types can represnt infinity but the other just give the largest possibl value for an int. This was done to support reusability.

When the class performce arithmetic it converts the values for data types binary, octal, and hexadecimal to an int data types. Then it performes the operation and converts the results back to a binary, octal, or hexadecimal types.


