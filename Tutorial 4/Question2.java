public class Question2 {


    public static void main(String[] args) {

        ftoc(33.8);

    }

    static void ftoc(double fahrenheit ){

      double celcius  =  (fahrenheit - 32) *5/9;

        System.out.println(fahrenheit+"F in Celcius is " +celcius+ "C");

    }
}
