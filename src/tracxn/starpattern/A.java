package tracxn.starpattern;
import java.time.Instant;

public class A {
    public static void main(String[] args) {
        System.out.println(String.format("%.3f",(double)Instant.now().toEpochMilli()/1000));

        String s=String.format("%.3f",(double)Instant.now().toEpochMilli()/1000);

        int a=0;

       int i=0;
       String t="";
        for(i=0;i<s.length();i++){

            char c=s.charAt(i);
            t=c+"";

            a+=Integer.parseInt(t);
        }

    }
}
