package java8.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

*//* class MyComparator implements Comparator<Integer>{
     @Override
     public int compare(Integer o1, Integer o2) {
        *//**//* if(o1<o2) {
             return -1;
         } else if (o1>o2) {
             return +1;
         }
         else{
             return 0;
         }*//**//*
         return (o1<o2)?-1:(o1>o2)?1:0;
     }
 }*//*
public class LambdaExpressionExample01 {
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<>();
        l.add(20);
        l.add(10);
        l.add(15);
        l.add(25);
        l.add(30);
        l.add(0);
        l.add(50);
      //  System.out.println(l);
        Comparator<Integer> c= (o1,o2)->(o1<o2)?-1:(o1>o2)?1:0;
        Collections.sort(l,c);
        l.stream().forEach(System.out::println);
        List<Integer> l2 =l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l2);
    //    System.out.println(l);
    }
}*/
//Acending order
//10,20
//Decending order
//20,10
class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
       /* if(o1<o2)
        {
            return -1;
        }
        else if(o1>o2)
        {
            return 1;
        }
        else{
            return 0;
        }*/
        return (o1<o2)?-1:(o1>o2)?1:0;
    }
}
public class LambdaExpressionExample01{
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<>();
        l.add(10);
        l.add(0);
        l.add(15);
        l.add(20);
        l.add(25);
        l.add(50);
        System.out.println(l);
        List<Integer> l2 =   l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l2);
        Comparator<Integer>c=(o1,o2)->(o1<o2)?-1:(o1>o2)?1:0;
       //Collections.sort(l, new MyComparator());
       //System.out.println(l);
    }
}

