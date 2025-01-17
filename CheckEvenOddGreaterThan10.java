public class CheckEvenOddGreaterThan10 {

    public static void main(String[] args){

        int num = 45;

        if(num %2==0 && num > 10){

            System.out.println(num +" Number is even and greater than 10");
        }
        else if(num %2 == 0 && num < 10){

            System.out.println(num + " Number is even and smaller than 10");
        }
        else if(num == 10){

            System.out.println(num + " Number is even and Equal to 10");
        }
        else if(num > 10){

            System.out.println(num + " Number is odd and greater than 10");
        }
        else{

            System.out.println(num + " Number is odd and smaller than 10");
        }

           
    }
    
}
