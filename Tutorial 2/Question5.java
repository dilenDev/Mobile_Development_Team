public class Question5{
public static void main(String args[]){

String name;
int itemsSold;
int itemsPrice;
int salesmanNumber;

Scanner input = new Scanner(System.in);	

System.out.print("Enter your name ");
name = input.next();

System.out.print("Enter your Number ");
salesmanNumber = input.nextInt();

System.out.print("Enter no of units sold ");
unitsSold = input.nextInt();

System.out.print("Enter item Price ");
unitPrice = input.nextInt();

int salesValue = itemsSold * itemsPrice; 

System.out.print("name "+name + "number " + salesmanNumber + "value " + salesValue );
}
}
