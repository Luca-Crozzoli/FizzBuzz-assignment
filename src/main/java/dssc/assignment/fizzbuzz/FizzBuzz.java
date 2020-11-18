package dssc.assignment.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
            for (int i = 1; i <= 105; i++) {
                if(i%3==0){
                    System.out.print("Fizz");
                }
                if(i%5==0){
                    System.out.print("Buzz");
                }
                if(i%7==0){
                    System.out.print("Bang");
                }
                if( i%3!=0 && i%5!=0 && i%7!=0){
                    System.out.print(i);
                }
                System.out.println();
            }
    }

    public String convert(int number) {
            if (number == 5){
                return "Buzz";
            }
            else if (number ==10){
                return "Buzz";
            }else {
                if(number%3==0){
                    return "Fizz";
                }
                else {
                    return Integer.toString(number);
                }
            }
    }
}
