package java8.LambdaExpression;
interface  Calculator{
     void SumOfTwoNumbers(int a,int b);
}
public class SumOfTwoNumbersExamp {
    public static void main(String[] args) {
  Calculator ref=(int c,int n)->{
      int d=c+n;
      System.out.println("sum of two no is:"+d);
  };
ref.SumOfTwoNumbers(1067,2750);
    }
}
