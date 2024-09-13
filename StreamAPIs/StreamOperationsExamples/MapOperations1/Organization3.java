package java8.StreamAPIs.StreamOperationsExamples.MapOperations1;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class Organization3 {
    String name;
    String Address;
    int id;
    long phonenumber;
 public Organization3(String name,String Address,int id,long phonenumber)
 {
     this.name=name;
     this.Address=Address;
     this.id=id;
     this.phonenumber=phonenumber;
 }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public int getId() {
        return id;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    @Override
    public String toString() {
        return "Organization3{" +
                "name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", id=" + id +
                ", phonenumber=" + phonenumber +
                '}';
    }
}
 class Test
 {
     public static void main(String[] args) {
         ArrayList<Organization3>l=new ArrayList<>();
         l.add(new Organization3("meera","pune",101,92378437));
         l.add(new Organization3("ranjeet","latur",102,92378437));
         l.add(new Organization3("mehar","aurangabad",105,92378437));
         l.add(new Organization3("vinayak","nanded",106,92378437));
         l.add(new Organization3("pooja","mumbai",107,92378437));
         System.out.println(l);
     Set<String> l1= (Set<String>) l.stream().map(e->e.getName()).distinct().collect(Collectors.toList());
         System.out.println(l);
        }
 }