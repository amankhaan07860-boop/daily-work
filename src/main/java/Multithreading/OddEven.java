package Multithreading;

 class Print {
     int num = 1;

     public synchronized void odd() throws Exception {
         while (num <10) {
             if (num % 2 == 0) wait();
             System.out.println("odd :" + num++);
             notify();
         }
     }


     public synchronized void even() throws Exception {
         while (num < 10) {
             if (num % 2 != 0) wait();
             System.out.println("even :" + num++);
             notify();
         }
     }
 }
     public class OddEven {
         public static void main(String[] args) {


             Print p = new Print(); // shared object
             new Thread(() -> {
                 try {
                     p.odd();
                 } catch (Exception e) {
                 }
             }).start();

             new Thread(() -> {
                 try {
                     p.even();
                 } catch (Exception e) {
                 }
             }).start();
         }
     }


