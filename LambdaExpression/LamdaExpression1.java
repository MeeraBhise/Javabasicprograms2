package java8.LambdaExpression;

interface abcd
{
    void display();
}
public class LamdaExpression1 {
    public static void main(String[] args) {
        abcd ref=()->{
            System.out.println("test");
        };
        ref.display();
    }
}
