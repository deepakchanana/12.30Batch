package pkg1;

public class ClassB 
{
 public ClassB() 
 {
	 this(455);
	 this(34,5);
  System.out.println("Default constructor");
 }
 
 public ClassB(int a)
 {
	
	 System.out.println("one parameterized");
 }
 
 public ClassB(int a,int b)
 {
	 System.out.println("two parameterized");
 }
 public static void main(String[] args) 
 {
 ClassB obj=new ClassB();	
 }
}
