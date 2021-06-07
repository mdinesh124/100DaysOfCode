//A class can be inherit from an interface using keyword implement.
interface Calculator
{
 int add(int a,int b);
   int sub(int a,int b);
   int mul(int a,int b);
   int div(int a,int b);
}
class BasicCalculator implements Calculator
{
   public int add(int a,int b)
  {
    return a+b;
  }
   public int sub(int a,int b)
  {
    return a-b;
  }
   public int mul(int a,int b)
  {
    return a*b;
  }
  public int div(int a,int b)
  {
    return a/b;
  }
 public static void main(String args[])
 {
  BasicCalculator bc = new BasicCalculator();
  System.out.println("Addition is "+ bc.add(10,20));
  System.out.println("Substraction is "+ bc.sub(20,10));
  System.out.println("Multiplication is "+ bc.mul(10,20));
  System.out.println("Division is "+ bc.div(20,10));
  
 }
}