//This class is used to test the functioning of all the generic classes in Generic SRC
import java.util.Scanner;
import java.sql.Timestamp;
public class tester {
	


	
	//Used to create objects of all types
public static void main(String[]args) {
String newString;
int newInteger;
Scanner input = new Scanner(System.in);
System.out.println("Entre un integer");
newString = input.nextLine();
System.out.println(newString);
System.out.println("Entre un autre chiffre");
newString = input.nextLine();
System.out.println(newString);
java.sql.Timestamp timestamp;  
timestamp = new Timestamp(System.currentTimeMillis());
System.out.print(timestamp);
	
}
	
}
