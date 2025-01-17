public class CaseCheck {

    public static void main(String[] args){

        char ch = 's';

        if(ch >='A' && ch <='Z'){

            System.out.println(ch + " - Char is in Upper Case ");
        }
        else if(ch >='a' && ch <='z'){

            System.out.println(ch + " - Char is in Lower Case ");
        }
        else{

            System.out.println( " Invalid Input");
        }
    }
    
}
