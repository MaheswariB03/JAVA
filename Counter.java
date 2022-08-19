class Counter1{
int count=0;//will get memory when instance is created 3.
Counter1(){
count++;
System.out.println(count);
}}
public class Counter {


public static void main(String args[]){ 
Counter1 c1=new Counter1();
Counter1 c2=new Counter1();
Counter1 c3=new Counter1(); 
}}


