package JMM;

class Volatile {
    static volatile boolean flag = false;

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            while (!flag) {
            }
            System.out.println("Flag changed!");
        });

        Thread t2 = new Thread(() -> {
            try { Thread.sleep(1000); } catch (Exception e) {}
            flag = true;
            System.out.println("Flag updated");
        });

        t1.start();
        t2.start();
    }
}
