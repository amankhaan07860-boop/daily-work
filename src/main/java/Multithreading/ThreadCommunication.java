package Multithreading;

public class ThreadCommunication extends Thread {
    int total = 0;
//    int plus = 12;
    @Override
    public  void run() {
       synchronized (this) {
            for (int i = 0; i < 10; i++) {
                total = total + 100;
            }
            this.notify();
        }
    }
  }

