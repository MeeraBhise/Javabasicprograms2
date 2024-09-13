package java8.FunctionalInterface;

public class StaticAndDefaultMethods1 {
    interface  Abcd{
        void test();
        default   void run(){

        }
        static void eat()
        {

        }

    }
    class A1 implements Abcd
    {
        @Override
        public void test() {

        }
    }
    class A2 implements Abcd
    {
        @Override
        public void test() {
        }
    }
    class A3 implements Abcd
    {
        @Override
        public void test() {
        }
    }
    class A4 implements  Abcd
    {
        @Override
        public void test() {
        }
    }
    public class WhyWeNeedDefaultAndStaticMethods {

    }

}
