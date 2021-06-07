public class Complex
{
 double real;
 double img;

 public Complex(double real, double img)
 {
  this.real=real;
  this.img=img;
 }

 public static void main(String args[])
 {
   Complex c1=new Complex(2.5, 5.2);
   Complex c2=new Complex(4.3, 2.3);
   Complex temp;
   temp=add(c1,c2);
   System.out.println("Sum = " +  temp.real+" + "+ temp.img +"i");

 }
 public static Complex add(Complex c1, Complex c2)
 {

Complex temp = new Complex(0.0,0.0);
  temp.real=c1.real+c2.real;
  temp.img=c1.img+c2.img;
  return(temp);
 }
}
