package JVM_Architecture;

public class MethodInline {

        public static int add(int a, int b) {
            return a + b;
        }

        public static void main(String[] args) {
//            int result = add(2, 3);
//            System.out.println(result);
                int result = 2 + 3;   // 👈 method inline ho gaya
                System.out.println(result);
            }

        }

