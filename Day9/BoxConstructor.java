class Box
{
  private double length,breadth,height;
  Box()
  {
     length = 10.0;
     breadth= 20.0;
     height = 30.0;
  }
public double volume()
{
  return length*breadth*height;
}

}
public class BoxConstructor
{
public static void main(String args[])
{
   Box b1 = new Box();
   System.out.println("Volume of box is:"+b1.volume());
}
}