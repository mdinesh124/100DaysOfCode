
class OverLoading
{
  void sum(int a,int b)
  {
   System.out.println("The sum is int "+(a+b));
  }
void sum(double a,double b)
  {
   System.out.println("The sum is double "+(a+b));
  }
void sum(float a,float b)
  {
   System.out.println("The sum is float "+(a+b));
  }
void sum(int a,float b)
  {
   System.out.println("The sum is float "+(a+b));
  }
public static void main(String args[])
{
 OverLoading ol = new OverLoading();
 ol.sum(10,20);
 ol.sum(10.0,18.0);
 ol.sum(10.0f,20.0f);
 ol.sum(10,20.0f);
}
}