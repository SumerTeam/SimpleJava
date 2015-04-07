package Lesson_4;

import java.io.IOException;

public class Arcane1 {  
    public static void main(String[] args) {  
        try {  
            System.out.println("Hello world");  
        } catch(IOException e) {  
            System.out.println("I've never seen println fail!");  
        }  
        /*
         * In this example,catch statement catch a checkedException,but try statement throw any checkedException.
         */
    }  
}  
  
class Arcane2 {  
    public static void main(String[] args) {  
        try {  
            // If you have nothing nice to say, say nothing  
        } catch(Exception e) {  
            System.out.println("This can't happen");  
        }  
        /*
         * You can see there is anything in the try statement,at the same time catch statement print anything 
         * So this program print anything.
         */
    }  
}  
  
interface Type1 {  
    void f() throws CloneNotSupportedException;  
}  
  
interface Type2 {  
    void f() throws InterruptedException;  
}  
  
interface Type3 extends Type1, Type2 {  
}  
  
class Arcane3 implements Type3 {  
    public void f() {  
        System.out.println("Hello world");  
    }  
    public static void main(String[] args) {  
        Type3 t3 = new Arcane3();  
        t3.f();  
    }  
}  
