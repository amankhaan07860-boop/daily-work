package JMM;

class Ordering {
    static int x = 0;
    static boolean flag = false;

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            x = 10;
            flag = true;
            System.out.println(flag);
   
        });

        Thread t2 = new Thread(() -> {
            if (flag) {
                System.out.println(x);
            }
        });

        t1.start();
        t2.start();
    }
}
