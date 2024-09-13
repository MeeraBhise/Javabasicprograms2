package java8.LambdaExpression;

public class Test1 {
    public static void main(String[] args) {

                Runnable r = () -> {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("child thread");
                    }
                };
      /*  Runnable r = new Runnable() {
            @Override
            public void run() {

            for(int i=0;i<10;i++)
              {
                  System.out.println("child thread");
                }
             }
        };*/
                Thread t=new Thread(r);
                t.start();
                for(int i=0;i<10;i++)
                {
                    System.out.println("main thread");
                }
            }
        }

