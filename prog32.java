


class Bike4{
final void run()
{
System.out.println("running");
}
}

class Honda extends Bike4{
void run()
{
System.out.println("running safely with 100kmph");
} 
}

public class prog32 {
public static void main(String args[]){
Honda honda= new Honda();
honda.run();
}
}

