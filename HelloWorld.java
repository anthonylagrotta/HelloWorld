/**
 * Created by anthonylagrotta on 10/19/16.
 */

import java.util.*;
public class HelloWorld {
    public static void main(String args[]){
        HelloWorld caller = new HelloWorld();
        String name = caller.input();
        caller.output(name);

    }


    public String input(){
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name? ");
        String Aname = input.next();
        return Aname;
    }

    public void output(String aName){
        System.out.println("Hello "+aName+", I'm Java!");
    }

}