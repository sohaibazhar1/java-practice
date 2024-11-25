

public class Practice {

  int age = 2;
  public static void main(String[] args) {
    /*int i = 2;
    int j = -2;
    int el = 8 % 3 ; // 2
    //boolean logical = true;
    int sum = i+j;
    final double PI  = 3.141592653589793; 
    final char Capital_A = 'A';  //use ' ' instead of ""
    double area = PI * i * i ;  // 12.566370614359172
*/
/* 
    int Alo = 20;
    int Ali = 2; 

    if (Alo > Ali) {System.out.println( "Alo is taller than Ali."); }
    if (Alo == Ali) {System.out.println( "Alo and Ali have same height! "); }  //==
    else{System.out.println("Ali is Taller than Alo.");}
*/
  /*
    double dividend = 20;
    double divisor = 2;
    if(divisor != 0){double quotient = dividend / divisor;   //!= unqual
    System.out.println(quotient);}
 */

 /*
    Random random = new Random();
    int buttonPressed = random.nextInt(4) + 1;
    String message;
    switch(buttonPressed) {
      case 1:
          message = "Button 1 pressed!";
          break;
      case 2:
          message = "Button 2 pressed!";
          break;
      case 3:
          message = "Button 3 pressed!";
          break;
      case 4:
          message = "Button 4 pressed!";
          break;
      default:
          message = "Something else pressed"; // Technically unreachable with the current random range
  }
  System.out.println(message);

  */
  
    /*
    String message;
    if (buttonPressed == 1) {message = "Button 1 pressed! ";}
    else if (buttonPressed == 2){message = "Button 2 pressed! ";}
    else if (buttonPressed == 3){message = "Button 3 pressed! ";}
    else if (buttonPressed == 4){message = "Button 4 pressed! ";}
    else {message = "Something Else pressed" ;}
    System.out.println(message);
    */


       /*  
    byte b = 45;
    short s = b;
    int ii = s;
    long l = i;
    float f = l;
    double d = f;
   

    Explicit Type Casting when date is lost
    double ex = (double)13/ (double)5;  // 2.6  
    int x = (int) ex;                   // 2  
    Implicit Type Casting when date is not lost
    int alpha = 13 / 5; // = 2
    double beta = 13.0 / 5.0; // = 2.6
    
    double twopower10 = Math.pow(2,10) ; // always double when math.pow
*/
/*
    System.out.println("While Loop");
    int i = 1;
    while (i<5) {
      System.out.println(i);
      i++;
    }
*/
/*
    System.out.println("For Loop");
    for (int j = 1  ; j<=5 ; i++) {
      System.out.println("Sohaib is great. x" + j);
      j++;
    }
*/

      Practice object1 = new Practice();
      System.out.println(object1.age);
      System.out.println();

      myMethod("Ali");
      System.out.println("age = " + myMethod2(2));
      
      int myNum1 = plusMethod(8, 5);
      double myNum2 = plusMethod(4.3, 6.26);
      System.out.println("int: " + myNum1);
      System.out.println("double: " + myNum2);

      
  } // main method ends here <<----


  // void means method should return no value
  static void myMethod(String fname) {
      System.out.println(fname + " Don");

  }

  static int myMethod2(int edad) {  // when void is not used it returns a value (in this case int)
    return 20 + edad ;

}
  static int plusMethod(int xx, int yy) {
    return xx + yy;
  }

  static double plusMethod(double xx, double yy) {
    return xx + yy;
  }
}  






