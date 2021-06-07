//Hierarchical Inheritance
class Parent
{
  void parent()
  {
   System.out.println("This is parent class");
  }

}

class Child1 extends Parent
{
  void child1()
  {
   System.out.println("This is child1 class");
  }

}
class Child2 extends Parent
{
  void child2()
  {
    System.out.println("This is child2 class");
  }
}
class Hierarchical
{
  public static void main(String args[])
  {
    Child1 c1 = new Child1();
    Child2 c2 = new Child2();
    c1.parent();
    c2.parent();
  }

 
}