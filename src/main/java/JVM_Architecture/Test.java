package JVM_Architecture;

public class Test {
    public static void main(String[] args) throws Exception {

        CustomClassLoader loader = new CustomClassLoader();

        Class<?> c = loader.loadMyClass("Demo");

        Object obj = c.getDeclaredConstructor().newInstance();

        c.getMethod("show").invoke(obj);

        System.out.println("Loaded by: " + c.getClassLoader());
    }
}
