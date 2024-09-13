package java8.LambdaExpression;
 interface Java12
 {
     void Displayy(String s,int a);
 }
public class LambdaExpression12 {
    public static void main(String[] args) {
      Java12 ref=(String st, int bb)-> {
          System.out.println("String:"+st+ "Int :"+bb);
        };
        ref.Displayy("meera",101);
    }
}
