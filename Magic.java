public class Magic {
	public static void main(String[] args) {
    int myNumber = 789;

    /*
      "myNumber" will be refered to as the original number from now on...
      - for Documanetation purpose.
    */
		int magicOne = myNumber * myNumber;
    int magicTwo = magicOne + myNumber;
    int magicThree = magicTwo / myNumber;
    int magicFour = magicThree + 17;
    int magicFive =  magicFour - myNumber;
    int magicSix = magicFive / 6;
		
		
		
     /*
     3 will be printed to the console, 
     no matter what integer is choosen as the original number!
     */
		
		
		
		
    System.out.println(magicSix);
	}
}
