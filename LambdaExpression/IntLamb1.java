package java8.LambdaExpression;

/*
interface IntLambda{
    int addition(int a,int b,int c);
    //void dd();
}
public class LambdaWithInt {
    public static void main(String[] args) {
        IntLambda obj = (int mm, int vv, int ll) -> {
            int d = mm + vv + ll;
            return d;
        };
        int lllllll = obj.addition(10, 20, 30);
        System.out.println("Addition of 3 numbers is "+lllllll);
    }
}
*/
/*  interface Intlambda12
{
   int addition(int a,int b,int c);
}
public class IntLamb1 {
    public static void main(String[] args) {
      Intlambda12 ref=(int aa, int bb, int cc)->{
          int d=aa+bb+cc;
          return d;
      };
     int s= ref.addition(100,200,300);
        System.out.println("addition "+s);

}
}*/
interface Ab
{
    boolean test(String s);
}
class Java implements Ab {
    @Override
    public boolean test(String s) {
        return false;
    }
    public static void main(String[] args) {
        Ab f=( String s)->{
            System.out.println("abstract method");
            return false;
        };
  //  f.test("meera");
        System.out.println(f.test("meera"));
    }

}
