package java8.LambdaExpression;

import java.util.stream.Stream;

interface  Stringisempty
{
        void check(String s);
    }
public class ChechStringIsEmptyOrNot {
    public static void main(String[] args) {
     Stringisempty ref=(String s)->{
         s.isEmpty();
         if(s ==null)
         {
             System.out.println("is empty");
         }
         else{
             System.out.println("not empty");
         }
     };
     ref.check("");
    }
}
