import java.util.Scanner;

public class Householdwaterusage {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int familyno = 5;
int houseno = 101;
double waterconsumed = 250;
char usagestatus = 'T';
System.out.println("Family No: " + familyno);
System.out.println("House No: " + houseno);
System.out.println("Water Consumed per Day: " + waterconsumed);
System.out.println("Usage Status per day: " + usagestatus);
int litres = 250;
if (litres <= 500) {
System.out.println("Water Bill: Rs.100");
} 
else {
System.out.println("Water Bill: Rs.200");
 }
int morninguse = 150;
int eveninguse = 100;
int total = morninguse + eveninguse;
System.out.println("Morning Use: " + morninguse);
System.out.println("Evening Use: " + eveninguse);
System.out.println("Total Water Use: " + total);
sc.close();
    }
}

