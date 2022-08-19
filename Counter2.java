class Counter3{
static int count=0;//will get memory only once and retain its value 3.
Counter3(){
count++;
System.out.println(count);
}}
public class Counter2 {


public static void main(String args[]){ 
Counter3 c1=new Counter3();
Counter3 c2=new Counter3();
Counter3 c3=new Counter3(); 
}
}

