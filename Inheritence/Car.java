    package Inheritence;

    public class Car{
        public void honk(){
            System.out.println("Car horn : Beep Beep!");
        }
    }

    class Vehicle extends Car {
        public void startcar(){
            System.out.println("Vehicle engine started.");
        }
        public static void main(String args[]){
            Vehicle V = new Vehicle();
            V.startcar();
            V.honk();    
        }
    }
