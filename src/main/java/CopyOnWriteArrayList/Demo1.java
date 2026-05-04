package CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> cop = new CopyOnWriteArrayList<>();
        cop.add(1);
        cop.add(2);
        cop.add(3);
        System.out.println("Number : "+cop);

        for (Integer i : cop){
            System.out.println("All numbers : "+i);
            if(i.equals(3)){
                cop.add(4);
                System.out.println("added new number");
            }
        }
        System.out.println("All number is : "+cop);
    }
}