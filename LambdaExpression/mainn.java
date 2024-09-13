package java8.LambdaExpression;

public interface mainn {
     public void dispaly( String s);
}
class Main{
    public static void main(String[] args) {
        mainn m=( String s)->{
            System.out.println("main");
        };
       m.dispaly("meera");
    }
}