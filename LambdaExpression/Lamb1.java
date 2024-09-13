package java8.LambdaExpression;
interface meh{
    void display();
}
public class Lamb1 {
    public static void main(String[] args) {
        meh g = () ->
        {
            System.out.println("java23");
        };
         g.display();
    }
}