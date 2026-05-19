package JVM_Architecture;

public class ClassLoaderr {
    void show(){
        System.out.println("Loaded by Default class Loader");
    }

    public static void main(String[] args) {
        ClassLoaderr load = new ClassLoaderr();
        load.show();
        System.out.println(load.getClass().getClassLoader());
    }
}
