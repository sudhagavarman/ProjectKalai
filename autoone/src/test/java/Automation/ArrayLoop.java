package Automation;

public class ArrayLoop {

    public static void main(String[] args) {
        int [] a ={45,60,78,100};
        String [] b = {"kalai","varman","kathir"};
        System.out.println(a[3]);
        System.out.println(b[1]);

       // for (int i=0;i<a.length;i++){
         //   System.out.println(a[i]);

            //for (int j=0;j<b.length;j++){
              //  System.out.println(b[j]);
        for(int t :a){
            System.out.println(t);

            for(String r:b){
                System.out.println(r);
            }
        }


            }
        }


