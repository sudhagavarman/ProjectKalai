package Automation;

public class CollcetionofCharacter {
    public static void main(String[] args) {
        String a = "Learn";
        String b="more";
        String c = "study";

        System.out.println(a.concat(b));
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.substring(1,4));


        String output = "Explicit wait";
        String name = output.substring(8,13);
        System.out.println(name);


        String str = "hello";
        int lengthofString = str.length();
        System.out.println(lengthofString);
        for (int i=0; i<lengthofString; i++) {
            char currentChar = str.charAt(i);
            System.out.println(currentChar);

        }



    }

}

