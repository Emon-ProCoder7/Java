public class Calculator{
  
  public Calculator(){

  }


/*
This is an Abacus that is used to slide beads around and do math.
It was created by Laura in 2019.
*/



  public double add(int a, int b){
    return a + b;
  }
  
  public double subtract(int a, int b){
    return a - b;
  }

  public double multiply(int a, int b){
    return a * b;
  }

  public double divide(int a, int b){
    return a / b;
  }

  public int modulo(int a, int b){
    return a % b;
  }





  public static void main(String[] args){
    Calculator myCalculator = new Calculator();

    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
    System.out.println(myCalculator.multiply(5,7));
    System.out.println(myCalculator.divide(24, 12));

  }



}
