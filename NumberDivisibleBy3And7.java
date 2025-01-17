public class NumberDivisibleBy3And7 {

    public static void main(String[] args){

        int num = 21;

        if(num % 3 == 0 && num % 7 == 0){

            System.out.println(num + " Number is divisible by 3 & 7 ");
        }
        else if(num % 3 == 0){

            System.out.println(num + " Number is only divisible by 3 ");
        }
        else if(num % 7 == 0){

            System.out.println(num + " Number is only divisible by 7 ");
        }
        else{

            System.out.println(num + " Number is not divisible by both numbers ");
        }
    }
    
}
