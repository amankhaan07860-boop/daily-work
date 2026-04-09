package Java17.patternmatching;

public class Example {
    public static void main(String[] args) {
        Object obj = 6;


        if (obj instanceof String s){
            if (s.length() > 5){
                System.out.println(s.toUpperCase());
            }
        }
        else if (obj instanceof Integer i){
            System.out.println(i * i);
        }
    }

}