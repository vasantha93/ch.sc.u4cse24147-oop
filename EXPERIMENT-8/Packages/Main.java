import subtract.Subtract; 
import add.Add; 
public class Main{ 
public static void main(String[] args){ 
Add d = new Add(); 
Subtract s = new Subtract(); 
d.a = 2; 
d.b = 3; 
System.out.println(d.addition()); 
s.a = 5; 
s.b = 4; 
System.out.println(s.subtraction()); 
} 
}