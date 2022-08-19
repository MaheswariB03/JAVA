class S{
void m(){
System.out.println("method is invoked"); 
}
void n(){
this.m();}
void p(){
n();//complier will add this to invoke n() method as this.n()
}}
public class Prog18 {
	

public static void main(String args[])
{
S s1 = new S();
s1.p();
}
}




