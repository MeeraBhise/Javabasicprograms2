package java8.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;

public class Employee1 {
    String name;
    int id;
   /* @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }*/
    Employee1(String name, int id)
    {
        this.name=name;
        this.id=id;
    }
    @Override
    public String toString()
    {
        return name+":"+ id;
    }
}
class test{
    public static void main(String[] args) {
        ArrayList<Employee1>l=new ArrayList<Employee1>();
        l.add(new Employee1("meerabhise",102));
        l.add(new Employee1("ranjeet",112));
        l.add(new Employee1("mehar",103));
        System.out.println(l);
      //  Employee1 e=new Employee1("meera",102);
      //  Collections.sort(l,(e1,e2)->(e1.id<e2.id)?-1:(e1.id>e2.id)?1:0);
        Collections.sort(l,(e1,e2)->(e1.name.compareTo(e2.name)));
        System.out.println(l);
    }
}