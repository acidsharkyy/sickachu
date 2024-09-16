import java.io.*;

public class HelloWorld {

    static int add(int a, int b) {
        return a+b+2;
    }

    int subtract(int a, int b){
        return a-b;
    }

    public static void main(String args[]) throws IOException{
        System.out.println(add(3,5));
    }

}