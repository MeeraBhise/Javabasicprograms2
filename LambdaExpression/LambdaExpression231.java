package java8.LambdaExpression;

interface Java23
{
    void run(String s,String m);
}

public class LambdaExpression231 {
    public static void main(String[] args) {
       Java23 ref=(String s,String s1)->
       {
           System.out.println("String1:"+s+"String2:"+s1);
       };
        ref.run("meeera","mehae");
    }
}
