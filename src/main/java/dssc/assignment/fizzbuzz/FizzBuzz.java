package dssc.assignment.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
            for (int i = 1; i <= 105; i++) {
                if (((i % 3) == 0) && ((i % 5) == 0) && ((i % 7) == 0)) { //multiple of 3 5 and 7?
                    System.out.println("fizzBuzzBang");
                } else if (((i % 5) == 0) && ((i % 7) == 0)) { // multiple of 5 and 7?
                    System.out.println("BuzzBang");
                } else if (((i % 3) == 0) && ((i % 7) == 0)) { //multiple of 3 and 7?
                    System.out.println("FizzBang");
                } else if ((i % 7) == 0) {//multiple of 7?
                    System.out.println("Bang");
                } else {
                    System.out.println(i);
                }
            }
    }
}
