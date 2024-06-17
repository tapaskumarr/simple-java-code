class Main {

// create a method
  public static int square(int num) {

    // return statement
    return num * num;
  }
}
class Methodreturn
{

  public static void main(String[] args) {
    int result;

    // call the method
	Main obj=new Main();
	
    // store returned value to result
    result = obj.square(10);

    System.out.println("Squared value of 10 is: " + result);
  }
}