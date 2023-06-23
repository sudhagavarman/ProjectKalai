package Automation;

import io.cucumber.java.sl.In;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {

        List <Integer>  l = new ArrayList<Integer>();
        l.add(50);
        l.add(60);
        System.out.println(l);
        l.add(100);
        System.out.println(l);
        l.add(99);
        System.out.println(l);
        System.out.println(l.get(2));

        for (int i=0; i< l.size();i++){
            System.out.println(l.get(i));
            for(int y:l){
                System.out.println(y);

                List<String> h = new ArrayList<>();
                h.add("good job");
                h.add("good salery");
                System.out.println(h);
            }

            }
    }
            }


