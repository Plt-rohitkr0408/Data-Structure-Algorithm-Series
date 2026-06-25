
package JavaProgramTesting;


public class MultiThreading {

    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();

        t1.start();
        try{
              t1.join();
        }catch(Exception e)
        {

        }
        t2.start();
    }
}
 
class Mythread extends Thread{
   
    @Override
    public void run() {
            
        
        for(int i=0; i< 1001; i++){
           System.out.println("count " +  count++ + " "+ Thread.currentThread().getName());
            
        }

    }
}