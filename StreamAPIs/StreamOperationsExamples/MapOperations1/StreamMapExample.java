package java8.StreamAPIs.StreamOperationsExamples.MapOperations1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Data{
     int id;
     String name;
     double Salary;
     String Address;

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                ", Address='" + Address + '\'' +
                '}';
    }

    public Data(int id, String name, double salary, String address) {
        this.id = id;
        this.name = name;
        Salary = salary;
        Address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return Salary;
    }

    public String getAddress() {
        return Address;
    }

    public static void main(String[] args) {
        List<Data> datalist = new ArrayList<>();
        datalist.add(new Data(1, "meera", 120000, "pune"));
        datalist.add(new Data(3, "ranjeet", 100000, "latur"));
        datalist.add(new Data(4, "mehar", 690000, "nanded"));
        datalist.add(new Data(8, "pari", 90000, "osmanabad"));
        System.out.println(datalist);
/*
        Map<Integer, String> map = datalist.stream().
                collect(Collectors.toMap(data1->data1.getId(),data2->data2.getName()));
        System.out.println(map);*/
       /* Map<Double,String> map=datalist.stream().
                collect(Collectors.toMap(data1->data1.getSalary(),data2->data2.getAddress()));
        System.out.println(map);*/
        /* Map<Integer ,Data> map=datalist.stream().
                 collect(Collectors.toMap(data1->data1.getId(),Data->Data));
        System.out.println(map);*/
        Map<Integer, Data> map = datalist.stream().
                collect(Collectors.toMap(data1->data1.getId(),Data->Data));
        System.out.println(map);
    }
}

