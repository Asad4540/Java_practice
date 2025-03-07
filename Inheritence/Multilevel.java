package Inheritence;

class ClassA{
    public void DispA(){
        System.out.println("Disp() function of Class A");
    }
}

class ClassB extends ClassA {
    public void DispB(){
        System.out.println("Disp() function of Class B");
    }
} 

class Multilevel extends ClassB{
    public void DispC(){
        System.out.println("Dsip() funtion of Class C");
    }
    public static void main (String args[]){
        Multilevel c = new Multilevel();
        c.DispA();
        c.DispB();
        c.DispC();
    }
}
