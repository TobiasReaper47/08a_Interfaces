package com.cc.java;

import com.cc.java.bees.Drone;
import com.cc.java.bees.HoneyBee;
import com.cc.java.bees.Queen;
import com.cc.java.bees.Worker;

public class App {
    
    public static void main(String[] args) {
     

        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone(); 

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);

        // HoneyBee ist abstrakt --> Fehler!
        // HoneyBee bee = new HoneyBee(); 
       
    }

    // 2. Iteration: Polymorphie
    private static void pollObj(HoneyBee obj){
        output(obj.doYourJob());
        output(obj.fly());
        output("-------------------");
    }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    }


}

