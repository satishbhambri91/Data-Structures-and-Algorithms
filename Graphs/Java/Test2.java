import java.util.*;
public class Test2 {
    public void doWork(Callback callback) {
        System.out.println("doing work");
        callback.call();
    }

    public interface Callback {
        void call();
    }
    public static void main(String[] args) throws  Exception {
        new Test2().doWork(new Callback() { // implementing class            
            @Override
            public void call() {
                System.out.println("callback called");
            }
        });
    }

    
}