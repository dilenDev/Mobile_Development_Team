public class Question1{

    public static void main(String[] args) {

        int base;
        int power;
        int result = 1;

      Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        base =input.nextInt();


        System.out.println("Enter power: ");
        power =input.nextInt();

        while (power > 0){
            result = result * base;
            power --;
        }

        System.out.println("result = "+result);


    }
}
